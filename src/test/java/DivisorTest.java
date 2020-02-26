import operaciones.Divisor;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DivisorTest {

    public Divisor divisor = new Divisor();

    private static Stream<Arguments> generarDatos(){
        return Stream.of(
                Arguments.of(10, 5, 2),
                Arguments.of(14, 2, 7),
                Arguments.of(10, 2, 5),
                Arguments.of(0, 2, 0),
                Arguments.of(14, 0, 14));
    }

    @Test
    public void dividir10Por2Retorna5() {
        int a = 10;
        int b = 2;
        Assertions.assertEquals(5, divisor.operar(a, b));
    }

    @Test
    public void dividirPor0RetornaElMismoNumeroA() {
        int a = 500;
        int b = 0;
        Assertions.assertEquals(a, divisor.operar(a, b));
    }

    @ParameterizedTest
    @MethodSource("generarDatos")
    public void testDivisionesPorMetodo(int primerNumero, int segundoNumero, int resultadoEsperado){
        Assertions.assertEquals(resultadoEsperado, divisor.operar(primerNumero,segundoNumero));
    }
}