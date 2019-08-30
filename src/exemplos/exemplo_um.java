package exemplo_um;
import javax.swing.JOptionPane;

public class exemplo_um {
	
	public static void main(String[] args)
	{
		int a;
		digite();
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		dobro(a);
		
	}
	
	static void digite()
	{
		JOptionPane.showMessageDialog(null,"Digite um numero:: ");
	}

	static void dobro(int n)
	{
		int d = n * 2;
		JOptionPane.showMessageDialog(null,"DObro de "+n+" é "+ d);
	}
}
