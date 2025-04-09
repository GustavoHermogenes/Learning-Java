import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario; 
        int tempoServico;

        System.out.println("Digite seu salário: ");
        salario = scanner.nextDouble();
        System.out.println("Digite seu tempo de serviço em anos: ");
        tempoServico = scanner.nextInt();
        if (tempoServico >= 5){
            salario = salario * 0.20;
            System.out.printf("Seu salário com aumento é %.2f reais%n", salario);
        } else{
            salario = salario * 0.10;
            System.out.printf("Seu salário com aumento é %.2f reais%n", salario);
        }
        scanner.close();
    }    
}
