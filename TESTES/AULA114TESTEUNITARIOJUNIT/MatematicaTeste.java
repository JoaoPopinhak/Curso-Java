package TESTES.AULA114TESTEUNITARIOJUNIT;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import POO.AULA37METODRETURN.Matematica;
import static junit.framework.Assert.*;

class MatematicaTeste {
	
	Matematica m;
	@BeforeEach
	void setUp() throws Exception {
		m = new Matematica();
	}

	@SuppressWarnings("deprecation")
	@Test
	void testMaior() {
		assertEquals(10, m.maior(10,5));
		
	}

	@SuppressWarnings("deprecation")
	@Test
	void testSoma() {
		assertEquals(20, m.soma(10, 10));
	}
	


}
