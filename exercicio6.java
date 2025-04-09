import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo;
        Double altura, pesoIdeal;
        System.out.print("Digite seu sexo (M/F): ");
        sexo = scanner.nextLine();

        System.out.print("Digite sua altura (em metros): ");
        altura = scanner.nextDouble();
        if (sexo.equals("m")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f kg\n", pesoIdeal);
        } else if (sexo.equals("f")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f kg\n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido.");
        }

        scanner.close();

    }

}
