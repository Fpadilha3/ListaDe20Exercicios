
package exercicio11;


public class Dispositivo {
    
    
    
    
    

    private String marca;
    private String modelo;
    private boolean ligado;

    // Construtor
    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
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

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Métodos gerais
    public void ligar() {
        ligado = true;
        System.out.println("Dispositivo ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Dispositivo desligado");
    }

    public void executarFuncao() {
        System.out.println("Executando função genérica");
    }

    // 🔹 Subclasse Computador
    static class Computador extends Dispositivo {

        public Computador(String marca, String modelo) {
            super(marca, modelo);
        }

        @Override
        public void executarFuncao() {
            System.out.println("Rodando programas pesados no computador");
        }
    }

    // 🔹 Subclasse Smartphone
    static class Smartphone extends Dispositivo {

        public Smartphone(String marca, String modelo) {
            super(marca, modelo);
        }

        @Override
        public void executarFuncao() {
            System.out.println("Abrindo aplicativos no smartphone");
        }
    }

    // 🔹 Subclasse Tablet
    static class Tablet extends Dispositivo {

        public Tablet(String marca, String modelo) {
            super(marca, modelo);
        }

        @Override
        public void executarFuncao() {
            System.out.println("Assistindo vídeos no tablet");
        }
    }

    // 🔹 Subclasse Televisao
    static class Televisao extends Dispositivo {

        public Televisao(String marca, String modelo) {
            super(marca, modelo);
        }

        @Override
        public void executarFuncao() {
            System.out.println("Exibindo canais na televisão");
        }
    }
}
    
    
    
    
    
    