
package exercicio7;

import java.util.ArrayList;


public class Exercicio7 {

    
    public static void main(String[] args) {
        


        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Forma.Quadrado(4));
        formas.add(new Forma.Retangulo(5, 3));
        formas.add(new Forma.Circulo(2.5));
        formas.add(new Forma.Triangulo(6, 2));

        // Polimorfismo + laço
        for (Forma f : formas) {
            System.out.println(f.getNome() + 
                " - Área: " + f.calcularArea());
        }
    }
} 
        
        
        
        
        
        
        
        
        
        
        
        
