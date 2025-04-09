import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();

        if(n1 == n2){
            System.out.println("Os números são iguais.");
        } else{
            n1 = n1 - n2;
            System.out.printf("A diferença entre os números é %d. \n", n1);
        }

        scanner.close();
    }
}
