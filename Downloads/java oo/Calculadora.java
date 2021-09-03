import java.util.Scanner;

public class Calculadora {

    private Scanner keyInput;
    private int valorA;
    private int valorB;
    private char op;

    private boolean testarValor(int valorX) {
        if(valorX > 50 || valorX < -50) {
            System.out.println("!ALERTA! Digite apenas números entre -50 e 50! \n"
                                + "Tente novamente!");
            return false;
        } else {
            return true;
        }
    }

    private boolean testarOperador(char sinal) {
        if(sinal == '+' || sinal == '-' || sinal == '*' || sinal == '/') {
            return true;
        } else {
            System.out.println("Operador Inválido!");
            return false;
        }
    }

    private int soma() {
        int result = valorA + valorB;
        return result;
    }

    private int subt() {
        int result = valorA - valorB;
        return result;
    }

    private int mult() {
        int valorC = 0;
        while (valorA != 0) {
            valorC += valorB;
            valorA--;
        }
        return valorC;
    }

    private double divi() {
        if(valorB == 0) {
            System.out.println("Não se divide por 0!");
            return 0;
        } else {
            double result = valorA / valorB;
            return result;
        }
    }

    public double calcula() {
        
        if(op == '+') {return soma();}
        else if(op == '-') {return subt();}
        else if(op == '*') {return mult();}
        else {return divi();}  
    }

    public void mostrar() {
        if(op == '+') {
            System.out.println(valorA + " + " + valorB + " = " + soma());
        } else if(op == '-') {
            System.out.println(valorA + " - " + valorB + " = " + subt());
        } else if(op == '*') {
            System.out.println(valorA + " * " + valorB + " = " + mult());
        } else if(op == '/') {
            System.out.println(valorA + " / " + valorB + " = " + divi());
        }
    }

    public void capturaInfos() {

        keyInput = new Scanner(System.in);
        
        do{
        System.out.println("Digite o primeiro valor: ");
        valorA = keyInput.nextInt();
        testarValor(valorA);
        } while (!testarValor(valorA));
        
        
        do {
        System.out.println("Digite o operador: ");
        op = keyInput.next().charAt(0);
        testarOperador(op);
        }while(!testarOperador(op)); 
        
        do {
        System.out.println("Digite o segundo valor: ");
        valorB = keyInput.nextInt();
        testarValor(valorB);
        }while(!testarValor(valorB));
        
    }
}
