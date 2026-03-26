
package exercicio19;


public class Exercicio19 {

 
    public static void main(String[] args) {
        
        
        
        


        Curso presencial = new Curso.CursoPresencial("Java Básico", 40, 300);
        Curso online = new Curso.CursoOnline("Python Online", 50, 250);
        Curso tecnico = new Curso.CursoTecnico("Eletrônica", 120, 600);
        Curso livre = new Curso.CursoLivre("Fotografia", 20, 150);

        presencial.exibirInformacoes();
        System.out.println("Mensalidade: R$ " + presencial.calcularMensalidade());

        online.exibirInformacoes();
        System.out.println("Mensalidade: R$ " + online.calcularMensalidade());

        tecnico.exibirInformacoes();
        System.out.println("Mensalidade: R$ " + tecnico.calcularMensalidade());

        livre.exibirInformacoes();
        System.out.println("Mensalidade: R$ " + livre.calcularMensalidade());
    }
}
        
        
        
        
        
        
        
        
        
    