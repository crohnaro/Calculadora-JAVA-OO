import java.util.Scanner;
public class Calculadora {

    private Scanner keyInput;
    private int valorA;
    private int valorB;
    private char op;

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public char getop() {
        return op;
    }

    public void setop(char op) {
        this.op = op;
    }

    private boolean testarValor(int valorX) {
        if(valorX > -50 && valorX < 50) {
            return true;
        } else {
            System.out.println("!ALERTA! Digite apenas números maiores que -50 e menores que 50! \n"
                                + "Tente novamente! \n");
            return false;
        }
    }

    private boolean testarOperador(char sinal) {
        if(sinal == '+' || sinal == '-' || sinal == '*' || sinal == '/') {
            return true;
        } else {
            System.out.println("!ALERTA! Operador Inválido! \n"
                                + "Tente novamente! \n");
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
        double result = valorA / valorB;
        if(valorB != 0) {
            return result;
        } else {
            System.out.println("!ALERTA! Não se divide por 0! \n"
                                + "Tente novamente! \n");
            return 0;
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
  
        do {
            System.out.println("Digite o primeiro valor: ");
            valorA = keyInput.nextInt();
            testarValor(valorA);
        } while(!testarValor(valorA));

        do {
            System.out.println("Digite o operador: ");
            op = keyInput.next().charAt(0);
            testarOperador(op);  
        } while(!testarOperador(op));

        do {
            System.out.println("Digite o segundo valor: ");
            valorB = keyInput.nextInt();
            testarValor(valorB);
        } while(!testarValor(valorB));
    }
}
