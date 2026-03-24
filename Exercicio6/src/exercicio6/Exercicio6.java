
package exercicio6;

public class Exercicio6 {

  
    public static void main(String[] args) {
        
        
      
        Produto p1 = new Produto.Livro("Java Básico", 50, 2);
        Produto p2 = new Produto.Eletronico("Celular", 1000, 1);
        Produto p3 = new Produto.Roupa("Camiseta", 40, 4);
        Produto p4 = new Produto.Alimento("Maçã", 5, 10);

        // Polimorfismo
        System.out.println("Livro: " + p1.calcularPrecoFinal());
        System.out.println("Eletrônico: " + p2.calcularPrecoFinal());
        System.out.println("Roupa: " + p3.calcularPrecoFinal());
        System.out.println("Alimento: " + p4.calcularPrecoFinal());
    }
}
      
    
    

