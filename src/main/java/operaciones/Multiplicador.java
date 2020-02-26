package operaciones;

public class Multiplicador implements Operador {

    public Multiplicador() {
    }

    @Override
    public int operar(int a, int b) {
        return a * b;
    }
}
