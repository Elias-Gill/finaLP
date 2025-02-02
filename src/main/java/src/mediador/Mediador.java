package src.mediador;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import src.bankServer.BankServer;
import src.bankServer.data.Cuenta;
import src.bankServer.regsYcomprobs.DatosComprobante;
import src.bankServer.regsYcomprobs.Deposito;
import src.bankServer.regsYcomprobs.PagoServicio;
import src.bankServer.regsYcomprobs.Transferencia;
import src.gui.comprobante.Comprobante;

public class Mediador {

	private BankServer server = new BankServer();
	public Cuenta cuentaActiva;

	/**
	 * Metodo para realizar una nueva transferencia entre cuentas.
	 *
	 * @param nroCuentaDestino
	 * @param monto
	 * @param pin
	 * @return
	 * @throws Exception
	 */
	public Comprobante NuevaTransferencia(int nroCuentaDestino, int monto, int pin) throws Exception {
		System.out.println(nroCuentaDestino + "\t" + cuentaActiva.nroCuenta);
		// revisar que las cuentas no sean iguales
		if (Integer.compare(nroCuentaDestino, cuentaActiva.nroCuenta) == 0) {
			throw new RuntimeException("Cuenta destino es la misma cuenta del usuario");
		}
		if (monto <= 0) {
			throw new RuntimeException("Monto no puede ser negativo o 0");
		}
		DatosComprobante d = server.NuevaTransferencia(
		    new Transferencia(cuentaActiva.cedula, nroCuentaDestino, monto, pin));
		// actualizar los datos de la cuenta activa
		this.cuentaActiva = server.IniciarSesion(cuentaActiva.contrasena, cuentaActiva.cedula);
		return new Comprobante(d);
	}

	/**
	 * Metodo para realizar un nuevo deposito a la cuenta activa
	 *
	 * @param monto
	 * @return
	 * @throws RuntimeException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Comprobante NuevoDeposito(int cuenta, int monto)
	    throws RuntimeException, ClassNotFoundException, SQLException {
		// monto no puede ser negativo
		if (monto <= 0) {
			throw new RuntimeException("Monto no puede ser negativo o 0");
		}
		DatosComprobante d = server.NuevoDeposito(new Deposito(cuenta, monto));
		// actualizar los datos de la cuenta activa
		this.cuentaActiva = server.IniciarSesion(cuentaActiva.contrasena, cuentaActiva.cedula);
		return new Comprobante(d);
	}

	/**
	 * metodo para consultar el saldo actual de la cuenta dentro del servidor
	 *
	 * @param saldo
	 * @return
	 * @throws SQLException
	 * @throws RuntimeException
	 * @throws ClassNotFoundException
	 */
	public Comprobante ConsultaSaldo(int saldo) throws SQLException, ClassNotFoundException, RuntimeException {
		DatosComprobante d = new DatosComprobante();
		d.concepto = "Consulta de Saldo";
		d.cuentaDestino = 0;
		d.fecha = LocalDate.now();
		d.monto = saldo;
		d.metodo = "consultaSaldo";
		server.ConsultaSaldo(d);
		// actualizar los datos de la cuenta activa
		this.cuentaActiva = server.IniciarSesion(cuentaActiva.contrasena, cuentaActiva.cedula);
		return new Comprobante(d);
	}

	/**
	 * Metodo para iniciar sesion de un usuario. Guarda la cuenta activa de la sesion dentro de
	 * la variable cuentaActiva.
	 *
	 * @param contrasena
	 * @param cedula
	 * @return
	 * @throws Exception
	 */
	public Cuenta IniciarSesion(String contrasena, int cedula) throws Exception {
		// actualizar los datos de la cuenta activa
		this.cuentaActiva = server.IniciarSesion(contrasena, cedula);
		return cuentaActiva;
	}

	/**
	 * Metodo para pagar un servicion externo (como copaco, ANDE, etc)
	 *
	 * @param pin
	 * @param servicio
	 * @param monto
	 * @param metodo
	 * @return
	 * @throws Exception
	 */
	public Comprobante PagarServicio(int pin, String servicio, int monto, String metodo)
	    throws Exception {
		if (monto <= 0) {
			throw new RuntimeException("Monto no puede ser negativo o 0");
		}
		DatosComprobante d = server.PagarServicio(
		    new PagoServicio(monto, servicio, cuentaActiva.nroCuenta, pin, metodo));
		// actualizar los datos de la cuenta activa
		this.cuentaActiva = server.IniciarSesion(cuentaActiva.contrasena, cuentaActiva.cedula);
		return new Comprobante(d);
	}

	/**
	 * Realizar el pago de la deuda de la tarjeta del usuario activo
	 *
	 * @param monto
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 * @throws RuntimeException
	 */
	public Comprobante PagarTarjeta(int monto) throws SQLException, ClassNotFoundException, RuntimeException {
		if (monto <= 0) {
			throw new RuntimeException("Monto no puede ser negativo o 0");
		}
		DatosComprobante d = server.PagarTarjeta(cuentaActiva.cedula, monto);
		// actualizar los valores de la cuenta activa en el mediador
		this.cuentaActiva = server.IniciarSesion(cuentaActiva.contrasena, cuentaActiva.cedula);
		return new Comprobante(d);
	}

	/**
	 * Metodo que retorna todos los registros asociados a una cuenta especifica dentro de un
	 * ArrayList.
	 *
	 * @param cedula
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<DatosComprobante> getRegistrosCuenta() throws SQLException {
		return server.getRegistrosCuenta(cuentaActiva.nroCuenta);
	}
}
