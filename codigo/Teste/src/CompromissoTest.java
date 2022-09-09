import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CompromissoTest {

	// permitir a criação de compromissos em data específicas. Não precisa marcar
	// horário

	@Test
	public void mostrarDataETarefa() {
		Compromisso data = new Compromisso("9/9/22","trabalho");
		assertEquals("9/9/22", data.getData());
		assertEquals("trabalho", data.getTarefa());
	}

}
