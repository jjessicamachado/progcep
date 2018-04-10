
public class Funcionario {
	private String nome, endereco;
	private Cep cep;
	
	public Funcionario() {
		nome = "";
		endereco = "";
		cep = null;
	}
	public void setNome(String snome) {
		nome = snome;
	}
	public void setEndereco(String sender) {
		endereco = sender;
	}
	public void setCepFunc (Cep scep) {
		cep = scep;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public Cep getCepFunc() {
		return cep;
	}
	public String getRuaFunc() {
		return cep.getRua();
	}
	public String getBairroFunc() {
		return cep.getBairro();
	}
}
