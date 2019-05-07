import java.util.Scanner;
//alterado do git
public class Princinpal {

	private static Scanner teclado;
	private static Scanner entrada;

	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		teclado = new Scanner(System.in);

		
		int opcao1, opcao2;
		
		do {
			System.out.println("Menu Principal");
			System.out.println("Escolha uma Opcão:\n1 - Pilha Sequencial\n2 - Pilha Encadeada\n3 - Fila Sequencial\n4 - Fila Encadeada\n5 - Lista Sequencial\n6 - Lista Encadeada\n7 - Arvore de Busca Binaria\n8 - Finalizar");
			opcao1 = entrada.nextInt();
			
			switch (opcao1){
			case 1:
				System.out.println("Pilha Sequencial ");
				PilhaSequencial pS = new PilhaSequencial();
				pS.exibirElementos();
				
				do {
					System.out.println("\n1 - push\n2 - pop\n3 - top\n4 - exibir\n5 - Menu Principal");
					opcao2 = entrada.nextInt();
					
					switch (opcao2) {
					case 1:
						System.out.println("Insira(push) algo na pilha: ");
						pS.push(teclado.nextLine());
						break;
					case 2:
						System.out.println("retirar(pop) algo na pilha: ");
						pS.pop();
						break;
					case 3:
						System.out.println("Exibir(top) o topo da pilha: "+pS.elemetoTopo());
						break;
					case 4:
						System.out.println("exibir elementos da pilha: \n");
						pS.exibirElementos();
						break;
						
					}
					System.out.println("\n");
				}while (opcao2 !=5);
				break;
			case 2:
				System.out.println("Pilha Encadeada");
				PilhaEncadeada pE = new PilhaEncadeada();
				pE.exibirElementos();
				
				do {
					System.out.println("\n1 - push\n2 - pop\n3 - top\n4 - exibir\n5 - Menu Principal");
					opcao2 = entrada.nextInt();
					
					switch (opcao2) {
					case 1:
						System.out.println("Insira(push) algo na pilha: ");
						pE.push(teclado.nextLine());
						break;
					case 2:
						System.out.println("retirar(pop) algo na pilha: ");
						pE.pop();
						break;
					case 3:
						System.out.println("Exibir(top) o topo da pilha: "+pE.getTopo());
						break;
					case 4:
						System.out.println("exibir elementos da pilha: \n");
						pE.exibirElementos();
						break;
						
					}
						System.out.println("\n");
				}while (opcao2 !=5);
				break;
			case 3:
				System.out.println("Fila Sequencial");
				FilaSequencial fS = new FilaSequencial();
				fS.exibirFila();
				
				do {
					System.out.println("\n1 - Criar\n2 - Inserir\n3 - Remover\n4 - Exibir\n5 - Menu Principal");
					opcao2 = entrada.nextInt();
					switch (opcao2) {
					case 1:
						System.out.println("Fila Criada");
						break;
					case 2:
						System.out.println("Insira algo na fila: ");
						fS.inserir(teclado.nextLine());
						break;
					case 3:
						System.out.println("Remover algo da fila: ");
						fS.remover();
						break;
					case 4:
						System.out.println("Exibir elementos da fila");
						fS.exibirFila();
						break;
					}
				}while (opcao2 !=5);
				break;
			case 4:
				System.out.println("Fila Encadeada");
				FilaEncadeada fE = new FilaEncadeada();
				fE.exibirFila();
				
				do {
					System.out.println("\n1 - Criar\n2 - Inserir\n3 - Remover\n4 - Exibir\n5 - Menu Principal");
					opcao2 = entrada.nextInt();
					switch (opcao2) {
					case 1:
						System.out.println("Fila Criada");
						break;
					case 2:
						System.out.println("Insira algo na fila: ");
						fE.inserir(teclado.nextLine());
						break;
					case 3:
						System.out.println("Remover algo da fila: ");
						fE.remover();
						break;
					case 4:
						System.out.println("Exibir elementos da fila");
						fE.exibirFila();
						break;
					}
				}while (opcao2 !=5);
				break;
			case 5:
				System.out.println("Lista Sequencial");
				Lista LS = new Lista();
				LS.exibirLista();
				
				do {
					System.out.print( "(1)Criar uma nova lista \n" + "(2)Inserir Elemento \n" + "(3)Remover Elemento \n" +"(4)Exibir Lista \n" + "(5)Voltar ao Menu \n "   );
					opcao2 = entrada.nextInt();
					switch (opcao2) {
					case 1:
						System.out.println("Opcão 1");
						LS = new Lista();
						System.out.println("Lista Criada! ");
						break;
					case 2:
						System.out.println("OpÃ§Ã£o 2");
						System.out.println("Adicione um nome na lista");
						String nome = teclado.nextLine();
						System.out.println("Adicione um idade na lista");
						String idade = teclado.nextLine();
						
						Aluno c1 = new Aluno();
						c1.setNome(nome);	
						c1.setIdade(idade);
						
						LS.inserir(0, c1);
						break;
					case 3:
						System.out.println("Opcão 3");
						
						System.out.println("Qual Aluno vocÃª quer remover?");
						int r = Integer.parseInt(teclado.nextLine());
						
						LS.remover(r-1);
						break;
					case 4:
						System.out.println("Opcão 4");

						LS.exibirLista();
						break;
					
					}
				}while (opcao2 !=5);
				break;
			case 6:
				System.out.println("Lista Encadeada ");
				Lista2 LE = new Lista2();
				LE.exibirLista();
				
				do {
					System.out.print( "(1)Criar uma nova lista \n" + "(2)Inserir Elemento no Inicio da lista \n" + "(3)Inserir Elemento no Final da Lista \n" +"(4)Remover Elemento \n"+"(5)Exibir Lista \n" + "(6)Voltar ao Menu \n "   );
					opcao2 = entrada.nextInt();
					switch (opcao2) {
					case 1:
						System.out.println("Opcão 1");
						LE = new Lista2();
						System.out.println("Lista Criada! ");
					break;
					
					case 2:
						System.out.println("Opcão 2");
						System.out.println("Adicione um nome na lista");
						String nome = teclado.nextLine();
						System.out.println("Adicione um idade na lista");
						String idade = teclado.nextLine();
						
						Aluno c1 = new Aluno();
						c1.setNome(nome);	
						c1.setIdade(idade);
						
						LE.inserirAlunoInicio(c1);
					break;
					
					case 3:
						System.out.println("Opcão 3");
						
						System.out.println("Adicione um nome na Lista");
						String nnome1 = teclado.nextLine().trim();
						System.out.println("Adicione um idade na Lista");
						String idade1 = teclado.nextLine().trim();
						
						Aluno c2 = new Aluno();
						c2.setNome(nnome1);	
						c2.setIdade(idade1);
						LE.inserirNofim(c2);
						
					break;
					
					case 4:
						System.out.println("Opcão 4");
						
						System.out.println("Qual nome você quer remover?");
						String n = teclado.nextLine().trim();
						LE.removeAluno(n);
					break;
						
					case 5: 
						System.out.println("Opcão 5");
						LE.exibirLista();
					break;
					
					case 6:
						System.out.println("voltar");
					break;
					}
				}while (opcao2 !=6);
				break;
			case 7:
				System.out.println("Avore de Busca Binaria");
				NoArvore abb = new NoArvore();
				
				
				do {
					System.out.print( "(1)Inserir Elemento\n" + "(2)Buscar\n" +"(3)Imprimir\n" + "(4)Remover\n7" +"(5)Menu Principal\n"   );
					opcao2 = entrada.nextInt();
					switch (opcao2) {
					case 1:
						System.out.println("opcão 1");
						System.out.println("digite o numero que deseja inserir");
						int x = teclado.nextInt();
						abb.insere(abb, x);
						break;
					case 2:
						System.out.println("opcão 2");
						System.out.println("digite o numero que deseja buscar");
						int b = teclado.nextInt();
						abb.busca(abb,b);
						break;
					case 3:
						System.out.println("opcão 3");
						abb.imprime(abb);
						break;
					case 4:
						System.out.println("opcão 4");
						System.out.println("digite o numero que deseja remover");
						int y = teclado.nextInt();
						abb.remover(abb,y);
						
						break;
					case 5:
						System.out.println("opcão 5");
						break;
					}
				}while (opcao2 !=5);
				break;
			}
			
			
		}while (opcao1 !=8);
		System.out.println("\nFinalizado");
	}
}
