import java.util.Random;

public class Membro {
    private String id;
    private String nome;

    Random random = new Random();

    public Membro(String nome) {
        this.id = String.valueOf(random.nextInt());
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
