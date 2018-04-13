package beans;

public class Cliente{
    private String nome;
    private String cnpj;
    private String endereco;
    private String complemento;
    private String cep;
    private String estado;
    private String cidade;

    public Cliente(String nome, String cnpj, String endereco, 
        String complemento, String cep, String estado, String cidade){
            this.setNome(nome);
            this.setCnpj(cnpj);
            this.setEndereco(endereco);
            this.setComplemento(complemento);
            this.setCep(cep);
            this.setEstado(estado);
            this.setCep(cidade);
    }

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

    
}