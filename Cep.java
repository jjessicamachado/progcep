
public class Cep {
	private int codigo;
	private String rua, bairro;
	
	public Cep() {
		codigo = 0;
		rua = "";
		bairro = "";
	}
	public Cep(int cod, String srua, String sbairro) {
		codigo = cod;
		rua = srua;
		bairro = sbairro;
	}
	public void setCodigo(String cod) {
		codigo = Integer.parseInt(cod);
	}
	public void setRua(String srua) {
		rua = srua;
	}
	public void setBairro(String sbairro) {
		bairro = sbairro;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
}
