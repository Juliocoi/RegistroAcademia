import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Membro> listaDeMembros;
    private List<Aula> listaDeAulas;
    private List<RegistroFrequencia> listaDeRegistrosFrequencia;

    public Academia() {
        this.listaDeMembros = new ArrayList<>();
        this.listaDeAulas = new ArrayList<>();
        this.listaDeRegistrosFrequencia = new ArrayList<>();
    }

    public void adicionarMembro(Membro membro) {
        listaDeMembros.add(membro);
    }

    public void adicionarAula(Aula aula) {
        listaDeAulas.add(aula);
    }

    public boolean inscreverMembroEmAula(Membro membro, Aula aula) {
        if (listaDeMembros.contains(membro) && listaDeAulas.contains(aula)) {
            return aula.adicionarMembro(membro);
        }
        return false; // Membro ou aula não encontrados
    }

    public boolean registrarFrequencia(Aula aula, Membro membro) {
        if (aula.getMembrosInscritos().contains(membro)) {
            RegistroFrequencia registro = new RegistroFrequencia(aula, membro);
            listaDeRegistrosFrequencia.add(registro);
            return true; // Frequência registrada com sucesso
        }
        return false; // Membro não está inscrito na aula
    }

    public void listarRegistrosFrequencia() {
        for(RegistroFrequencia registro : listaDeRegistrosFrequencia) {
            System.out.println(registro);
        }
    }

    public void listarMembros() {
        for(Membro membro : listaDeMembros) {
            System.out.println(membro);
        }
    }



    @Override
    public String toString() {
        return "Academia{" +
                "listaDeMembros=" + listaDeMembros +
                ", listaDeAulas=" + listaDeAulas +
                ", listaDeRegistrosFrequencia=" + listaDeRegistrosFrequencia +
                '}';
    }
}

