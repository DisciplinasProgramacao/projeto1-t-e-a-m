
public class ListaEncadeada {
	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;

	public ListaEncadeada() {

		Celula sentinela = new Celula();

		primeiro = sentinela;
		ultimo = sentinela;
		tamanho = 0;
	}

	public boolean listaVazia() {

		boolean resp;

		if (primeiro == ultimo)
			resp = true;
		else
			resp = false;

		return resp;
	}

	public void inserir(Compromisso novo, int posicao) throws Exception {

		Celula anterior, novaCelula, proximaCelula;

		if ((posicao >= 0) && (posicao <= tamanho)) {
			anterior = primeiro;
			for (int i = 0; i < posicao; i++)
				anterior = anterior.getProximo();

			novaCelula = new Celula(novo);

			proximaCelula = anterior.getProximo();

			anterior.setProximo(novaCelula);
			novaCelula.setProximo(proximaCelula);

			if (posicao == tamanho) // a inserÃ§Ã£o ocorreu na Ãºltima posiÃ§Ã£o da lista
				ultimo = novaCelula;

			tamanho++;

		} else
			throw new Exception("NÃ£o foi possÃ­vel inserir o item na lista: a posiÃ§Ã£o informada Ã© invÃ¡lida!");
	}

	public Compromisso remover(int posicao) throws Exception {

		Celula anterior, celulaRemovida, proximaCelula;

		if (!listaVazia()) {
			if ((posicao >= 0) && (posicao < tamanho)) {
				anterior = primeiro;
				for (int i = 0; i < posicao; i++)
					anterior = anterior.getProximo();

				celulaRemovida = anterior.getProximo();

				proximaCelula = celulaRemovida.getProximo();

				anterior.setProximo(proximaCelula);
				celulaRemovida.setProximo(null);

				if (celulaRemovida == ultimo)
					ultimo = anterior;

				tamanho--;

				return (celulaRemovida.getItem());
			} else
				throw new Exception("NÃ£o foi possÃ­vel remover o item da lista: a posiÃ§Ã£o informada Ã© invÃ¡lida!");
		} else
			throw new Exception("NÃ£o foi possÃ­vel remover o item da lista: a lista estÃ¡ vazia!");
	}

	public void imprimir() throws Exception {

		Celula aux;

		if (!listaVazia()) {
			//System.out.println("ConteÃºdo da Agenda:");

			aux = primeiro.getProximo();
			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception("NÃ£o hÃ¡ compromissos na agenda!");
	}
	
	public void imprimirID() throws Exception{
		Celula aux;
		int id=0;
		
		if (!listaVazia()) {
			//System.out.println("ConteÃºdo da Agenda:");

			aux = primeiro.getProximo();
			while (aux != null) {
				aux.getItem().imprimirID(id);
				aux = aux.getProximo();
				id++;
			}
		} else
			throw new Exception("NÃ£o hÃ¡ compromissos na agenda!");
	}
	
	public void filtrarMes(int mes) throws Exception {

		Celula aux;

		if (!listaVazia()) {
			//System.out.println("ConteÃºdo da Agenda:");

			aux = primeiro.getProximo();
			while (aux != null) {
				String data = aux.getItem().getData();
				String partes[] = data.split("/");
				int mesI = Integer.parseInt(partes[1]);
				if(mesI == mes) {
					aux.getItem().imprimir();
				}
				aux = aux.getProximo();
			}
		} else
			throw new Exception("NÃ£o hÃ¡ compromissos na agenda!");
	}
	
	public void filtrarDiaS(String dia) throws Exception {

		Celula aux;

		if (!listaVazia()) {
			//System.out.println("ConteÃºdo da Agenda:");

			aux = primeiro.getProximo();
			while (aux != null) {
				String data = aux.getItem().getData();
				Data dt = new Data();
				//String partes[] = data.split("/");
				//String DiaL = Integer.parseInt(partes[1]);
				String diaL = dt.diaDaSemanaEm2022(data);
				if(diaL.equals(dia)) {
					aux.getItem().imprimir();
				}
				aux = aux.getProximo();
			}
		} else
			throw new Exception("NÃ£o hÃ¡ compromissos na agenda!");
	}
	
}
