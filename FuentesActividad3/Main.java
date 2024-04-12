//se importa scanner para obtener los datos del teclado
import java.util.Scanner;

//declaracion de la clase
public class Main {

	//declaracion del metodo main para ejecutar programa 
    public static void main(String[] args) {
        // Se instancia la clase scanner para capturar la entrada de teclado
        Scanner scanner = new Scanner(System.in);

        // Se solicita ingresar la marca del vehiculo al usuario
        System.out.print("MARCA: ");
	// Se declara variable marca para almacenar la marca del vehiculo escrito por el usuario al dar enter
        String marca = scanner.nextLine();

	//Se solicita ingresar el modelo al usuario
        System.out.print("MODELO: ");
	//Se declara variable modelo para almacenar el modelo del vehiculo escrito por el usuario al dar enter
        String modelo = scanner.nextLine();

	//Se solicita ingresar los cilindros del vehiculo al usuario
        System.out.print("CILINDRADA: ");
	//Se declara variable cilindrada para almacenar los cilindros del vehiculo escrito por el usuario al dar enter
        String cilindrada = scanner.nextLine();
	
	//Se solicita ingresar el tipo de combustible del vehiculo al usuario
        System.out.print("TIPO DE COMBUSTIBLE: ");
	//Se declara variable tipoCombustible para almacenar el tipo de combustible del vehiculo escrito por el usuario al dar enter
        String tipoCombustible = scanner.nextLine();

	//Se solicita ingresar el tipo la capacidad de pasajero del vehiculo al usuario
        System.out.print("CAPACIDAD EN PASAJERO: ");
	//Se declara variable capacidadPasajeros de tipo entero para almacenar la capacidad del vehiculo escrito por el usuario al dar enter
        int capacidadPasajeros = scanner.nextInt();

        //Se muestran los datos de salida solicitados
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");

        //Se cierra el scanner
        scanner.close();
    }
}
