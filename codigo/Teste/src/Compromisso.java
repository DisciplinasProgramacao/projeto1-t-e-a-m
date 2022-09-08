
public class Compromisso {

	private String data, tarefa;

	public Compromisso() {
		this.data = "";
		this.tarefa = "";
	}

	public Compromisso(String data, String tarefa) {
		this.data = data;
		this.tarefa = tarefa;
	}

	public String getTarefa() {
		return tarefa;
	}

	public String getData() {
		return data;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void imprimir() {
		System.out.println("Data: " + this.data + " - Tarefa: " + this.tarefa);
	}
	
}
