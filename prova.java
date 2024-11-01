import javax.swing.JOptionPane;
public class Prova1 {
	public static void main(String[] args) {
		String op = "0";
		do {
			op = JOptionPane.showInputDialog("[1] - Cadastrar Pessoa\n[2] - Alterar Pessoa\n[3] - Excluir Pessoa\n[4] - Listar Pessoa\n[5] - Pesquisar Pessoa por ID\n[6] - Criador\n[7] - Sair");
			switch(op) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				JOptionPane.showMessageDialog(null, "Higor Robert Barbist 04723-027");
				break;
			case "7":
				JOptionPane.showMessageDialog(null, "Programa Encerrado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}while(!op.equals("7"));
	}
}




import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
   	 
    	int op = 0, id_pessoa = 0, id_pessoa_aux = 0;
    	int[] pessoa = new int[50];
    	int i;
   	 
    	Scanner sc = new Scanner(System.in);
   	 
   	 
    	do{
        	System.out.print("\n[1] - Cadastrar Pessoa\n[2] - Alterar Pessoa\n[3] - Excluir Pessoa\n[4] - Listar Pessoa\n[5] - Pesquisar pessoa\n[6] - Criador\n[7] - Sair\nDigite uma opção:");
        	op = sc.nextInt();
        	switch(op){
           	case 1:
                	System.out.print("Digite o nome da pessoa: ");
                	pessoa[id_pessoa++] = sc.nextInt();
                	System.out.print("Nome adicionado!\n");
                	break;
               	 
           	case 2:
               	System.out.print("Qual o ID da pessoa que deseja alterar? ");
               	id_pessoa_aux = sc.nextInt();
               	if(0 <= id_pessoa_aux && id_pessoa_aux <= id_pessoa){
                    	System.out.print("Digite o NOVO nome: ");
                    	pessoa[id_pessoa_aux] = sc.nextInt();
                    	System.out.print("Pessoa Alterada com Sucesso!\n");
               	}
               	else
                    	System.out.print("Opção Inválida...");
                	break;
               	 
           	case 3:
               	System.out.print("Qual o ID da pessoa que deseja EXCLUIR? ");
               	id_pessoa_aux = sc.nextInt();
               	if(0 <= id_pessoa_aux && id_pessoa_aux <= id_pessoa)
               	{
                     	for(i = id_pessoa_aux; i < id_pessoa - 1; i++) {
                        	pessoa[i] = pessoa[i + 1];
                    	}
                   	 
                    	pessoa[id_pessoa - 1] = 0;
                    	id_pessoa--;
                   	 
                    	System.out.print("Pessoa Excluida com Sucesso!\n");
               	}
                	else {
                    	System.out.print("ID inválido...\n");
                	}
                	break;
               	 
           	case 4:
               	for(i = 0; i < id_pessoa; i++){
                   	System.out.println("ID......" + i);
                   	System.out.println("Nome...." + pessoa[i] + "\n");
               	}
                	break;
               	 
           	case 5:
               	System.out.print("Qual o ID da pessoa que deseja MOSTRAR? ");
               	id_pessoa_aux = sc.nextInt();
               	if(0 <= id_pessoa_aux && id_pessoa_aux <= id_pessoa - 1){
                   	System.out.println("ID......" + id_pessoa_aux);
                   	System.out.println("Nome...." + pessoa[id_pessoa_aux] + "\n");
               	}
               	else
                    	System.out.print("Opção Inválida...");
                	break;
               	 
           	case 6:
               	System.out.print("Higor Robert Barbist 04723-027");
                	break;
               	 
           	case 7:
               	System.out.print("Programa Encerrado!");
                	break;
           	default:
                	System.out.print("Digite um opção válida...");
        	}
      	 
    	}while(op != 7);
   	 
    	sc.close();
	}
}