package src.bankServer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import src.bankServer.regsYcomprobs.DatosComprobante;

public class generadorRegistro {

	private Connection cn;

	generadorRegistro(Connection c) {
		cn = c;
	}

	// genera un nuevo registro de alguna operacion dentro de la base de datos
	public void nuevoRegistro(DatosComprobante datos) throws SQLException {
		datos.idComprobante = datos.hashCode();
		PreparedStatement ps = cn.prepareStatement("INSERT INTO registro VALUES(?, ?, ?, ?, ?, ?, ?, ?);");

		ps.setInt(1, datos.idComprobante);
		ps.setInt(2, datos.cuentaDestino);
		ps.setInt(3, datos.monto);
		ps.setString(4, datos.fecha.toString());
		ps.setString(5, datos.metodo); // forma pago
		ps.setString(6, datos.concepto);
		ps.setString(7, datos.idServicio);
		ps.setInt(8, datos.cuentaOrigen);
		ps.executeUpdate();
	}
}
