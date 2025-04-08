import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Você é alfabetizado? (Sim/Não)");
        String alfabetizado = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();
        entrada.nextLine(); 

        System.out.println("Você nasceu no Brasil ou tem nacionalidade brasileira? (Sim/Não)");
        String nacionalidade = entrada.nextLine();

        System.out.println("Seu título de eleitor está regular? (Sim/Não)");
        String titulo = entrada.nextLine();

        if (nacionalidade.equalsIgnoreCase("Sim") && titulo.equalsIgnoreCase("Sim") && idade >= 16) {
            System.out.println("Você está apto para votar!");

            if (idade >= 70 || idade == 16 || idade == 17 || alfabetizado.equalsIgnoreCase("Não")) {
                System.out.println("Lembrando que o voto é facultativo para maiores de 70 anos, analfabetos e jovens de 16 e 17 anos.");
            }
        } else {
            System.out.println("Você não está apto para votar!");
        }

        entrada.close();
    }
}