import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner eixo = new Scanner(System.in);

        System.out.println("Olá, digite as coordenadas do ponto no eixo x e y:");
        double x1 = eixo.nextDouble();
        double y1 = eixo.nextDouble();

        System.out.println("Digite as coordenadas do ponto no eixo x2 e y2:");
        double x2 = eixo.nextDouble();
        double y2 = eixo.nextDouble();

        double r1 = x2 - x1;
        double r2 = y2 - y1;

        double distancia = Math.sqrt(Math.pow(r1, 2) + Math.pow(r2, 2));

        System.out.println("A distância entre os pontos é: " + distancia);

        eixo.close();
    }
}
