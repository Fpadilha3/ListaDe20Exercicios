
package exercicio17;


public class Exercicio17 {

 
    public static void main(String[] args) {
        
        
    
    
        ItemBiblioteca livro = new ItemBiblioteca.Livro("1984", "L001", true);
        ItemBiblioteca revista = new ItemBiblioteca.Revista("Veja", "R001", true);
        ItemBiblioteca jornal = new ItemBiblioteca.Jornal("O Globo", "J001", true);
        ItemBiblioteca dvd = new ItemBiblioteca.DVD("Matrix", "D001", true);

        livro.emprestar();
        revista.emprestar();
        jornal.emprestar();
        dvd.emprestar();

        System.out.println();

        livro.devolver();
        revista.devolver();
        jornal.devolver();
        dvd.devolver();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        

