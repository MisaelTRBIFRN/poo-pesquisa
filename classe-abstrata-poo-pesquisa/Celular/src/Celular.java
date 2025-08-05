public abstract class Celular {
    protected String modelo;

    public Celular(String modelo) {
        this.modelo = modelo;
    }

    public abstract void ligar();

    public void carregarBateria() {
        System.out.println(modelo + " está carregando a bateria.");
    }
}
