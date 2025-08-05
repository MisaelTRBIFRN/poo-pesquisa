public class Cobra extends Animal {
    // construtores
    public Cobra() {
        setAnimal("Cobra");
        setNPatas(0);
    }

    public Cobra(String animal, String nome, String cor, String raca, int nPatas) {
        super(animal, nome, cor, raca, nPatas);
    }

    // métodos das interfaces
    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " chia: Sssssssssssssss!");
    }

    @Override
    public void seMover() {
        System.out.println(this.getNome() + " está rastejando!");
    }
}
