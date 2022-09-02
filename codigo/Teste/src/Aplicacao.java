import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {

		ListaEncadeada minhaLista;
		Compromisso novo, removido;
		String data, tarefa, num;
		Integer i = 0;
		Boolean isAtivo = true;
		
		minhaLista = new ListaEncadeada();
		
		try (Scanner ler = new Scanner(System.in)) {
			while(isAtivo){
				
				System.out.println("1- Adicionar compromisso \n2- Remover compromisso \n3- Listar compromissos \n0- Finalizar \n: ");
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
					
				case 0:
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
