import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, desconto;

        System.out.print("Digite o valor do seu salário: ");
        salario = scanner.nextDouble();

        if (salario < 600) {
            System.out.println("Você está isento de imposto de renda.");
        } else if (salario >= 600 && salario <= 1200) {
            desconto = salario * 0.20;
            salario = salario - desconto;
            System.out.printf("Seu salário com desconto será %.2f reais%n", salario);
        } else if (salario > 1200 && salario <= 2000) {
            desconto = salario * 0.25;
            salario = salario - desconto;
            System.out.printf("Seu salário com desconto será %.2f reais%n", salario);
        } else {
            desconto = salario * 0.30;
            salario = salario - desconto;
            System.out.printf("Seu salário com desconto será %.2f reais%n", salario);
        }

        scanner.close();
    }
}