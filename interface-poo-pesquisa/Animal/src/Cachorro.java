public class Cachorro extends Animal {
    // construtores
    public Cachorro() {
        setAnimal("Cachorro");
        setNPatas(4);
    }

    public Cachorro(String animal, String nome, String cor, String raca, int nPatas) {
        super(animal, nome, cor, raca, nPatas);
    }

    // métodos das interfaces
    @Override
    public void emitirSom() {
        System.out.println(this.getNome() + " late: AU, AU!");
    }

    @Override
    public void seMover() {
        System.out.println(this.getNome() + " está correndo e abanando o rabo!");
    }
}
