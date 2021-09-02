import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadoraMain {
    public static void main(String[] args) {
      
       // double a, b;

        String num1 = JOptionPane.showInputDialog(null, "Digite o primeiro número", "Calculadora", JOptionPane.QUESTION_MESSAGE);

        String num2 = JOptionPane.showInputDialog(null, "Digite o Segundo número", "Calculadora", JOptionPane.QUESTION_MESSAGE);

        int PrimeiroNum = Integer.parseInt(num1);
        int SegundoNum = Integer.parseInt(num2);

        //SAÍDA DE DADOS NA TELA

        JOptionPane.showMessageDialog(null, "A soma deu: " + soma + "\n A subtração deu: " + subtracao + " \n A divisão deu: " + divisao +"\n A multiplicação deu: " + multiplicacao, JOptionPane.INFORMATION_MESSAGE);


        /*
        JOptionPane.showMessageDialog(null, resultado, JOptionPane.INFORMATION_MESSAGE);
        */


        /*==============SEGUNDO JEITO DE RESOLVER A SAÍDA DE DADOS=============================
        Scanner calculos = new Scanner(System.in);

        Calculadora soma = new Calculadora();

        //Entrada de dados do usuário
        System.out.println("Digite o primeiro número: ");
        a = calculos.nextDouble();

        System.out.println("Digite o segundo número: ");
        b = calculos.nextDouble();

        //Saída de das respostas na tela
        System.out.println("Com o primeiro número: " + a + " e o segundo número: " + b + " as respostas são de:");

        soma.soma(a, b);
        /* System.out.println(soma(a, b));
         System.out.println(subtracao(a, b));
        System.out.println(multiplicacao(a, b));
        System.out.println(divisao(a, b)); */
    }
}