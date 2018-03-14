package examenED;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class CadenasTestParam {

	private String cadenaPrueba;
	private String cadenaEsperada;
		
	public CadenasTestParam(String cadenaPrueba, String cadenaEsperada) {
		this.cadenaPrueba = cadenaPrueba;
		this.cadenaEsperada = cadenaEsperada;
	}

	@Parameters
	public static Collection<Object[]> cadenas(){
		
		return Arrays.asList(new Object[][] { {"AA",""},{"AB","B"},{"A",""},{"AABBCCDD","BBCCDD"}});
		
	}

	@Test
	public void testQuitarAenPrimeras2Posiciones() {
		Cadenas cadena = new Cadenas();
		String resultado = cadena.quitarAenPrimeras2Posiciones(cadenaPrueba);
		assertEquals(cadenaEsperada, resultado);
		
	}
	
}
