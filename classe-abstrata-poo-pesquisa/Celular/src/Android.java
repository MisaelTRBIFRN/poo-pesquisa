public class Android extends Celular {

    public Android(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando " + modelo + " com botão lateral(power) e animação Android");
    }
}
