//Sobreposição
// Método derivado da classe (CalcularIpvaPorEstado).
package sobrescrita;

public class RioGrandeDoNorte extends CalcularIpvaPorEstado {

    public RioGrandeDoNorte(double v_dcarro){
        super(v_dcarro);
    }

    @Override
    public double c_ImpostoIpva() {
      return 0.03 * getV_dcarro();      
    }

    @Override
    public void exibir(){
        System.out.println("Sua taxa de Imposto é 3%");
        super.exibir();
    }
}
