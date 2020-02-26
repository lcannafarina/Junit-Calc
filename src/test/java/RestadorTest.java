import operaciones.Restador;
import org.junit.jupiter.api.Assertions;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.InjectMocks;

public class RestadorTest {

    @InjectMocks
    public Restador restador = new Restador();

    @ParameterizedTest
    @CsvFileSource( resources = "/CasosRestador.csv")
    public void restarResultaLoEsperado(int primerNumero, int segundoNumero, int resultadoEsperado) {
        Assertions.assertEquals(resultadoEsperado, restador.operar(primerNumero, segundoNumero));
    }
}