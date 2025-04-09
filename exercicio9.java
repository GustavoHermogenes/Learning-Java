import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario, pretacao, tetoPrestacao;

        System.out.println("Digite seu salário: ");
        salario = scanner.nextDouble();
        System.out.println("Digite o valor da prestação: ");
        pretacao = scanner.nextDouble();

        tetoPrestacao = salario * 0.30;
        if (pretacao <= tetoPrestacao) {
            System.out.println("Empréstimo concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }
        scanner.close();
    }
    
}
