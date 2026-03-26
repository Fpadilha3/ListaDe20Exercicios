
package exercicio20;


public class Exercicio20 {

 
    public static void main(String[] args) {
        
        
      
        
   
        Animal[] zoologico = new Animal[4];
        zoologico[0] = new Leao("Simba", 5, 190);
        zoologico[1] = new Macaco("George", 2, 15);
        zoologico[2] = new Elefante("Dumbo", 10, 1200);
        zoologico[3] = new Papagaio("Louro", 3, 1.5);

        // Testando polimorfismo
        for (Animal animal : zoologico) {
            animal.emitirSom();
            animal.alimentar();
            animal.movimentar();
            System.out.println("----------------------------");
        }
    }
}
        
        
        
        
        
        
      