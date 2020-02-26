import operaciones.Sumador;


import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


public class SumadorTest {

    @InjectMocks
    private Sumador sumador ;

    @BeforeEach
public void init(){
        MockitoAnnotations.initMocks(this);
    }


    @ParameterizedTest
    @CsvSource(
            value = {
                    "1, 2, 3",
                    "2, 2, 4",
                    "4, 8, 12",
                    "20, -5, 15",
                    "0, 0, 0",
                    "56, 44, 100",
                    "-40, -10, -50"
            })
    void probarLasDiferentesSumas(int primerNumero, int segundoNumero, int resultadoEsperado) {
        Assertions.assertEquals(sumador.operar(primerNumero, segundoNumero) , resultadoEsperado);
    }
}