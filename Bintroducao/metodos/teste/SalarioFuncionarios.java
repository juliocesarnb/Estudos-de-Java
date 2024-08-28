package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.teste;
import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Funcionarios;

public class SalarioFuncionarios {
    public static void main(String[] args) {
       Funcionarios funcionario01 = new Funcionarios();
       Funcionarios funcionario02 = new Funcionarios();
       Funcionarios funcionario03 = new Funcionarios();


        funcionario01.nome = "João";
        funcionario01.idade = 24;
        funcionario01.salarios = new double[]{1200, 987.32, 2000};

        funcionario02.nome = "Julio";
        funcionario02.idade = 25;
        funcionario02.salarios = new double[]{1000, 987.32, 2000};

        funcionario03.nome = "Laura";
        funcionario03.idade = 26;
        funcionario03.salarios = new double[]{3200, 987.32, 2000};


        // Calculando o salário médio
        funcionario01.imprime();

        System.out.println("------------");

        funcionario02.imprime();

        System.out.println("------------");

        funcionario03.imprime();



    }
}
