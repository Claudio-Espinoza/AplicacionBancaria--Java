package control.controlador;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ControlTest {

    private Control a;

    @BeforeEach
    void setUp() {
        a=new Control();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Calcular divisa(Euro)")
    public void calcularDivisaEuroTest(){
       assertEquals(a.calcularDivisaEuro(1), "0,0010");
        assertEquals(a.calcularDivisaEuro(2), "0,0021");
        assertEquals(a.calcularDivisaEuro(3), "0,0031");
        assertEquals(a.calcularDivisaEuro(4), "0,0042");
    }

    @ParameterizedTest
    @DisplayName("Validar Pin")
    @ValueSource(strings ={ "1234" , "2222" , "4444" , "00000"})
    public void validarPinTest(String pin){
        assertEquals(true, a.validarPin(pin));
    }

    @ParameterizedTest
    @DisplayName("Validar Rut")
    @ValueSource(strings ={ "207542628" , "20754262-8" , "20.754.2628" , "20.754.262-8"})
    public void validarRut(String rut){
        assertEquals(true, a.validarRut(rut));
    }

    @ParameterizedTest
    @DisplayName("Validar Mail")
    @ValueSource(strings ={ "claudioyugen@gmail.com" , "claudioyugengmail.com" , "claudioyugen@gmailcom" , "claudioyugengmailcom"})
    public void validarMail(String mail){
        assertEquals(true, a.validarCorreo(mail));
    }

    @ParameterizedTest
    @DisplayName("Validar UpperCase")
    @ValueSource(strings ={ "Claudio" , "claudio" , "CLAUDIO" , "cLAUDIO"})
    public void upperCaseName(String nombre){
        assertEquals("Claudio", a.upperCaseName(nombre));
    }
}