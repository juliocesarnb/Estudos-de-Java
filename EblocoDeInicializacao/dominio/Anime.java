package academy.devdojo.maratonajava.javacore.EblocoDeInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado  espaço em memóri pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - bloco de inicialização é executado
    // 4 - Construtor é executado


    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for(int i = 0;i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: this.episodios){
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

}
