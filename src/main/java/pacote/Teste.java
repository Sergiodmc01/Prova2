package pacote;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Teste {
		
	@Test
	public void testeSoma() {
		Calculadora calc = new Calculadora();
	    assertEquals(5, calc.soma(2, 3));
	    }
		
	@Test
	public void TesteSubtracao() {
		Calculadora calc = new Calculadora();
	    assertEquals(1, calc.subtracao(2, 3));
	   	}
		
	

}
