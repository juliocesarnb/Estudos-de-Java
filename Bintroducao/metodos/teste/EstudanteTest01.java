package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Mido";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        System.out.println("-------- Ex com o imprime ----------");
        impressoraEstudante.imprime(estudante01);
        System.out.println("------------------");
        impressoraEstudante.imprime(estudante02);



        System.out.println("--------- Ex sem o imprime ---------");

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("------------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
    }

}
