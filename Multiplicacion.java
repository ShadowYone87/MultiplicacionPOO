// Se declara la clase
public class Multiplicacion {
    // Se declaran las variables
    int a, b, r;

    // Se declara el metodo
    public int multiplicar() {
        // Se llama al objeto
        r = this.a * this.b;
        return r;
        // Se cierra el metodo multiplicar
    }
    // Se cierra la clase
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Multiplicacion [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}
