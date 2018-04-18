package beans;

public class Funcionario extends Pessoa{
    private String cpf;
    private String cargo;

    public Funcionario(String nome, String endereco, String complemento, String cep, 
    String estado, String cidade, String cpf, String cargo){
        super(nome, endereco, complemento, cep, estado, cidade, cpf, cargo);
        this.setCpf(cpf);
        this.setCargo(cargo);
    }
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
    }
	public String getCargo()
	{
		return this.cargo;
	}
	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}
}