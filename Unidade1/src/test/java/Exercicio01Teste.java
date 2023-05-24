
import com.testedesoftware.model.Exercicio01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ricardo
 */
public class Exercicio01Teste {
    
    private Exercicio01 exercicio01 = new Exercicio01();
    
//    public Exercicio01Teste() {
//    }
    @Test
    public void TestDobro() {
        int resultado = exercicio01.Dobro(2);
        assertEquals(4, resultado);
    }
    @Test
    public void TestDobro2() {
        int resultado = exercicio01.Dobro(275);
        assertEquals(550, resultado);
    }
    
    @Test
    public void TestDobro3() {
        int resultado = exercicio01.Area(2,25);
        assertEquals(50, resultado);
    }
    
    @Test
    public void TestDobro4() {
        int resultado = exercicio01.Area(0,25);
        assertEquals(0, resultado);
    }
    
    @Test
    public void TestDobro5() {
        int resultado = exercicio01.Area(-2,85);
        assertEquals(-170, resultado);
    }
     
    
    @Test
    public void TesteArea() {
        int resultado = exercicio01.Area(0, 0);
        assertEquals(0, resultado);
    }
    
    @Test
    public void TesteArea2() {
        int resultado = exercicio01.Area(3, 0);
        assertEquals(0, resultado);
    }
    @Test
    public void TesteArea3() {
        int resultado = exercicio01.Area(200, 30);
        assertEquals(6000, resultado);
    }
    
    @Test
    public void TestDesconto(){
        double resultado = exercicio01.Desconto(10,50);
        assertEquals(5, resultado);
    }
    
    @Test
    public void TestDesconto2(){
        double resultado = exercicio01.Desconto(10,90);
        assertEquals(1, resultado);
    }
    
    @Test
    public void TestDesconto3(){
        double resultado = exercicio01.Desconto(10,0);
        assertEquals(10, resultado);
    }
    
    @Test
    public void TestMaior(){
        int resultado = exercicio01.Maior(10,5,2);
        assertEquals(10,resultado);
    }    
    
    @Test
    public void TestMaior2(){
        int resultado = exercicio01.Maior(10,5,10);
        assertEquals(10,resultado);
    }   
    
    @Test
    public void TestMaior3(){
        int resultado = exercicio01.Maior(-10,-5,0);
        assertEquals(0,resultado);
    }   
}
