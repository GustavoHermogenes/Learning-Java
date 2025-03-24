import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args ) {
        Scanner numeros = new Scanner(System.in);
        int num1, num2, num3, maior;

        System.out.println("digite três números inteiros: ");
        num1 = numeros.nextInt();
        num2 = numeros.nextInt();
        num3 = numeros.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números são iguais.");
        }else{
            maior = Math.max(num1, Math.max(num2, num3));
            //O código do Math.max serve para fazer um comparativo entra dois números e retornar o maior
            System.out.println("O maior número é o " + maior);

        }
        numeros.close();

    }
}
