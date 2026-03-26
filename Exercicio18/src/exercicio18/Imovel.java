
package exercicio18;


public class Imovel {
    
    
    

    private String endereco;
    private double preco;
    private double metragem;

    // Construtor
    public Imovel(String endereco, double preco, double metragem) {
        this.endereco = endereco;
        this.preco = preco;
        this.metragem = metragem;
    }

    // Getters e Setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    // Método geral
    public void calcularImposto() {
        System.out.println("Calculando imposto genérico para o imóvel");
    }

    // 🔹 Subclasse Casa
    static class Casa extends Imovel {

        public Casa(String endereco, double preco, double metragem) {
            super(endereco, preco, metragem);
        }

        @Override
        public void calcularImposto() {
            double imposto = getPreco() * 0.03; // 3% sobre o preço
            System.out.println("Imposto da casa em " + getEndereco() + ": R$ " + imposto);
        }
    }

    // 🔹 Subclasse Apartamento
    static class Apartamento extends Imovel {

        public Apartamento(String endereco, double preco, double metragem) {
            super(endereco, preco, metragem);
        }

        @Override
        public void calcularImposto() {
            double imposto = getPreco() * 0.025; // 2,5% sobre o preço
            System.out.println("Imposto do apartamento em " + getEndereco() + ": R$ " + imposto);
        }
    }

    // 🔹 Subclasse Terreno
    static class Terreno extends Imovel {

        public Terreno(String endereco, double preco, double metragem) {
            super(endereco, preco, metragem);
        }

        @Override
        public void calcularImposto() {
            double imposto = getMetragem() * 10; // R$10 por m²
            System.out.println("Imposto do terreno em " + getEndereco() + ": R$ " + imposto);
        }
    }

    // 🔹 Subclasse SalaComercial
    static class SalaComercial extends Imovel {

        public SalaComercial(String endereco, double preco, double metragem) {
            super(endereco, preco, metragem);
        }

        @Override
        public void calcularImposto() {
            double imposto = getPreco() * 0.04; // 4% sobre o preço
            System.out.println("Imposto da sala comercial em " + getEndereco() + ": R$ " + imposto);
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    

