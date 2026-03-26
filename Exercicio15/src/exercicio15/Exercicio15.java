
package exercicio15;


public class Exercicio15 {

   
    public static void main(String[] args) {


        ItemCardapio i1 = new ItemCardapio.Pizza("Calabresa", 30, "Pizza tradicional");
        ItemCardapio i2 = new ItemCardapio.Hamburguer("X-Burger", 20, "Hambúrguer com queijo");
        ItemCardapio i3 = new ItemCardapio.Bebida("Refrigerante", 8, "Lata 350ml");
        ItemCardapio i4 = new ItemCardapio.Sobremesa("Sorvete", 12, "Sorvete de chocolate");

        i1.preparar();
        System.out.println("Preço: " + i1.calcularPreco());

        i2.preparar();
        System.out.println("Preço: " + i2.calcularPreco());

        i3.preparar();
        System.out.println("Preço: " + i3.calcularPreco());

        i4.preparar();
        System.out.println("Preço: " + i4.calcularPreco());
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
   
    