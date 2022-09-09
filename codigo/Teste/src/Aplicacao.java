import java.util.Scanner;

public class Aplicacao {
	public static void menu() {
		System.out.println("\n\tAgenda de Compromissos:");
		System.out.println("1. Incluir compromisso na agenda");
		System.out.println("2. Remover compromisso da agenda");
		System.out.println("3. Consultar compromissos agendados");
		System.out.println("4. Finalizar a agenda");
		System.out.println("5. Incluir compromisso recorrente");
		System.out.println("Digite a opcao desejada:");
	}

	public static void main(String[] args) {

		ListaEncadeada minhaLista;
		Compromisso novo, removido;
		String data, tarefa, num, strRepeticoes;
		Integer i = 0, repeticoes;
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
					
				case 5:
					System.out.println("Informe o dia, mês e ano separados por '/'");
					data = ler.nextLine();
					
					System.out.println("Informe a atividade");
					tarefa = ler.nextLine();
					
					System.out.println("Informe quantas vezes esta tarefa será repetida nas próximas semanas");
					strRepeticoes = ler.nextLine();
					repeticoes = Integer.parseInt(strRepeticoes);
					
					
					int dia, mes, ano;
					    	
					String partes[] = data.split("/");
					dia = Integer.parseInt(partes[0]);
					mes = Integer.parseInt(partes[1]);
					ano = Integer.parseInt(partes[2]);
				    	
					Data dataReal = new Data(dia, mes, ano);
						
					
					for(int j=0; j<repeticoes; j++) {
						novo = new Compromisso(data, tarefa);
						
						data = dataReal.pularDias(dataReal, 7);
				    	
						try {
							minhaLista.inserir(novo, i);
						} catch (Exception erro) {
							System.out.println(erro.getMessage());
						}
					}
					i++;
					break;
					
				default:
					System.out.println("Comando inválido");
					break;
						
				}
				
			}
		}
		
	}
}
