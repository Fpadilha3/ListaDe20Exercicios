
package exercicio7;


public class Forma {
  
    private String nome;

    // Construtor
    public Forma(String nome) {
        this.nome = nome;
    }

    // Método que será sobrescrito
    public double calcularArea() {
        return 0;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // ⬛ Quadrado
    public static class Quadrado extends Forma {
        private double lado;

        public Quadrado(double lado) {
            super("Quadrado");
            this.lado = lado;
        }

        @Override
        public double calcularArea() {
            return lado * lado;
        }

        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }
    }

    // ▭ Retângulo
    public static class Retangulo extends Forma {
        private double base;
        private double altura;

        public Retangulo(double base, double altura) {
            super("Retângulo");
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return base * altura;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
    }

    // ⚪ Círculo
    public static class Circulo extends Forma {
        private double raio;

        public Circulo(double raio) {
            super("Círculo");
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * raio * raio;
        }

        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
        }
    }

    // 🔺 Triângulo
    public static class Triangulo extends Forma {
        private double base;
        private double altura;

        public Triangulo(double base, double altura) {
            super("Triângulo");
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    