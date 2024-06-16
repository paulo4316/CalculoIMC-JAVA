import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("Bem vindo ao sistema de calculo de IMC");
        System.out.println("--------------------------------------");

        System.out.print("Digite seu peso (kg): ");
        double peso = scan.nextDouble();
        System.out.print("Digite sua altura (m): ");
        double altura = scan.nextDouble();
        System.out.println("--------------------------------------");
        System.out.println("");


        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é de: %.2f\n", imc);


        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Parabéns! Você está com seu peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Você está acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Você está em nível de obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Você está em nível de obesidade grau II");
        } else if (imc >= 40) {
            System.out.println("Você está em nível de obesidade grau III (Obesidade mórbida)");
        }

        scan.close();
    }
}
