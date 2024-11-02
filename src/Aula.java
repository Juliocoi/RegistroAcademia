import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String nome;
    private Instrutor instrutor;
    private int capacidadeMaxima;
    private List<Membro> listaMembrosInscritos;

    public Aula(String nome, Instrutor instrutor, int capacidadeMaxima) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.capacidadeMaxima = capacidadeMaxima;
        this.listaMembrosInscritos = new ArrayList<>();
    }

    public boolean existeVaga() {
        return listaMembrosInscritos.size() < this.capacidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public int getCapacidadeMax() {
        return capacidadeMaxima;
    }

    public List<Membro> getMembrosInscritos(){
        return listaMembrosInscritos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean adicionarMembro(Membro membro) {
        if (existeVaga()) {
            listaMembrosInscritos.add(membro);
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "Aula{" +
                "Aula=" + getNome() +
                ", instrutor=" + instrutor.getNome() +
                ", capacidadeMaxima=" + getCapacidadeMax() +
                ", membrosInscritos=" + listaMembrosInscritos +
                '}';
    }
}
