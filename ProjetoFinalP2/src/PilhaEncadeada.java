public class PilhaEncadeada {
	Elementos topo;
	int n = 0;

	public boolean isVazia() {
		return (topo == null);
	}

	public int quantidadeElementos() {
		return n;
	}
	public String getTopo() {
		if (isVazia())
			return null;
		else
			return topo.dado;
	}
	public void push(String dado) {
		Elementos novo = new Elementos();
		novo.dado = dado;
		novo.prox = topo;
		topo = novo;
		n++;
	}
	public String pop() {
		if (isVazia())
			return null;
		String valor = topo.dado;
		topo = topo.prox;
		n--;
		return valor;
	}
	public void exibirElementos() {
		Elementos auxiliar = topo;
		for (int i=0; i<n; i++) {
			System.out.println("Elemento "+(i+1)+" : "+ auxiliar.dado);
			auxiliar = auxiliar.prox;
		}
	}
}