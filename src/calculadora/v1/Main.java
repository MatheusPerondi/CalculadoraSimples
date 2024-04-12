package calculadora.v1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        while (true){
            System.out.println("--------calculadora.v1.Calculadora-------");
            System.out.println("1 -----Multiplicação------");
            System.out.println("2 --------Adição----------");
            System.out.println("3 --------Divisão---------");
            System.out.println("4 ---------exit-----------");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1){
                System.out.println("Insira o primeiro valor da Multiplicação: ");
                int valor1 = scanner.nextInt();
                System.out.println("Insira o segundo valor da Multiplicação: ");
                int valor2 = scanner.nextInt();
                Calculadora calculadora = new Calculadora(valor1, valor2);
                System.out.println("O resultado de " + valor1 + " X " + valor2 + " = " + calculadora.multiplicar());

            } else if (opcao == 2) {
                System.out.println("Insira o primeiro valor da Adição: ");
                int valor1 = scanner.nextInt();
                System.out.println("Insira o segundo valor da Adição: ");
                int valor2 = scanner.nextInt();
                Calculadora calculadora = new Calculadora(valor1, valor2);
                System.out.println("O resultado de " + valor1 + " + " + valor2 + " = " + calculadora.somar());

            } else if (opcao == 3) {
                System.out.println("Insira o primeiro valor da Divisão: ");
                int valor1 = scanner.nextInt();
                System.out.println("Insira o segundo valor da Divisão: ");
                int valor2 = scanner.nextInt();
                Calculadora calculadora = new Calculadora(valor1, valor2);
                System.out.println("O resultado de " + valor1 + " / " + valor2 + " = " + calculadora.dividir());

            } else if (opcao == 4) {
                System.out.println("Encerrando calculadora!!!!");
                break;
            }
        }
    }
}
