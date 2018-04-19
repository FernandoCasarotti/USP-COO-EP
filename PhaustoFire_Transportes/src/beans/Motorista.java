package beans;

public class Motorista extends Funcionario{
    private boolean tipoCarta[] = new boolean[3];

    public Motorista(String nome, String endereco, String complemento, String cep, 
    String estado, String cidade, String cpf, String cargo, int codigoPessoa, boolean tipoCarta[]){
        super(nome, endereco, complemento, cep, estado, cidade, codigoPessoa, cpf, cargo);
        this.setTipocarta(tipoCarta);
    }

	public boolean [] getTipocarta()
	{
		return this.tipoCarta;
	}

	public void setTipocarta(boolean tipoCarta[])
	{
		this.tipoCarta = tipoCarta;
	}
    
    
}