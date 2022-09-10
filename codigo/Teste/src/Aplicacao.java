import java.util.Scanner;

public class Aplicacao {
	public static void menu() {
		System.out.println("\n\tAgenda de Compromissos:");
		System.out.println("1. Incluir compromisso na agenda");
		System.out.println("2. Remover compromisso da agenda");
		System.out.println("3. Consultar compromissos agendados");
		System.out.println("4. Incluir compromisso recorrente");
		System.out.println("5. Filtrar os compromissos por mês");
		System.out.println("6. Filtrar os compromissos por dia da semana");
		System.out.println("7. Finalizar a agenda");
		System.out.println("Digite a opcao desejada:");
	}

	public static void main(String[] args) {

		ListaEncadeada minhaLista;
		Compromisso novo, removido;
		String data, tarefa, num, strRepeticoes;
		Data dataR;
		Integer i = 0, repeticoes;
		Boolean isAtivo = true;

		minhaLista = new ListaEncadeada();

		try (Scanner ler = new Scanner(System.in)) {
			while (isAtivo) {
				menu();

				num = ler.nextLine();

				switch (Integer.parseInt(num)) {

				case 1:
					System.out.println("Informe o dia, mÃªs e ano separados por '/'");
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
						System.out.println("Indique o ID do ítem a ser removido da lista: ");
						minhaLista.imprimirID();
						
						String remove = ler.nextLine();
						removido = minhaLista.remover(Integer.parseInt(remove));
						
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
					System.out.println("Informe o dia, mÃªs e ano separados por '/'");
					data = ler.nextLine();

					System.out.println("Informe a atividade");
					tarefa = ler.nextLine();

					System.out.println("Informe quantas vezes esta tarefa serÃ¡ repetida nas prÃ³ximas semanas");
					strRepeticoes = ler.nextLine();
					
					repeticoes = Integer.parseInt(strRepeticoes);

					for (int j = 0; j < repeticoes; j++) {
						novo = new Compromisso(data, tarefa);
						
						dataR = novo.getDataReal();
						dataR.pularDias(dataR, 7);
						data = dataR.dataFormatada();
						
						try {
							minhaLista.inserir(novo, i);
						} catch (Exception erro) {
							System.out.println(erro.getMessage());
						}
						i++;
					}

					break;
					
				case 5:
					System.out.println("Digite o mês escolhido para a filtragem: ");
					try {
						String filtroS = ler.nextLine();
						int filtroI = Integer.parseInt(filtroS);
						minhaLista.filtrarMes(filtroI);
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					
					break;
				case 6:
					System.out.println("Digite o dia da semana escolhido para a filtragem: ");
					try {
						String filtroS = ler.nextLine();
						//int filtroI = Integer.parseInt(filtroS);
						minhaLista.filtrarDiaS(filtroS);
					} catch (Exception erro) {
						System.out.println(erro.getMessage());
					}
					
					break;
					
				case 7:
					isAtivo = false;
					System.out.println("Finalizado!");
					break;

				

				default:
					System.out.println("Comando invÃ¡lido");
					break;

				}

			}
		}

	}
}
