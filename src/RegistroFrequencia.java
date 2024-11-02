import java.time.LocalDate;

public class RegistroFrequencia {
    private Aula aula;
    private Membro membro;
    private LocalDate participacao;

    public RegistroFrequencia(Aula aula, Membro membro) {
        this.aula = aula;
        this.membro = membro;
        this.participacao = LocalDate.now();
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public LocalDate getParticipacao() {
        return participacao;
    }

    public void setParticipacao(LocalDate participacao) {
        this.participacao = participacao;
    }

    @Override
    public String toString() {
        return "RegistroFrequencia{" +
                "aula=" + aula.getNome() +
                ", Aluno:" + membro + // Supondo que Membro tenha um método toString() implementado
                ", aula_realizada_em:'" + participacao + '\'' +
                '}';
    }
}

