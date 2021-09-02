public class Calculadora {

    public double resultado;

    /*public void soma(double a, double b) {
        resultado = a + b; 
        System.out.println("O resultado da soma é de: " + resultado);
    } */

    public void soma(double a, double b) {
        resultado = a + b; 
    }
 
    public void  subtracao(double a, double b) {
        resultado = (a - b);
    }
    
    public void  multiplicacao(double a, double b) {
        resultado = (a * b);
    }
    
    public void divisao(double a, double b) {
        resultado = (a / b); 
    }

}