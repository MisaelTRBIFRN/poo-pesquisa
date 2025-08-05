package sobrescrita;

public abstract class CalcularIpvaPorEstado{
    protected double v_dcarro;
    protected double Valor_Final;

    public CalcularIpvaPorEstado(double v_dcarro) {
        this.v_dcarro = v_dcarro;
    }    

    public double getV_dcarro() {
        return this.v_dcarro;
    }

    public void setV_dcarro(double v_dcarro) {
        if(v_dcarro > 0){
            this.v_dcarro = v_dcarro;
        }else{
            System.out.println("ERRO!");
        }
    }

    public abstract double c_ImpostoIpva();
        
    public void exibir(){
        System.out.println("Valor do IPVA a Pagar: R$" + c_ImpostoIpva());
    }
}