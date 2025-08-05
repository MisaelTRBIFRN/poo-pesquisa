public class TesteAnimal {
    public static void main(String [] args) {
        Cachorro c = new Cachorro("Cachorro", "Spike", "Preto", "Ruim", 4);
        Galinha g = new Galinha("Galinha", "Clóvis", "Branca", "Sedosa", 2);
        Cobra cb = new Cobra("Cobra", "Piton", "Verde", "Jararaca", 0);
        
        c.exibir();
        System.out.println();

        c.emitirSom();
        c.emitirSom();
        c.seAlimentar("osso");
        c.seMover();

        System.out.println();
        
        g.exibir();

        System.out.println();

        g.emitirSom();
        g.emitirSom();
        g.seAlimentar("milho");
        g.seMover();

        System.out.println();
        
        cb.exibir();

        System.out.println();

        cb.emitirSom();
        cb.emitirSom();
        cb.seAlimentar("rato");
        cb.seMover();

        System.out.println();

        cb.dormir();
        cb.acordar();
    }
}
