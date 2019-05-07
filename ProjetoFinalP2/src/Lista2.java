

public class Lista2 {

	Aluno primeiro = null;
	Aluno ultimo = null;
	int total = 0;
	
	//Todos os demais m�todos desta classe v�o aqui
	
	//1� Opera��o - Verificar se a lista est� vazia.
	public boolean isVazio() {
		if (total == 0) {
			return true;
		}
		return false;
	}
	
	// 2� Opera��o - Inserir no Inicio.
	public void inserirAlunoInicio (Aluno a) {
		if (isVazio()) {
			primeiro = ultimo = a;
		}
		
		else {
			
			a.proximo = primeiro;
			
			primeiro = a;
			
		}
		total++;
	} 
	
	// 3� Opera��o - Inserir no Fim.
	public void inserirNofim (Aluno a) {
		if ( isVazio ()) {
			primeiro = ultimo = a;
		}
			
		else {
			
			ultimo.proximo = a;
			ultimo = a;
		}
		 total++;
	}
	
	//4� Opera��o - Exibir Lista.
	public void exibirLista() {
		
		Aluno temp = primeiro;
		if (isVazio() == false ) {
			for (int i=0; i<total; i++) {
				System.out.println("Aluno" +i+ "| nome: " +temp.nome+"| idade:" +temp.idade);
				temp = temp.proximo;
			}
		}
	
	}
	
	//5� Opera��o - Informa o Tamanho da Lista.
	public int tamanho() {
		return total;
	}
	
	//6� Opera��o - Remover.
	public void removeAluno(String nome) {
		Aluno temp = primeiro;
		Aluno anterior = null;
		if (total == 0) {
			System.out.println("Lista Vazia");
				return;
				
		}
		
		if (total == 1) {
			primeiro = null;
			return;	
		}
		
		for (int i=0; i<total; i++) {
			if(nome.equals(temp.nome)) {
				if (anterior != null)
				{
					anterior.proximo = temp.proximo;
					if(temp.proximo == null)
						ultimo = temp;
				}
				else
					primeiro = temp.proximo;
					
				total--;
				return;
			} else 
				anterior = temp;
				temp = temp.proximo;
				
			}
				
		}
		
	
	
	
}



