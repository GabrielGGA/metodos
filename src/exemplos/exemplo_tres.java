package exemplo_um;

import javax.swing.JOptionPane;

public class exemplo_tres {

	public static void main(String[] args)
	{
		int idade1, idade2;
		String nome1, nome2;
		
		nome1=JOptionPane.showInputDialog("digite o nome da 1� pessoa :: ");
		idade1=Integer.parseInt(JOptionPane.showInputDialog("digite a idade da 1�pessoa: "));
		
		nome2=JOptionPane.showInputDialog("digite o nome da 2�pessoa :: ");
		idade2=Integer.parseInt(JOptionPane.showInputDialog("digite a idade da 2� pessoa"));
		
		String texto = PessoaMaisVelha(nome1, idade2, nome2, idade2);
		
		JOptionPane.showMessageDialog(null,texto);
		
	}
	
	static String  PessoaMaisVelha(String n1, int id1, String n2, int id2)
	{
			if (id1 > id2)
				return n1 + "� a pessoa mais velha";
			else 
				if (id2 >id1)
					return n2 + "� a pessoa mais velha";
				else
					return n1 + " � a pessoa mais velha";
			}
		}


