package calculadora.v2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        while (true){
            System.out.println("------------Calculadora------------");

            System.out.println("------Insira o primeiro valor------");
            double valor1 = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("-----Insira o sinal da operação----");
            String sinal = scanner.nextLine();

            System.out.println("------Insira o segundo valor-------");
            double valor2 = scanner.nextDouble();
            scanner.nextLine();



            if (sinal.equalsIgnoreCase("*")){
                CalculadoraV2 calculadora = new CalculadoraV2(valor1, valor2, sinal);
                System.out.println("---------" + valor1 + " " + sinal + " " + valor2 + " = " + calculadora.multiplicar() + "----------- \n ");

                System.out.println("Deseja sair? (S/N) : ");
                String sair = scanner.nextLine();

                if (sair.equalsIgnoreCase("s")){
                    System.out.println("Encerrando a calculadora");
                    break;
                }


            } else if (sinal.equalsIgnoreCase("+")) {
                CalculadoraV2 calculadora = new CalculadoraV2(valor1, valor2, sinal);
                System.out.println("O resultado de " + valor1 + " " + sinal + " " + valor2 + " = " + calculadora.somar()+ "\n ");

                System.out.println("Deseja sair? (S/N) : ");
                String sair = scanner.nextLine();

                if (sair.equalsIgnoreCase("s")){
                    System.out.println("Encerrando a calculadora");
                    break;
                }

            } else if (sinal.equalsIgnoreCase("/")) {
                CalculadoraV2 calculadora = new CalculadoraV2(valor1, valor2, sinal);
                System.out.println("O resultado de " + valor1 + " " + sinal + " " + valor2 + " = " + calculadora.dividir()+ "\n ");


                System.out.println("Deseja sair? (S/N) : ");
                String sair = scanner.nextLine();

                if (sair.equalsIgnoreCase("s")){
                    System.out.println("Encerrando a calculadora");
                    break;
                }

            }
        }
    }
}
