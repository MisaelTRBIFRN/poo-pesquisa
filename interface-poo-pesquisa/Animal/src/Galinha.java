import java.util.Random;

public class Galinha extends Animal {
    Random rand = new Random();
    
    // construtores
    public Galinha() {
        setAnimal("Galinha");
        setNPatas(2);
    }

    public Galinha(String animal, String nome, String cor, String raca, int nPatas) {
        super(animal, nome, cor, raca, nPatas);
    }

    // métodos das interfaces
    @Override
    public void emitirSom() {
        int somAlt = rand.nextInt(2);

        switch (somAlt) {
            case 0:
                System.out.println(this.getNome() + " cacareja: Pó, Pó!");
            break;
            case 1:
                System.out.println(this.getNome() + " cacareja: Có, Có!");
            break;
        }
    }

    @Override
    public void seMover() {
        System.out.println(this.getNome() + " está correndo com as suas " + getNPatas() + " pernas!");
    }
}
