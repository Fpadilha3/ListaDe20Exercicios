
package exercicio16;


public class Pessoa {
    
    
   
    
    


    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }

    public void realizarAtendimento() {
        System.out.println("Atendimento genérico");
    }

    // 🔹 Paciente
    static class Paciente extends Pessoa {

        private String doenca;

        public Paciente(String nome, int idade, String doenca) {
            super(nome, idade);
            this.doenca = doenca;
        }

        public String getDoenca() {
            return doenca;
        }

        public void setDoenca(String doenca) {
            this.doenca = doenca;
        }

        @Override
        public void exibirDados() {
            super.exibirDados();
            System.out.println("Doença: " + doenca);
        }
    }

    // 🔹 Medico
    static class Medico extends Pessoa {

        private String especialidade;

        public Medico(String nome, int idade, String especialidade) {
            super(nome, idade);
            this.especialidade = especialidade;
        }

        public String getEspecialidade() {
            return especialidade;
        }

        public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
        }

        @Override
        public void realizarAtendimento() {
            System.out.println(getNome() + " (Médico) está atendendo");
        }
    }

    // 🔹 Enfermeiro
    static class Enfermeiro extends Pessoa {

        private String setor;

        public Enfermeiro(String nome, int idade, String setor) {
            super(nome, idade);
            this.setor = setor;
        }

        public String getSetor() {
            return setor;
        }

        public void setSetor(String setor) {
            this.setor = setor;
        }

        @Override
        public void realizarAtendimento() {
            System.out.println(getNome() + " (Enfermeiro) está auxiliando");
        }
    }

    // 🔹 Consulta (forçada dentro da mesma classe)
    static class Consulta {

        private Paciente paciente;
        private Pessoa profissional;
        private String data;

        public Consulta(Paciente paciente, Pessoa profissional, String data) {
            this.paciente = paciente;
            this.profissional = profissional;
            this.data = data;
        }

        public Paciente getPaciente() {
            return paciente;
        }

        public void setPaciente(Paciente paciente) {
            this.paciente = paciente;
        }

        public Pessoa getProfissional() {
            return profissional;
        }

        public void setProfissional(Pessoa profissional) {
            this.profissional = profissional;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public void agendarConsulta() {
            System.out.println("Consulta agendada:");
            System.out.println("Paciente: " + paciente.getNome());
            System.out.println("Profissional: " + profissional.getNome());
            System.out.println("Data: " + data);
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    

