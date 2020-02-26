import operaciones.Multiplicador;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;


public class MultiplicadorTest {

    @InjectMocks
    public Multiplicador multiplicador = new Multiplicador();

    @ParameterizedTest
    @CsvSource(
            value = {
                    "25, 2, 50",
                    "2, 2, 4",
                    "10, -2, -20",
                    "18, -4, -72",
                    "4, 8, 32",
                    "80, 20, 1600",
                    "25640, 0, 0"
            })
    public void multiplicarResultaLoEsperado(int primerNumero, int segundoNumero, int resultadoEsperado) {
        Assertions.assertEquals(resultadoEsperado, multiplicador.operar(primerNumero, segundoNumero));
    }
}