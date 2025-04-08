import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String simbolo;
        double n1, n2, resultado;

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o símbolo da operação desejada: ");
        simbolo = scanner.nextLine();

        if (!simbolo.equals("+") && !simbolo.equals("-") && !simbolo.equals("*") && !simbolo.equals("/")) {
            System.out.println("O sinal da operação é invalido!");
        }else if(simbolo.equals("/")){
            if(n2 <=0){
                System.out.println("Divisão por zero não é permitida para números menores que zero.");
            }else{
                resultado = n1 / n2;
                System.out.printf("Resultado: %.2f\n", resultado);}
        } else {
            switch (simbolo) {
                case "+":
                    resultado = n1 + n2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
                case "-":
                    resultado = n1 - n2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
                case "*":
                    resultado = n1 * n2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                    break;
            }
            
        }
     
        scanner.close();
    }
}
