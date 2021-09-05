public class CalculadoraPrincipal {
    
    public static void main(String[] args) {
        
        Calculadora screen = new Calculadora();
        screen.capturaInfos();
        screen.calcula();
        screen.mostrar();
        screen.setValorA(50);
        screen.setValorB(30);
        screen.setop("+");
    }
}