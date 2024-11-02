import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Membro {
    private List<Aula> aulasMinistradas;

    public Instrutor(String nome) {
        super(nome);
        this.aulasMinistradas = new ArrayList<>();
    }

    public void getAulasMinistradas() {

        for(Aula aulaMinistrada : this.aulasMinistradas) {
            System.out.println(aulaMinistrada);
        }
    }

    public void adicionarAulasMinistradas(Aula aula) {
        aulasMinistradas.add(aula);
    }

    public void removerAulasMinistradas(Aula aula) {
        aulasMinistradas.remove(aula);
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "nome=" + getNome() +
                ", ID=" + getId() +
                ", aulasMinistradas=" + (aulasMinistradas) +
                '}';
    }

}
