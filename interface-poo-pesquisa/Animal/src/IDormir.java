public interface IDormir {
    // interface com implementação com método default
    public default void dormir() {
        boolean dormindo = true;

        if (dormindo == false) {
            System.out.println("O animal está acordado e vai dormir!");
            dormindo = true;
        } else {
            System.out.println("O animal está dormindo!");
        }
    }

    public default void acordar() {
        boolean acordado = true;

        if (acordado == false) {
            System.out.println("O animal está dormindo!");
        } else {
            System.out.println("O animal está acordado!");
            acordado = true;
        }
    }
}
