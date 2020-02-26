package operaciones;

public class Restador implements Operador {

    public Restador() {
    }

    @Override
    public int operar(int a, int b) {
        return a - b;
    }
}
