Esta clase contendra las operaciones para conectarse con la base de datos de la aplicacion
cada clase cuenta con una implementacion para manejar excepciones, por lo que se usara 
la herramienta de java throws exception y el bloque try catch para el manejo de estos

### obtenerCuentaCedula(documentoIdentidad)
recibe el documento de identidad de la cuenta que sera buscada en la base de datos
retorna un objeto de tipo Cuenta que sera la cuenta que tiene la misma cedula de identidad

busca en la base de datos la cuenta con el documento de identidad deseado y se retorna
si no se encuentra a esa cuenta, se arrojara una excepcion del tipo SQLException con un mensaje que 
indica que no se pudo hallar la cuenta
 
### obtenerCuentaCedula(nroCuenta)
recibe el numero de la cuenta que sera buscada en la base de datos
retorna un objeto de tipo Cuenta que sera la cuenta que tiene la misma cedula de identidad

busca en la base de datos la cuenta con el documento de identidad deseado y se retorna
si no se encuentra a esa cuenta, se arrojara una excepcion del tipo SQLException con un mensaje que 
indica que no se pudo hallar la cuenta

### setSaldoCuenta(monto,cedula)
recibe el monto que se va a introducir a la cuenta, recibe tambien la cedula de identidad de la cuenta
no retorna nada

busca la cuenta con el mismo numero de cedula y actualiza su saldo

### setSaldoTarjeta(monto,cedula)
recibe el monto que se va a introducir a la cedula de la cuenta, recibe tambien la cedula de identidad de la cuenta
no retorna nada

busca la cuenta con el mismo numero de cedula y actualiza el saldo de la tarjeta de credito de la cuenta

### iniciarBaseDeDatos()
no recibe nada
no retorna nada

se conecta con la base de datos, si no se puede conectar arrojara una excepcion del tipo ClassNotFoundException
si ocurre un error arrojara una SQLException

### pagarTarjeta(monto,cedula)
recibe el monto con el que se pagara la deuda de la tarjeta
no retorna nada

se conecta con la base de datos y se busca dentro de esta la cuenta con el mismo numero de cedula
se actualiza la deuda de la tarjeta de la cuenta

si ocurre un error en el pago de la tarjeta se lanza un mensaje de error
si el monto a pagar es mayor que la deuda se lanza una excepcion RuntimeException que indica que el monto no es valido
si no se encontro la cuenta tambien se lanza esa excepcion

### setDeudaTarjeta(monto,cedula)
recibe el monto que se va a pagar de la deuda dentro de la tarjeta y la cedula de la cuenta que sera buscada dentro de la base de datos
no retorna nada

