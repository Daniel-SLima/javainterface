
package animais;

public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Som: Au au");
    }

    @Override
    public void comer() {
        System.out.println("Comida: Ração");
    }
    
    
}
