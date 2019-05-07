
public class FilaEncadeada {
	No inicio;
	No fim;
	int tamanho = 0;
	
	public boolean isVazia() {
		return (tamanho==0);
	}
	
	public void inserir (String dado) {
		No novo = new No();
		novo.dado = dado;
		
		if (isVazia()) {
			inicio = novo;
			fim = novo;
		}else {
			fim.prox = novo;
			fim = novo;
		}
		tamanho++;
		System.out.println("Inseriu! ");
	}
	
	public String remover() {
		if (isVazia()) return null;
		
		String valor = inicio.dado;
		
		if (tamanho==1) {
			inicio = null;
			fim = null;
			tamanho = 0;
		}else {
			inicio = inicio.prox;
			tamanho--;
		}
		System.out.println("Removeu!");
		return valor;
	}
	
	public void exibirFila() {
		No aux = inicio;
		if (isVazia()) {
			System.out.println("Fila vazia");
			return;
		}
		System.out.println("\nExibindo Fila Encadeada");
		for (int i=0; i<tamanho; i++) {
			System.out.println("Elemento "+(i+1)+": "+aux.dado);
			aux = aux.prox;
		}
	}
	
	public void esvaziarFila() {
		tamanho = 0;
		inicio = null;
		fim = null;
	}

}
