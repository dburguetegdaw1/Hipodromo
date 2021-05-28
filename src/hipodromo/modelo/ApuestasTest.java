package hipodromo.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApuestasTest {

	@SuppressWarnings("static-access")
	@Test
	void testCalcularGanador() {
		Apuestas a = new Apuestas(50);
		assertEquals(3.75, a.calcularGanador(3, 10));
	}

}
