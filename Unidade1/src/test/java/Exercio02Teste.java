import com.testedesoftware.model.Aluno;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ricardo
 */
public class Exercio02Teste {
    public Aluno aluno = new Aluno();
    
    public Exercio02Teste() {
    }
    
    @Test
    public void CadastrarAlunoTest(){
        boolean resultado = aluno.cadastrarAluno("Bla", 25, 10, 5, 0);
        assertEquals(true, resultado);
    }
    
    @Test
    public void CadastrarAlunoTest2(){
        boolean resultado = aluno.cadastrarAluno("Fulano", 30, 10, 9, 0);
        assertEquals(true, resultado);
    }
    
    @Test
    public void CadastrarAlunoTest3(){
        boolean resultado = aluno.cadastrarAluno("Ana", 25, 10, 5, 1);
        assertEquals(true, resultado);
    }
    
    @Test
    public void MediaAlunoTeste(){
        double resultado = aluno.MediaAritmetica(10,5);
        assertEquals(7.5,resultado);
    }
    @Test
    public void MediaAlunoTeste2(){
        double resultado = aluno.MediaAritmetica(100,10);
        assertEquals(55,resultado);
    }
    @Test
    public void MediaAlunoTeste3(){
        double resultado = aluno.MediaAritmetica(5,0);
        assertEquals(2.5,resultado);
    } 
    
    @Test
    public void CondicaoAluno(){
        String resultado = aluno.CondicaoAluno(5);
        assertEquals("Reprovado!", resultado);
    }
    
    @Test
    public void CondicaoAluno2(){
        String resultado = aluno.CondicaoAluno(59);
        assertEquals("Reprovado!", resultado);
    }
    
    @Test
    public void CondicaoAluno3(){
        String resultado = aluno.CondicaoAluno(60);
        assertEquals("Aprovado!", resultado);
    }
    
}
