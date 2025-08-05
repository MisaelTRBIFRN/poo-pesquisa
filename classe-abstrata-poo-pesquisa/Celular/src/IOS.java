public class IOS extends Celular {

    public IOS(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {
        System.out.println("\nLigando " + modelo + " com botão lateral(power) e logotipo da maçã");
    }
}
