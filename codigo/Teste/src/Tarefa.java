package classes;
import java.util.Scanner;
public class Tarefa {
	
	public Data data;
	public String tarefa;
	

	Tarefa(Data data, String tarefa) {
		data = this.data;
		tarefa = this.tarefa;
	}

	public String getTarefa() {
		return this.tarefa;
	}
	
	public Data getData() {
		return this.data;
	}
	
	
	public String[] adicionarTarefa() {
		
		
		int dia;
		int mes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia:");
		dia = Integer.parseInt( entrada.nextLine());
		
		System.out.println("Digite o mês:");
		mes = Integer.parseInt( entrada.nextLine());
		
		Data dataTarefa = new Data(dia,mes);
		

	}
	
	public void excluirTarefa() {
		
		
	}
	
	
	
	
}
