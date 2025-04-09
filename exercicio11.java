import java.util.Scanner;

public class exercicio11 {
    public static void main(String [] argt){
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.print("Escreva sua idade: ");
        idade = scanner.nextInt();

        if (idade < 5) {
            System.out.println("Idade do nadador é inferior à permitida.");
        }else if (idade <= 7) {
            System.out.println("o nadador pertence ao grupo infantil A");
        }else if (idade <= 10) {
            System.out.println("o nadador pertence ao grupo infantil B");
        }else if (idade <= 13) {
            System.out.println("o nadador pertence ao grupo juvenil A");
        }else if (idade <= 17) {
            System.out.println("o nadador pertence ao grupo juvenil B");
        }else if (idade > 18) {
            System.out.println("o nadador pertence ao grupo Sênior");
        }

        scanner.close();

    }
}
