
package exercicio3;


public class Exercicio3 {

    
    public static void main(String[] args) {
      

        Funcionario f1 = new Funcionario.Gerente("Carlos", 8000);
        Funcionario f2 = new Funcionario.Vendedor("Ana", 3000);
        Funcionario f3 = new Funcionario.Programador("Lucas", 6000);
        Funcionario f4 = new Funcionario.Designer("Marina", 4000);

        // Polimorfismo
        f1.trabalhar();
        System.out.println("Bônus: " + f1.calcularBonus());

        f2.trabalhar();
        System.out.println("Bônus: " + f2.calcularBonus());

        f3.trabalhar();
        System.out.println("Bônus: " + f3.calcularBonus());

        f4.trabalhar();
        System.out.println("Bônus: " + f4.calcularBonus());
    }
}
        
        
        
        
        
        
        
       
 