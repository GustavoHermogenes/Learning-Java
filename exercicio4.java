import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextFloat();   
        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextFloat();
        if(n1 == n2){
            System.out.println("Os números são iguais.");
        } else if(n1 > n2) {
            System.out.printf("O número %.2f é o maior.\n", n1);
        } else {
            System.out.printf("O número %.2f é o maior.\n", n2);
        }
        scanner.close();
    }
}
