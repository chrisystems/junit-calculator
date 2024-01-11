import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	public Calculadora cal = new Calculadora();
	@Test
	void RestarNumeros() {
		int resta = cal.restar(5, 2);
		assertEquals(3,resta);
	}
	
	@Test
	void SumarNumeros() {
		int suma = cal.sumar(3, 2);
		assertEquals(5,suma);
	}
	
	@Test
	void MultiplicarNumeros() {
		int multiplicar = cal.multiplicar(6, 2);
		assertEquals(12,multiplicar);
	}
	
	@Test
	void DividirNumeros() {
		double dividir = cal.dividir(2, 2);
		assertEquals(1,dividir);
	}
	
	@Test
	void PotenciarNumeros() {
		double potenciar = cal.potenciar(2, 1);
		assertEquals(2,potenciar);
	}
}