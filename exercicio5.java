import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;

        System.out.println("Digite um número inteiro: ");
        n1 = scanner.nextInt();
        if (n1 >= 50 && n1 <= 100) {
            System.out.println("O número pertence ao grupo ");
        } else{
            System.out.println("O número não pertence ao grupo ");
        } 
            
        scanner.close();
        }

    }

