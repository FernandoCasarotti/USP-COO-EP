package beans;

//tenho que ver como funciona importação de enum
public class Veiculo {
    private String marca;
    private String modelo;
    private int pesoMax;
    
    private enum TIPO {
        VAN, CAM2EIXOS, CAM4EIXOS
    }
    
    public Veiculo(String marca, String modelo, int pesoMax, TIPO a){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setPesoMax(pesoMax);
        this.setTipo(a);
    }
    
    public Veiculo(){
    }
    
    private void setMarca(String marca){
        this.marca = marca;
    }
    private void setModelo(String modelo){
        this.modelo = modelo;
    }
    private void setPesoMax(int pesoMax){
        this.pesoMax = pesoMax;
    }
    private void setTipo (TIPO a){
        this.TIPO = TIPO;
    }
    
    private String getMarca(){
        return marca;
    }
    private String getModelo(){
        return modelo;
    }
    private int pesoMax(){
        return pesoMax;
    }
    private TIPO getTipo(){
        this.TIPO = TIPO;
    }  
}
