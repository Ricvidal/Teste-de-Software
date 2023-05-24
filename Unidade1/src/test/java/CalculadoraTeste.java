import com.testedesoftware.model.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ricardo
 */
public class CalculadoraTeste {
    
    
    
//    public CalculadoraTeste() {
//    }
//    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testSoma() {
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.Somar(2,3);
        assertEquals(5, resultado);       
        
    }
    
    @Test
    public void testSoma2() {
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.Somar(-2,3);
        assertEquals(1, resultado);       
        
    }
    
    @Test
    public void testSoma3() {
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.Somar(0,3);
        assertEquals(0, resultado);       
        
    }
    
    @Test
    public void testSoma4() {
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.Somar(-9,3);
        assertEquals(-6, resultado);       
        
    }
    
    @Test
    public void testSoma5() {
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.Dividir(0,0);
        assertEquals(0, resultado);       
        
    }
    
    
}
