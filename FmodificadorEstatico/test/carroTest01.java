package academy.devdojo.maratonajava.javacore.FmodificadorEstatico.test;

import academy.devdojo.maratonajava.javacore.FmodificadorEstatico.dominio.Carro;

public class carroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",280);
        Carro c2 = new Carro("Mercedes",275);
        Carro c3 = new Carro("Audi", 290);
        Carro.velocidadeLimite = 190;
        // O atributo pertence a classe e todos os objetos iram compartilhar do mesmo valor!
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
