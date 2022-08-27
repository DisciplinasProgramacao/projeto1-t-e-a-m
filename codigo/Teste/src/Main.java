
public class Main {
	public static void main(String[] args) {

		ListaEncadeada minhaLista;
		Compromisso novo, removido;
		String data, tarefa;

		minhaLista = new ListaEncadeada();
		
		System.out.println("Informe o dia, mês e ano separados por /");
		data = MyIO.readLine();
		
		
		System.out.println("Informe a atividade");
		tarefa = MyIO.readLine();


		
		novo = new Compromisso(data, tarefa);
		
		
		try {
			minhaLista.inserir(novo, 0);
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		
		try {
			minhaLista.imprimir(); // 11 - 1 - 4 - 21
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}

		try {
			removido = minhaLista.remover(1);
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
