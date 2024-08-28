package academy.devdojo.maratonajava.javacore.Aintroducao.classes.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    public Carro(String nome, String modelo, int ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }
    @Override
    public String toString() {
        return "Carro = " +
                "nome:'" + nome + '\'' +
                ", modelo:'" + modelo + '\'' +
                ", ano:" + ano;
    }
}
