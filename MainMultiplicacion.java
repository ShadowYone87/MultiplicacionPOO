// Se importa la libreria Scanner
import java.util.Scanner;

// Se declara la clase
public class MainMultiplicacion {
    // Se agrega el metodo main
    public static void main(String[] args) {
        // Se llama al metodo Scanner
        Scanner n1 = new Scanner(System.in);
        // Se ingresa el mensaje que se le dara al usuario
Multiplicacion m1 = new Multiplicacion();
        System.out.println("Ingresa un numero");
        // Se almacena el valor del usuario
        int a = n1.nextInt();
        // Se almacena el valor del usuario
        System.out.println("Ingrese el segundo numero");
        // Se almacena el valor del usuario
        int b = n1.nextInt();
        // Se hace la operacion con los datos ingresados por el usuario
        int r = a * b;
        // Se imprime el resultado de la operacion y se muestra en pantalla
        m1.a=a;
        m1.b=b;
        m1.multiplicar(a, b);
        System.out.println("El resultado es :"+ m1.multiplicar(a, b));

        // Se cierra el metodo mian
    }
    // Se cierra clase
}