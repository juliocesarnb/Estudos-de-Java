package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Júlio Cesar");
        pessoa.setIdade(25);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
