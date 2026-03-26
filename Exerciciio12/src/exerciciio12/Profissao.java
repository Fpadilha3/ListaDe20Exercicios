
package exerciciio12;


public class Profissao {
    

    private String nome;
    private String area;
    private double salario;

    // Construtor
    public Profissao(String nome, String area, double salario) {
        this.nome = nome;
        this.area = area;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método geral
    public void executarTrabalho() {
        System.out.println("Executando trabalho genérico");
    }

    // 🔹 Subclasse Medico
    static class Medico extends Profissao {

        public Medico(String nome, String area, double salario) {
            super(nome, area, salario);
        }

        @Override
        public void executarTrabalho() {
            System.out.println(getNome() + " está atendendo pacientes");
        }
    }

    // 🔹 Subclasse Professor
    static class Professor extends Profissao {

        public Professor(String nome, String area, double salario) {
            super(nome, area, salario);
        }

        @Override
        public void executarTrabalho() {
            System.out.println(getNome() + " está dando aula");
        }
    }

    // 🔹 Subclasse Advogado
    static class Advogado extends Profissao {

        public Advogado(String nome, String area, double salario) {
            super(nome, area, salario);
        }

        @Override
        public void executarTrabalho() {
            System.out.println(getNome() + " está defendendo um cliente");
        }
    }

    // 🔹 Subclasse Engenheiro
    static class Engenheiro extends Profissao {

        public Engenheiro(String nome, String area, double salario) {
            super(nome, area, salario);
        }

        @Override
        public void executarTrabalho() {
            System.out.println(getNome() + " está projetando uma obra");
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    