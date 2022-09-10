
public class Compromisso {

	private String tarefa, data;
	private Data dataReal;
	
	
	public Compromisso() {
		
		this.data = "";
		this.tarefa = "";
		this.dataReal = new Data();
	}

	public Compromisso(String data, String tarefa) {
		this.data = data;
		this.tarefa = tarefa;
		this.dataReal = this.stringToData(data);
	}

	public String getTarefa() {
		return tarefa;
	}

	public String getData() {
		return data;
	}
	
	public Data getDataReal() {
		return dataReal;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public void setData(String data) {
		
		this.data = data;
	}
	
	public void setDataReal(Data data){
		this.dataReal = data;
	}

	public void imprimir() {
		System.out.println("Data: " + this.data + " - Tarefa: " + this.tarefa);
	}
	
	public void imprimirID(int id) {
		System.out.println("ID: " + id + " - Data: " + this.data + " - Tarefa: " + this.tarefa);
	}
	
	public Data stringToData(String dataString) {
		int dia, mes, ano;
		
		String partes[] = dataString.split("/");
		dia = Integer.parseInt(partes[0]);
		mes = Integer.parseInt(partes[1]);
		ano = Integer.parseInt(partes[2]);
	
		dataReal = new  Data(dia, mes, ano);
		return dataReal;
  	}
	
	
}
