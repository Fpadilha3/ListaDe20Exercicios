
package exercicio10;


public class Transporte {
    
    
 
    private int capacidade;
    private String empresa;
    private double tarifaBase;

    // Construtor
    public Transporte(int capacidade, String empresa, double tarifaBase) {
        this.capacidade = capacidade;
        this.empresa = empresa;
        this.tarifaBase = tarifaBase;
    }

    // Getters e Setters
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    // Método geral
    public double calcularTarifa() {
        return tarifaBase;
    }

    // 🔹 Subclasse Taxi
    static class Taxi extends Transporte {

        public Taxi(int capacidade, String empresa, double tarifaBase) {
            super(capacidade, empresa, tarifaBase);
        }

        @Override
        public double calcularTarifa() {
            return getTarifaBase() + 5.0; // taxa fixa
        }
    }

    // 🔹 Subclasse Uber
    static class Uber extends Transporte {

        public Uber(int capacidade, String empresa, double tarifaBase) {
            super(capacidade, empresa, tarifaBase);
        }

        @Override
        public double calcularTarifa() {
            return getTarifaBase() * 1.2; // tarifa dinâmica
        }
    }

    // 🔹 Subclasse Onibus
    static class Onibus extends Transporte {

        public Onibus(int capacidade, String empresa, double tarifaBase) {
            super(capacidade, empresa, tarifaBase);
        }

        @Override
        public double calcularTarifa() {
            return getTarifaBase(); // tarifa fixa simples
        }
    }

    // 🔹 Subclasse Metro
    static class Metro extends Transporte {

        public Metro(int capacidade, String empresa, double tarifaBase) {
            super(capacidade, empresa, tarifaBase);
        }

        @Override
        public double calcularTarifa() {
            return getTarifaBase() * 0.8; // desconto
        }
    }
}
    
    
    
    
    
    
    
    

