public class Main {
    public static void main(String[] args) {
        Celular iphone = new IOS("iPhone 17");
        Celular android = new Android("Samsung galaxy a32 4g");

        iphone.ligar();            
        iphone.carregarBateria();

        android.ligar();         
        android.carregarBateria(); 
    }
}
