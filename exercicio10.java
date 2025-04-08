import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Digite um número inteiro: ");
        n1 = scanner.nextInt();
        System.out.print("Digite outro número inteiro: ");
        n2 = scanner.nextInt();
        System.out.print("Digite mais um número inteiro: ");
        n3 = scanner.nextInt();

        if(n1 == n2 && n2 == n3){
            System.out.println("Os números são iguais.");
        } else if(n1 > n2 && n1 > n3) {
            System.out.printf("O número %d é o maior.\n", n1);
        } else if(n2 > n1 && n2 > n3) {
            System.out.printf("O número %d é o maior.\n", n2);
        }else{
            System.out.printf("O número %d é o maior.\n", n3);
        }
        scanner.close();

    }
}
