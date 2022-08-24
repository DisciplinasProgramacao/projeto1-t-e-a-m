import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataTest {

	@Test
	void anoBissexto() {
		Data ano = new Data();
		assertFalse(ano.anoBissexto());
	}

	@Test
	void dataValida() {
		Data valida = new Data();
		assertTrue(valida.dataValida());
	}
	
	@Test
	void diaDaSemanaEm2022() {
		Data diaSemana = new Data();
		assertEquals("sábado",diaSemana.diaDaSemanaEm2022("1/1/1900")); //Por que do warning ??
	}
	@Test 
	void dataFormatada() {
		Data formatada = new Data();
		assertEquals("1/1/1990",formatada.dataFormatada());
	}
}
