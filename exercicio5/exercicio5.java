package exercicio5;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String [] argt){
        Scanner scanner = new Scanner(System.in);
        int codigo;

        produto p = new produto();
        produto p2 = new produto();
        produto p3 = new produto();
        produto p4 = new produto();
        produto p5 = new produto();

        p.codigo = 100;
        p.nome = "Cachorro quente";
        p.valor = 1.2;

        p2.codigo = 101;
        p2.nome = "Bauru Simples";
        p2.valor = 1.3;

        p3.codigo = 102;
        p3.nome = "Bauru com ovo";
        p3.valor = 1.5;

        p4.codigo = 103;
        p4.nome = "Hamburguer";
        p4.valor = 1.2;

        p5.codigo = 104;
        p5.nome = "Cheeseburguer";
        p5.valor = 1.3;


        System.out.println("==================================");
        System.out.println("Código  |       Nome       | Valor");
        System.out.println("==================================");
        System.out.println("100     |  Cachorro quente | R$1,2");
        System.out.println("101     |   Bauru Simples  | R$1,3");
        System.out.println("102     |   Bauru com ovo  | R$1,5");
        System.out.println("103     |     Hamburguer   | R$1,2");
        System.out.println("104     |   Cheeseburguer  | R$1,3");
        System.out.println("Escreva o código do produto que deseja:");
        codigo = scanner.nextInt();

        

        scanner.close();
    }
}
