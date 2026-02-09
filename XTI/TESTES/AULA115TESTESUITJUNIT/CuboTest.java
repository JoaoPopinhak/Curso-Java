package TESTES.AULA115TESTESUITJUNIT;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import POO.AULA52POLIINTERFACE.CalculoCubo;

class CuboTest {

	CalculoCubo cubo;
	@BeforeEach
	void setUp() throws Exception {
		cubo = new CalculoCubo(10);
	}

	@Test
	void testCalcularVolume() {
		assertEquals(600, cubo.calcularVolume(),0);// .assertEquals(resultado esperado, métodoTeste, varição)
	}

	@Test
	void testCalculaArea() {
		assertEquals(1000, cubo.calcularVolume(),0);
	}

}
