

public class Lista {
	Aluno[] contatos = new Aluno[100];
	int n = 0;
	
	public boolean isVazia() {
		return(n == 0);
	}
	public boolean isCheia() {
		return(n ==contatos.length);
	}
	public int tamanho() {
		return n;
	}
	public Aluno buscar(int pos) {
		if((pos >= n) ||(pos < 0)) {return null;}
		
		return contatos[pos];
	}
	public boolean compara(Aluno aluno1, Aluno aluno2) {
		return(aluno1.getNome().equals(aluno2.getNome())) && (aluno1.getIdade().equals(aluno2.getIdade()));
	}
	public int getPosicao(Aluno aluno) {
		for(int i = 0; i < n; i++)
			if(compara(contatos[i], aluno))
				return i;
		return -1;
	}
	public void deslocaDireita(int pos) {
		for(int i = n; i > pos; i--)
			contatos[i]= contatos[i-1];
	}
	boolean inserir (int pos, Aluno aluno) {
		if(isCheia()||(pos>n)||(pos<0))
			return false;
		
		deslocaDireita(pos);
		contatos[pos] = aluno;
		n++;
		return true;
	}
	public void deslocaEsquerda(int pos) {
		for (int i = pos; i < n - 1; i++)
			contatos[i] = contatos[i + 1];
		
	}
	public boolean remover (int pos) {
		if(pos >= n || pos < 0)
			return false;
		
		deslocaEsquerda(pos);
		n--;
		return true;
	}
	public void exibirLista() {
		for(int i = 0; i < n; i++) {
			System.out.println("\nAluno " +(i+1)+ "\nAluno: " + contatos[i].getNome() + "\nIdade: " + contatos[i].getIdade());
		}
	}
	
	
	
}
