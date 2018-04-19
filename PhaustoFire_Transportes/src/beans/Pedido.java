package beans;

public class Pedido{
    private Cliente cliente;
    private Motorista motorista;
    private int codigoPedido;
    private double peso;
    private String tipoCarga;
    private int riscoCarga; 
    private double distancia;
    private boolean finalizado;

    public Pedido(Cliente cliente, Motorista motorista, int codigoPedido, double peso, String tipoCarga, int riscoCarga, double distancia, boolean finalizado){
       this.setCliente(cliente); 
       this.setMotorista(motorista);
       this.setCodigopedido(codigoPedido);
       this.setPeso(peso);
       this.setTipocarga(tipoCarga);
       this.setRiscocarga(riscoCarga);
       this.setDistancia(distancia);
       this.setFinalizado(finalizado);
    }

	public Cliente getCliente()
	{
		return this.cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

	public Motorista getMotorista()
	{
		return this.motorista;
	}

	public void setMotorista(Motorista motorista)
	{
		this.motorista = motorista;
	}

	public int getCodigopedido()
	{
		return this.codigoPedido;
	}

	public void setCodigopedido(int codigoPedido)
	{
		this.codigoPedido = codigoPedido;
	}

	public double getPeso()
	{
		return this.peso;
	}

	public void setPeso(double peso)
	{
		this.peso = peso;
	}

	public String getTipocarga()
	{
		return this.tipoCarga;
	}

	public void setTipocarga(String tipoCarga)
	{
		this.tipoCarga = tipoCarga;
	}

	public int getRiscocarga()
	{
		return this.riscoCarga;
	}

	public void setRiscocarga(int riscoCarga)
	{
		this.riscoCarga = riscoCarga;
	}

	public double getDistancia()
	{
		return this.distancia;
	}

	public void setDistancia(double distancia)
	{
		this.distancia = distancia;
	}

	public boolean getFinalizado()
	{
		return this.finalizado;
	}

	public void setFinalizado(boolean finalizado)
	{
		this.finalizado = finalizado;
	}


    
}