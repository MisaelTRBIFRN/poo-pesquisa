package sobrecarga;

public class Teste_sobrecarga_overloading{
    public static void main(String[] args) throws Exception {
        //sobrecarga (overloading).

        Multiplicacao calc = new Multiplicacao();
        
        // Chamando os métodos sobrecarregados
        System.out.println(calc.Multiplicador(2, 3));                   // Chama somar(int, int)
        System.out.println(calc.Multiplicador(2, 3, 4));              // Chama somar(int, int, int)
        System.out.println(calc.Multiplicador(2.5, 3.5));               // Chama somar(double, double)
        System.out.println(calc.Multiplicador(2.5, 3.5 , 4.5));       // Chama somar(double, double , double)

    }
}
