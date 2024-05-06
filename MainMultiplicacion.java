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
        m1.setA(n1.nextInt());
        // Se almacena el valor del usuario
        System.out.println("Ingrese el segundo numero");
        // Se almacena el valor del usuario
        m1.setB(n1.nextInt());
        // Se imprime el resultado de la operacion y se muestra en pantalla
        System.out.println("El resultado es : ");
        System.out.println(m1.multiplicar());
        System.out.println(m1);

        m1.getA();
        m1.getB();
        n1.close();
        // Se cierra el metodo mian
    }
    // Se cierra clase
}