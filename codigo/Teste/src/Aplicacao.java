import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {

		ListaEncadeada minhaLista;
		Compromisso novo, removido;
		String data, tarefa;

		minhaLista = new ListaEncadeada();

		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Informe o dia, mês e ano separados por '/'");
			data = ler.nextLine();

			System.out.println("Informe a atividade");
			tarefa = ler.nextLine();

		}

		novo = new Compromisso(data, tarefa);

		try {
			minhaLista.inserir(novo, 0);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			minhaLista.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			removido = minhaLista.remover(0);
			System.out.print("Item removido: "); // 1
			removido.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			minhaLista.imprimir();
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	}
}