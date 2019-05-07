
public class FilaSequencial {
	String contatos[] = new String[100];
	int tamanho = -1;
	
	public boolean isVazia(){
		return (tamanho==-1);
	}
	
	public boolean isCheia(){
		return (tamanho==contatos.length-1);
	}
	
	public boolean inserir (String contato){
		if (isCheia()) return false;
		
		tamanho++;
		contatos[tamanho]= contato;
		System.out.println("Inseriu! ");
		return true;
		
	}
	
	public String remover(){
		if (isVazia()) return null;
		
		String valor = contatos[0];
		contatos[0] = null;
		for (int i=0; i<tamanho; i++){
			contatos[i] = contatos[i+1];
		}
		
		contatos[tamanho]=null;
		tamanho--;
		System.out.println("Removeu!");
		return valor;
	}
	
	public void exibirFila(){
		if (isVazia()) {
			System.out.println("Fila Vazia");
			return;
		}
		for (int i = 0; i<=tamanho; i++){
			System.out.println("posição: "+(i+1)+" "+contatos[i]);
			
		}
		System.out.println("\n");
	}
	
	public void esvaziarFila(){
		contatos = new String[100];
		tamanho = -1;
	}
	
	

}
