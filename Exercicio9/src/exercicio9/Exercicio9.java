
package exercicio9;

import java.util.ArrayList;


public class Exercicio9 {

    public static void main(String[] args) {
        
        


        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Personagem.Guerreiro("Thorin", 150, 5));
        personagens.add(new Personagem.Mago("Gandalf", 100, 10));
        personagens.add(new Personagem.Arqueiro("Legolas", 120, 7));
        personagens.add(new Personagem.Paladino("Uther", 180, 6));

        // Testando polimorfismo
        for (Personagem p : personagens) {
            p.atacar();
            p.defender();
            System.out.println("---");
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
     