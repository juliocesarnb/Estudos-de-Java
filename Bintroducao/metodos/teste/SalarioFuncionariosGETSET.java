package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.FuncionariosGETSET;

public class SalarioFuncionariosGETSET {
    public static void main(String[] args) {
        FuncionariosGETSET funcionario = new FuncionariosGETSET();

        funcionario.setNome("Julio");
        funcionario.setIdade(25);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        // Calculando o salário médio

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("------------");
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("------------");
        System.out.println("Salários: " + funcionario.getSalarios()[0] + ", " + funcionario.getSalarios()[1] + ", " + funcionario.getSalarios()[2]);
        System.out.println("------------");
        funcionario.imprime();
        System.out.println("------------");






    }
}
