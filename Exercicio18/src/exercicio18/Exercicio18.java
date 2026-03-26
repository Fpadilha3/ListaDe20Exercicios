
package exercicio18;


public class Exercicio18 {

 
    public static void main(String[] args) {
        
        
        
        
        


        Imovel casa = new Imovel.Casa("Rua A, 123", 500000, 120);
        Imovel apto = new Imovel.Apartamento("Av. B, 456", 400000, 80);
        Imovel terreno = new Imovel.Terreno("Estrada C, 789", 200000, 500);
        Imovel sala = new Imovel.SalaComercial("Rua D, 101", 600000, 150);

        casa.calcularImposto();
        apto.calcularImposto();
        terreno.calcularImposto();
        sala.calcularImposto();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    