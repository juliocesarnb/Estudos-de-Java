package academy.devdojo.maratonajava.javacore.FmodificadorEstatico.dominio;

public class Carro {
    String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-----------------------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Velocidade Máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadaeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadaeLimite(double velocidadaeLimite) {
        this.velocidadeLimite = velocidadaeLimite;
    }
}
