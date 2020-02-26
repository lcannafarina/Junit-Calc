package operaciones;

public class Divisor implements Operador {

    public Divisor() {
    }

    @Override
    public int operar(int a, int b) {
        if (b == 0) b = 1;
        return a / b;
    }
}
