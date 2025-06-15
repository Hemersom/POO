
import java.util.*;

public class Frota {

    protected int max;
    protected int countVeiculos;
    protected int countAlugaveis;
    protected Veiculo[] veiculos;
    protected Alugavel[] veiculoAlugaveis;

    public Frota(int max) {
        this.max = max < 0 ? 10 : max;
        this.veiculos = new Veiculo[this.max];
        this.veiculoAlugaveis = new Alugavel[this.max];
        this.countVeiculos = 0;
        this.countAlugaveis = 0;
    }

    public int getMax() {
        return max;
    }

    public int getCountVeiculos() {
        return countVeiculos;
    }

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public Alugavel[] getVeiculoAlugaveis() {
        return veiculoAlugaveis;
    }

    public void listarTudo() {
        System.out.println("=== VEÍCULOS CADASTRADOS ===");
        for (Veiculo v : veiculos) {
            v.exibirDados();
        }
    }

    public void buscarPlaca(String placa) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                v.exibirDados();
                return;
            }
        }
        System.out.println("Nenhum veículo encontrado");
    }

    public void listarVeiculosPorTipo(String tipo) {
        boolean encontrou = false;
        for (int i = 0; i < countVeiculos; i++) {
            Veiculo v = veiculos[i];
            if (tipo.equalsIgnoreCase("Carro") && v instanceof Carro) {
                v.exibirDados();
                encontrou = true;
            } else if (tipo.equalsIgnoreCase("Van") && v instanceof Van) {
                v.exibirDados();
                encontrou = true;
            } else if (tipo.equalsIgnoreCase("Caminhao") && v instanceof Caminhao) {
                v.exibirDados();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum veículo do tipo " + tipo + " foi encontrado.");
        }
    }

    public void exibirAlugaveis(int nDias) {
        System.out.println("=== VEÍCULOS ALUGÁVEIS (" + nDias + " dias) ===");
        boolean encontrou = false;

        for (int i = 0; i < countAlugaveis; i++) {
            Alugavel a = veiculoAlugaveis[i];

            if (a instanceof Veiculo) {
                Veiculo v = (Veiculo) a;
                System.out.println(v + " – Valor para " + nDias + " dias: R$ " + a.calcularValorAluguel(nDias));
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum veículo disponível para aluguel.");
        }
    }

    public void addVeiculo(Scanner input, String tipo) {
        if (this.countVeiculos >= this.max) {
            System.out.println("Quantidade máxima atingida");
            return;
        }

        System.out.println("Digite a placa do veículo: ");
        String placa = input.nextLine();
        System.out.println("Digite a marca do veículo: ");
        String marca = input.nextLine();
        System.out.println("Digite o modelo do veículo: ");
        String modelo = input.nextLine();
        System.out.println("Digite o ano do veículo: ");
        int ano = input.nextInt();
        input.nextLine();

        Veiculo v = null;

        if (tipo.equalsIgnoreCase("Carro")) {
            System.out.println("Digite o número de portas: ");
            int nPortas = input.nextInt();
            input.nextLine();
            v = new Carro(nPortas, placa, marca, modelo, ano);
        } else if (tipo.equalsIgnoreCase("Van")) {
            System.out.println("Digite a capacidade de passageiros: ");
            int nPassageiros = input.nextInt();
            input.nextLine();
            v = new Van(nPassageiros, placa, marca, modelo, ano);
        } else if (tipo.equalsIgnoreCase("Caminhao")) {
            System.out.println("Digite a capacidade do caminhão (em Kg): ");
            double capacidade = input.nextDouble();
            System.out.println("Digite a quantidade de eixos: ");
            int nEixos = input.nextInt();
            input.nextLine();
            v = new Caminhao(capacidade, nEixos, placa, marca, modelo, ano);
        } else {
            System.out.println("Tipo de veículo inválido.");
            return;
        }

        this.veiculos[countVeiculos++] = v;

        if (v instanceof Alugavel && countAlugaveis < max) {
            this.veiculoAlugaveis[countAlugaveis++] = (Alugavel) v;
        }
    }

}
