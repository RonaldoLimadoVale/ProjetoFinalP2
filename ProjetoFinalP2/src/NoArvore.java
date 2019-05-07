
public class NoArvore {
		int valor;
		NoArvore direita;
		NoArvore esquerda;
		
		
public void imprime(NoArvore a) {
	if (a != null) {
		imprime(a.esquerda);
		System.out.println(a.valor);
		imprime(a.direita);
	}
  }
	
public NoArvore busca(NoArvore raiz, int valorprocurado) {
	if (raiz == null)
		return null;
	else if (raiz.valor > valorprocurado)
		return busca (raiz.esquerda, valorprocurado);
	else if (raiz.valor < valorprocurado)
		return busca (raiz.direita, valorprocurado);
	else
		return raiz;
  }


public NoArvore insere (NoArvore a, int v) {
	if (a == null) {
		a = new NoArvore();
		a.valor = v;
		a.esquerda = a.direita = null;
	}
	else if (v < a.valor)
		a.esquerda = insere(a.esquerda, v);
	else
		a.direita = insere(a.direita, v);
	return a;
  }

public NoArvore remover (NoArvore r, int v) {
	if (r == null)
		return null;
	else if (r.valor > v)
		r.esquerda = remover (r.esquerda, v);
	else if (r.valor < v)
		r.direita = remover (r.direita, v);
	else {
		if (r.esquerda == null && r.direita == null) {
			r = null;
		}
		else if (r.esquerda == null) {
			NoArvore temp = r;
			r = r.direita;
		}
		else if (r.direita == null) {
			NoArvore temp = r;
			r = r.esquerda;
		}
		else {
			NoArvore subesquerda = r.esquerda;
			while (subesquerda.direita !=null) {
				subesquerda = subesquerda.direita;
			}
			r.valor = subesquerda.valor;
			subesquerda.valor = v;
			r.esquerda = remover (r.esquerda, v);
		}
	}			
	return r; 

  }
	

}
