//Este import sirve para importar la clase Scanner del paquete java.util
import java.util.scanner;

//Esto define una nueva clase llamada facturaRestaurante.
public class facturaRestaurante {

    //esta linea define el metodo principal del programa.
    public static void main(String[] args) {

        //Esta linea crea un objeto "Scanner" llamado "scanner" que se utiliza para leer la entrada del usuario desde la consola.
        Scanner scanner = new Scanner(System.in);

        //Esta linea imprime un menseje en consola que le pide al usuario que ingrese el nombre.
        System.out.println('Ingrese el nombre del cliente:');

        //Esta linea lee la entrada del usuario utilizando el objeto "scanner" y almacena el valor en la variable nombreCliente
        //"scanner.nextline()" lee la linea de texto ingresada por el usuario y la asigna a nombreCliente
        String nombreCliente = scanner.nextLine();

        //Esta linea imprime un mensaje en consola que le pide al usuario ingresar el monto de la compra.
        System.out.println('Ingrese el monto total de la compra:');

        //Esta linea lee la entrada del usuario utilizando el objeto "scanner" y la almacena en la variable montoCompra
        //"scanner.nextDouble()" lee un numero decimal ingresado por el usuario y lo asigna a la variabel montoCompra.
        double montoCompra = scanner.nextDouble();

        //Se inicializa la variable descuento con el valor en 0.0. Esta variable se utilizara para almacenar el valor del descuento.  
        double descuento = 0.0;

        //Esta condicional if verifica que el valor de la compra cumpla con alguno de estos requisitos para que se le pueda aplicar el descuento.
        if (montoCompra >= 200000) {
            descuento = 0.15;
        }else if (montoCompra >= 50000) {
            descuento = 0.2;
        }else if (montoCompra >= 20000){
            descuento = 0.015;
        }

        //En esta linea se calcula el valor del monto con los valores de montoCompra por el porcentaje de descuento.
        double monto = montoCompra * descuento;

        //En esta linea se calcula el valor total a pagar con los valores de montoCompra menos el valor del montoDescuento.
        double totalPagar = montoCompra - montoDescuento;

        //En el resto de lineas se imprime la factura del usuario.
        System.out.println("\n---factura---");
        System.out.println("Nombre del cliente" + nombreCliente);
        System.out.println("Monto de la compra $" + montoCompra);
        System.out.println("Descuento aplicado:" + montoDescuento);
        System.out.println("Total a pagar:" + totalPagar);
        System.out.println("Muchas gracias por su compra" + nombreCliente "tenga buen dia");
    }
}
