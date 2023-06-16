
package interfaceatv1;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Autenticavel{

    private final double PREMIO = 0.1;

    @Override
    public double getSalarioFinal() {
        return salarioBase * Bonificacao.DIRETOR.getValor() + PREMIO + salarioBase;
    }

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }

    public double getPREMIO() {
        return salarioBase * PREMIO;
    }

    @Override
    public String toString() {
        return "\n\nDiretor: "+ super.toString() + "\nPremio: " + Util.formatarSalario(getPREMIO())  + "\nSalario Final: " + Util.formatarSalario(getSalarioFinal());
    }
    
    

    
    
    
    
}
