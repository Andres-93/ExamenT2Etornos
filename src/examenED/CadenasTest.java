package examenED;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CadenasTest{
	
	static Cadenas cadena;
	
	@BeforeClass
	public static void mensajeInicio() {
		System.out.println("Inicio de las pruebas");
		cadena = new Cadenas();
	}
	@AfterClass
	public static void mensajeFinal() {
		System.out.println("Final de las pruebas");
	}
	/*
	 * En el primer caso enviamos un string de 2 letras  que sean A
	 * y el programa debe devolver una cadena vacia.
	 */	
	@Test
	public void quitarAenPrimeras2PosicionesTest1() {
		String devuelto = cadena.quitarAenPrimeras2Posiciones("AA");
		assertEquals("", devuelto);
	}
	/*
	 * Comprobaremos tambien enviando dos caracteres pero solamente siendo uno de ellos una A
	 * que solo cambiara la A y devolvera la otra letra
	 */
	@Test
	public void quitarAenPrimeras2PosicionesTest2() {
		String devuelto = cadena.quitarAenPrimeras2Posiciones("AB");
		assertEquals("B", devuelto);
	}
	/*
	 * Comprobamos igual que el primero pero en este caso para un solo caracter
	 */
	@Test
	public void quitarAenPrimeras2PosicionesTest3() {
		String devuelto = cadena.quitarAenPrimeras2Posiciones("A");
		assertEquals("", devuelto);
	}
	/*
	 * Comprobamos que en una cadena de mas de 2 caracteres sustituira los dos primeros siendo A por
	 * cadena vacia
	 */
	@Test
	public void quitarAenPrimeras2PosicionesTest4() {
		String devuelto = cadena.quitarAenPrimeras2Posiciones("AABBCCDDEE");
		assertEquals("BBCCDDEE", devuelto);
	}
	/*
	 * Comprobamos que si enviamos un solo caracter el nos devolvera false
	 */
	@Test
	public void sonPrimerosYultimos2CharsLosMismosTest1() {
		boolean resultado = cadena.sonPrimerosYultimos2CharsLosMismos("H");
		assertFalse(resultado);
	}
	/*
	 * Comprobamos que si enviamos una cadena de dos caracteres siempre devolvera true
	 */
	@Test
	public void sonPrimerosYultimos2CharsLosMismosTest2() {
		boolean resultado = cadena.sonPrimerosYultimos2CharsLosMismos("HH");
		assertTrue(resultado);
	}
	/*
	 * Comprobamos tambien mandando una cadena de dos caracteres diferentes, y debe devolver true
	 * ya que los dos ultimos y los dos primeros son los mismo
	 */
	@Test
	public void sonPrimerosYultimos2CharsLosMismosTest3() {
		boolean resultado = cadena.sonPrimerosYultimos2CharsLosMismos("HK");
		assertTrue(resultado);
	}
	/*
	 * Comprobamos que en una cadena de mas de 2 caracteres comprobara que los dos primeros
	 * son iguales a los dos segundos y devolvera true
	 */
	@Test
	public void sonPrimerosYultimos2CharsLosMismosTest4() {
		boolean resultado = cadena.sonPrimerosYultimos2CharsLosMismos("HHCocineroHH");
		assertTrue(resultado);
	}
	/*
	 * En caso de que sean diferentes devolvera false
	 */
	@Test
	public void sonPrimerosYultimos2CharsLosMismosTest5() {
		boolean resultado = cadena.sonPrimerosYultimos2CharsLosMismos("HHCocineroJJ");
		assertFalse(resultado);
	}

}
