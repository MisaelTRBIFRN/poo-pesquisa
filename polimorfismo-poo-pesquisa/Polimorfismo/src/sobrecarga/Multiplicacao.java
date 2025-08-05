//sobrecarga
package sobrecarga;

class Multiplicacao {

    // Método que soma dois inteiros
    public double Multiplicador(double a, double b , double c) {
        return a * b * c;
    }

    public double Multiplicador(double a, double b) {
        return a * b;
    }

    public int Multiplicador(int a, int b) {
        return a * b;
    }

    public int Multiplicador(int a, int b , int c) {
        return a * b * c;
    }
}