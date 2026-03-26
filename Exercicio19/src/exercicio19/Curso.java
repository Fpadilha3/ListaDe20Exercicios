
package exercicio19;

public class Curso {
    
    
    
    
    
    
    
    private String nome;
    private int cargaHoraria;
    private double valor;

    // Construtor
    public Curso(String nome, int cargaHoraria, double valor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Métodos gerais
    public void exibirInformacoes() {
        System.out.println("Curso: " + nome + " | Carga horária: " + cargaHoraria + "h | Valor: R$ " + valor);
    }

    public double calcularMensalidade() {
        return valor;
    }

    // 🔹 Subclasse CursoPresencial
    static class CursoPresencial extends Curso {

        public CursoPresencial(String nome, int cargaHoraria, double valor) {
            super(nome, cargaHoraria, valor);
        }

        @Override
        public void exibirInformacoes() {
            System.out.println("Curso Presencial: " + getNome() + " | Carga: " + getCargaHoraria() + "h | Valor: R$ " + getValor());
        }

        @Override
        public double calcularMensalidade() {
            return getValor() + 50; // taxa presencial
        }
    }

    // 🔹 Subclasse CursoOnline
    static class CursoOnline extends Curso {

        public CursoOnline(String nome, int cargaHoraria, double valor) {
            super(nome, cargaHoraria, valor);
        }

        @Override
        public void exibirInformacoes() {
            System.out.println("Curso Online: " + getNome() + " | Carga: " + getCargaHoraria() + "h | Valor: R$ " + getValor());
        }

        @Override
        public double calcularMensalidade() {
            return getValor(); // sem taxa adicional
        }
    }

    // 🔹 Subclasse CursoTecnico
    static class CursoTecnico extends Curso {

        public CursoTecnico(String nome, int cargaHoraria, double valor) {
            super(nome, cargaHoraria, valor);
        }

        @Override
        public void exibirInformacoes() {
            System.out.println("Curso Técnico: " + getNome() + " | Carga: " + getCargaHoraria() + "h | Valor: R$ " + getValor());
        }

        @Override
        public double calcularMensalidade() {
            return getValor() + 100; // taxa técnica
        }
    }

    // 🔹 Subclasse CursoLivre
    static class CursoLivre extends Curso {

        public CursoLivre(String nome, int cargaHoraria, double valor) {
            super(nome, cargaHoraria, valor);
        }

        @Override
        public void exibirInformacoes() {
            System.out.println("Curso Livre: " + getNome() + " | Carga: " + getCargaHoraria() + "h | Valor: R$ " + getValor());
        }

        @Override
        public double calcularMensalidade() {
            return getValor() - 20; // desconto para curso livre
        }
    }
}
    
    
    
    
    

