import com.testedesoftware.model.Corretor;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ricardo
 */
public class CorretorTeste {
    
    public Corretor corretor = new Corretor();
    
    public CorretorTeste() {
    }
    
    @Test
    public void NomeTeste(){
        corretor.setNome("Al");
        assertEquals("Al",corretor.getNome());
    }
    
    @Test
    public void NomeTeste2(){
        corretor.setNome("Ric");
        assertEquals("Ric",corretor.getNome());
    }
    
    @Test
    public void dataContratacaoTest(){
        LocalDate data = LocalDate.of(2023,04,23);
        corretor.setDataContratacao(data);       
        assertEquals("2023-04-23",corretor.getDataContratacao().toString());
    }

    @Test
    public void dataContratacaoTest2(){
        LocalDate data = LocalDate.of(2023,04,25);
        corretor.setDataContratacao(data);        
        assertEquals("2023-04-25",corretor.getDataContratacao().toString());
    }
    
    @Test
    public void SalarioTeste(){
        corretor.setSalario(999);
        assertEquals(999, corretor.getSalario());  
    }
    
    @Test
    public void SalarioTeste2(){
        corretor.setSalario(1000);
        assertEquals(1000, corretor.getSalario());  
    }
    
    @Test
    public void ValorVendidoTeste(){
        corretor.setVendasDoMes(-1);
        double resultado = corretor.getVendasDoMes();
        assertEquals(-1,resultado);
    }
    
    @Test
    public void ValorVendidoTeste2(){
        corretor.setVendasDoMes(0);
        double resultado = corretor.getVendasDoMes();
        assertEquals(0,resultado);
    }
    
    @Test
    public void ValorVendidoTeste3(){
        corretor.setVendasDoMes(10000);
//        double resultado = corretor.getVendasDoMes();
        assertEquals(10000,corretor.getVendasDoMes());
    }
    
    @Test
    public void ComissaoTeste(){
        corretor.setComissao(1000);
        double resposta = corretor.getComissao();
        assertEquals(80,resposta);
    }
    @Test
    public void ComissaoTeste2(){
        corretor.setComissao(60000);
        
        assertEquals(7200,corretor.getComissao());
    }
    @Test
    public void ComissaoTeste3(){
        corretor.setComissao(30000);
        double resposta = corretor.getComissao();
        assertEquals(2850,resposta);
    }
    
    
    @Test
    public void RelatorioTeste(){
        Corretor corretor1 = new Corretor();
        Corretor corretor2 = new Corretor();
        Corretor corretor3 = new Corretor();
        
        corretor1.setNome("Fulano");
        LocalDate data = LocalDate.of(2023,04,22);
        corretor1.setDataContratacao(data);
        corretor1.setSalario(2000);
        corretor1.setVendasDoMes(100000);
        corretor1.setComissao(100000);
        
        corretor2.setNome("Beltrano");
        data = LocalDate.of(1999,03,30);
        corretor2.setDataContratacao(data);
        corretor2.setSalario(5000);
        corretor2.setVendasDoMes(45400);
        corretor2.setComissao(45400);
        
        corretor3.setNome("Ciclano");
        data = LocalDate.of(2018,01,10);
        corretor3.setDataContratacao(data);
        corretor3.setSalario(6000);
        corretor3.setVendasDoMes(15000);
        corretor3.setComissao(15000);
        
        String resultado = corretor.Relatorio(corretor1, corretor2, corretor3);
        assertEquals("",resultado);
        
    }
    
}
