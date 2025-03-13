package exercicio04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();

        func1.setMatricula(123);
        func1.setDataNascimento(LocalDate.of(1995, 7, 28));

        System.out.println("Idade: " + func1.calcularIdade());

        Dependete dep1 = new Dependete(1, "A", null, 1, false);
        dep1.setResponsavel(func1);
        Dependete dep2 = new Dependete(2, "B", null, 2, false);
        dep2.setResponsavel(func1);
        Dependete dep3 = new Dependete(3, "C", null, 2, false);
        dep3.setResponsavel(func1);

        // System.out.println(func1.getNomeCompleto());
        // System.out.println(dep1.getNomeCompleto());
        // System.out.println(dep1.getResponsavel().getNomeCompleto());

        List<Dependete> deps = new ArrayList<>();

        func1.setDependente(deps);

    }
}
