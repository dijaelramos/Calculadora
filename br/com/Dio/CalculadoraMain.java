import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {
      
        Scanner calculos = new Scanner(System.in);

        double a, b;

        //Entrada de dados do usuário
        System.out.println("Digite o primeiro número: ");
        a = calculos.nextDouble();

        System.out.println("Digite o segundo número: ");
        b = calculos.nextDouble();

        //Saída de das respostas na tela
        System.out.println("Com o primeiro número: " + a + " e o segundo número: " + b + " as respostas são de:");
        System.out.println(soma(a, b));
        System.out.println(subtracao(a, b));
        System.out.println(multiplicacao(a, b));
        System.out.println(divisao(a, b));
    }

    public static String soma(double a, double b) {
        return "A soma deu: " + (a + b);
    }

    public static String subtracao(double a, double b) {
        return"A subtração deu: " + (a - b);
    }
    
    public static String multiplicacao(double a, double b) {
        return "A multiplicação deu: " + (a * b);
    }
    
    public static String divisao(double a, double b) {
        return "A divisão deu: " + (a / b);
    }
}