public class Carro {
    private String modelo, marca;
    private double combustivel, consumo, quilometragem;
    boolean carroCriado;
 
    public Carro(String modelo, String marca, double combustivel, double consumo, double quilometragem) {
        if (marca == null || marca.isEmpty()) {
            System.out.println("Marca inválida!");
            this.marca = "Marca inválida";
        } else {
            this.marca = marca;
        }
        if (modelo == null || modelo.isEmpty()) {
            System.out.println("Modelo inválido!");
            this.modelo = "Modelo inválido";
        } else {
            this.modelo = modelo;
        }
        if (consumo <= 0) {
            System.out.println("Consumo inválido!");
            this.consumo = 0;
        } else {
            this.consumo = consumo;
        }
        if (combustivel <= 0) {
            System.out.println("Combustível inválido!");
            this.combustivel = 0;
        } else {
            this.combustivel = combustivel;
        }
        if (quilometragem <= 0) {
            System.out.println("Quilometragem inválida!");
            this.quilometragem = 0;
        } else {
            this.quilometragem = quilometragem;
        }

        this.carroCriado = true; 
        System.out.println("Carro criado com sucesso!");
    }

    public boolean abastecer(double litros) {
        if (!carroCriado) {
            System.out.println("Carro não criado!");
            return false;
            
        }
        if (litros <= 0) {
            System.out.println("Valor inválido!");
            return false;
        } else {
            this.combustivel += litros;
            System.out.println("Abastecido com sucesso!");
            System.out.println("Combustível atual: " + combustivel);
            return true;
        }
    }

    public boolean andar(double distancia) {
        if (!carroCriado) {
            System.out.println("Carro não criado!");
            return false;
            
        }
        if (distancia <= 0) {
            System.out.println("Distância inválida!");
            return false;
        }
        double media = distancia * consumo;
        if (media < consumo) {
            System.out.println("Não há combustível suficiente!");
            return false;
        } else {
            combustivel -= (distancia / consumo);
            quilometragem += distancia; // Atualiza a quilometragem total
            System.out.println("Chegou ao seu destino com sucesso!");
            return true;
        }
    }

    public String exibir() {
        return String.format("Modelo: %s\nMarca: %s\nQuilometragem: %.2f KM\nCombustível: %.2f L\n", modelo, marca, quilometragem, combustivel);
    }
}