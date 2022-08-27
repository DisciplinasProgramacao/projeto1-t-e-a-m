import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
//////test
public class CompromissoTest {
	
	//permitir a criação de compromissos em data específicas. Não precisa marcar horário
	
	@Test
	public void cadastrarCompromisso() {
		Compromisso compromisso = new Compromisso();
		assertEquals()
		
		
	}
	
	
	// cadastrar compromissos periódicos
	
	@Test
	public void cadastrarCompromissoPeriodico() {
		CompromissoPeriodico compromissoPeriodico = new CompromissoPeriodico();
		assertEquals()
		
		
	}
	
		
	
	// fornecer um relatório de compromissos entre uma data inicial e uma data final (incluindo ambas)
	
	@Test
	public void relatorioCompromissos() {
		RelatorioCompromissos relatorioCompromissos = new RelatorioCompromissos();
		assertEquals()
		
		
	}
	
	@Test
	void criarCompromissoPeriódico() {
		
	}
	
	
	@Test
	void mostrarTarefa() {
		Tarefa mostrar = new Tarefa();
		assertFalse(mostrar.mostrarTarefa());
	}

	@Test
	void adicionarTarefa() {
		Terefa adicionar = new Tarefa();
		assertTrue(adicionar.adicionarTarefa());
	}
	
	@Test
	void excluirTarefa() {
		Tarefa excluir = new Tarefa();
		assertEquals(excluir.excluirTarefa());
	}
	@Test 
	void compromissoPeriodico() {
		Data formatada = new Data();
		assertEquals("01/01/1990",formatada.dataFormatada());
	}
}
