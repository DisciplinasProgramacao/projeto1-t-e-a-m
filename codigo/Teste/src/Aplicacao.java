import java.util.Scanner;

public class Aplicacao {
	public static void menu() {
		System.out.println("\n\tAgenda de Compromissos:");
		System.out.println("1. Incluir compromisso na agenda");
		System.out.println("2. Remover compromisso da agenda");
		System.out.println("3. Consultar compromissos agendados");
		System.out.println("4. Finalizar a agenda");
		System.out.println("Digite a opcao desejada:");
	}
	public static void main(String[] args) {

		ListaEncadeada minhaLista;
		Compromisso novo, removido;
		String data, tarefa, num;
		Integer i = 0;
		Boolean isAtivo = true;
		
		minhaLista = new ListaEncadeada();
		
		try (Scanner ler = new Scanner(System.in)) {
			while(isAtivo){
				menu();

				num = ler.nextLine();
				
				switch(Integer.parseInt(num)) {
				
				case 1:
					System.out.println("Informe o dia, mês e ano separados por '/'");
					data = ler.nextLine();
					
					System.out.println("Informe a atividade");
					tarefa = ler.nextLine();
					novo = new Compromisso(data, tarefa);
					try {
						minhaLista.inserir(novo, i);
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					i++;
					break;
					
				case 2:
					try {
						removido = minhaLista.remover(0);
						System.out.print("Item removido: ");
						removido.imprimir();
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					break;
					
				case 3:
					try {
						minhaLista.imprimir();
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					break;
					
				case 4:
					isAtivo = false;
					System.out.println("Finalizado!");
					break;
					
				default:
					System.out.println("Comando inválido");
					break;
						
				}
				
			}
		}
		
	}
}
