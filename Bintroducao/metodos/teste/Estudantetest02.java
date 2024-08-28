package academy.devdojo.maratonajava.javacore.Bintroducao.metodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducao.metodos.dominio.Estudante;

public class Estudantetest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Mido";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
