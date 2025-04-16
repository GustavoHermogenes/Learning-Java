import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String modelo, marca;
        double combustivel, consumo, quilometragem;
        int opcao;
        Carro carro = null;

        opcao = 0;
        while (opcao != 5) {
            System.out.println("1- Criar carro!");
            System.out.println("2- Abastecer!");
            System.out.println("3- Andar!");
            System.out.println("4- Exibir dados!");
            System.out.println("5- Sair!");

            opcao = Integer.parseInt(scanner.nextLine());
            // O método parseInt() converte uma string em um número inteiro.
            switch(opcao){
                case 1:
                    System.out.println("Digite o modelo do carro: ");
                    modelo = scanner.nextLine();
                    System.out.println("Digite a marca do carro: ");
                    marca = scanner.nextLine();
                    System.out.println("Digite a quilometragem do veículo: ");
                    quilometragem = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite a quantidade de combustível: ");
                    combustivel = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite o consumo do carro: ");
                    consumo = Double.parseDouble(scanner.nextLine());

                    carro = new Carro(modelo, marca, combustivel, consumo, quilometragem);
                    break;
                
                case 2:
                    System.out.println("Digite a quantidade de litros para abastecer: ");
                    double litros = Double.parseDouble(scanner.nextLine());
                    carro.abastecer(litros);

                    break;
            
                case 3:
                    System.out.println("Digite a distância a ser percorrida: ");
                    double distancia = Double.parseDouble(scanner.nextLine());
                    carro.andar(distancia);
                    break;
        
                case 4:
                    System.out.println(carro.exibir());
                    break;
    
                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
