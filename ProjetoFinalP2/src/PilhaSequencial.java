public class PilhaSequencial {
	String[] elementos = new String[100];
	
	int topo = -1;
	
	public boolean isVazia(){
		return (topo==-1);
	}
	
	public boolean isCheia(){
		return (topo==elementos.length - 1);
	}
	
	public int quantidadeElementos(){
		return (topo+1);
	}
	
	public String elemetoTopo(){
		if (isVazia()) return null;
		else return elementos[topo];
	}
	
	public boolean push (String valor){
		if (isCheia()){
			return false;
		}
		else{
			topo++;
			elementos[topo] = valor;
			return true;
		}
	}
	
	public String pop(){
		if (isVazia()) return null;
		else{
			String valor = elementos[topo];
			elementos[topo] = null;
			topo--;
			return valor;
		}
	}
	
	public void exibirElementos(){
		for (int i=0; i<=topo; i++){
			System.out.println("Elemento "+(i+1)+" : "+ elementos[i]);
		}
	}
}