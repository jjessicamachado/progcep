import javax.swing.*;
public class UsaFuncionario {

	public static void main(String[] args) {
		Cep c[] = new Cep[3];
		for (int i=0; i<3; i++) {
			c[i] = new Cep();
			c[i].setCodigo(JOptionPane.showInputDialog("Entre com o CEP:"));
			c[i].setBairro(JOptionPane.showInputDialog("Entre com o Bairro:"));
			c[i].setRua(JOptionPane.showInputDialog("Entre com a Rua:"));
		}
		
		Funcionario f[] = new Funcionario[5];
			for (int i=0; i<5; i++) {
				f[i] = new Funcionario();
				f[i].setNome(JOptionPane.showInputDialog("Entre com o Nome:"));
				f[i].setEndereco(JOptionPane.showInputDialog("Entre com o Complemento:"));
				int codcep = Integer.parseInt(JOptionPane.showInputDialog("Entre com o CEP:"));
				for (int j=0; j<3; j++) {
					if (codcep==c[j].getCodigo())
						f[i].setCepFunc(c[j]);
				}
			}
			for(int i=0;i<5;i++) {
				JOptionPane.showMessageDialog(null, "Nome: " + f[i].getNome() + "\nRua: " + f[i].getRuaFunc() + "\nBairro: " + f[i].getBairroFunc());
			}
	}

}
