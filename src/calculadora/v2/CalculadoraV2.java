package calculadora.v2;

public class CalculadoraV2 {

    private double valor1;
    private double valor2;

    private String sinal;

    public CalculadoraV2(double valor1, double valor2, String operador) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.sinal = operador;
    }

    public double somar(){
        return valor1 + valor2;
    }

    public double multiplicar(){
        return valor1 * valor2;
    }

    public double dividir(){
        return valor1 / valor2;
    }


    public String getOperador() {
        return sinal;
    }

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }


}
