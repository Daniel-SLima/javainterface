
package interfaceatv1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Motoboy motoboy =  new Motoboy("654321987", "Leonardo", "987654321", "23159687", Genero.MASCULINO, 1400, LocalDate.of(2000, 8, 04), LocalDate.of(2021, 9, 14));
    Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Daniel Lima", "69874641534", "2315687947", Genero.MASCULINO, 14000, LocalDate.of(2002, 9, 13), LocalDate.of(2020, 10, 15));
    Gerente gerente = new Gerente(Bonificacao.GERENTE, "Lara Luz", "489456132", "184794656", Genero.FEMININO, 10000, LocalDate.of(2004, 9, 2), LocalDate.of(2020, 9, 28));
    

    
    if (diretor instanceof Autenticavel) {
                System.out.println("Relação de Funcionario: " + diretor.toString() 
                + "\nAcesso Permitido"
                + gerente.toString()
                + motoboy.toString());
           
        } else {
                System.out.println("Relação de Funcionario: " + diretor.toString() 
                +"\nAcesso Negado"
                + gerente.toString()
                + motoboy.toString());
          
        }
    
    }
    
    
    
}
