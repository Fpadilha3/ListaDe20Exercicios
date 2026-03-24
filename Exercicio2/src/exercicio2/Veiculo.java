
package exercicio2;

public class Veiculo {
    
    private String marca;
    private String modelo;
    private int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método que será sobrescrito
    public void mover() {
        System.out.println("O veículo está se movendo");
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // 🚗 Subclasse Carro
    public static class Carro extends Veiculo {
        public Carro(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
        }

        @Override
        public void mover() {
            System.out.println("O carro está dirigindo na estrada ");
        }
    }

    // 🏍️ Subclasse Moto
    public static class Moto extends Veiculo {
        public Moto(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
        }

        @Override
        public void mover() {
            System.out.println("A moto está acelerando ");
        }
    }

    // 🚲 Subclasse Bicicleta
    public static class Bicicleta extends Veiculo {
        public Bicicleta(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
        }

        @Override
        public void mover() {
            System.out.println("A bicicleta está pedalando ");
        }
    }

    // 🚌 Subclasse Onibus
    public static class Onibus extends Veiculo {
        public Onibus(String marca, String modelo, int ano) {
            super(marca, modelo, ano);
        }

        @Override
        public void mover() {
            System.out.println("O ônibus está transportando passageiros ");
        }
    }
}
    
    
    
    
