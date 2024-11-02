//Aluno: Júlio César Amorim de Souza MAT: 01024947

public class Main {
    public static void main(String[] args) {
        Academia ciaDoCorpo = new Academia();
        Instrutor instrutorAerobico = new Instrutor("Rhianna");
        Aluno novoAluno = new Aluno("Márcia", 29, true);

        Aula aulaAerobico = new Aula("Aeróbico", instrutorAerobico, 2 );
        instrutorAerobico.adicionarAulasMinistradas(aulaAerobico);

        ciaDoCorpo.adicionarMembro(novoAluno);
        ciaDoCorpo.adicionarMembro(instrutorAerobico);
        ciaDoCorpo.adicionarAula(aulaAerobico);

        ciaDoCorpo.inscreverMembroEmAula(novoAluno, aulaAerobico);

        ciaDoCorpo.registrarFrequencia(aulaAerobico, novoAluno);

        System.out.println("");
        System.out.println("#################### MEMBROS ###############################");
        System.out.println("");
        ciaDoCorpo.listarMembros();

        System.out.println("");
        System.out.println("#################### Aulas ministradas ###############################");
        System.out.println("");
        instrutorAerobico.getAulasMinistradas();

        System.out.println("");
        System.out.println("#################### FREQUÊNCIA ###############################");
        System.out.println("");

        ciaDoCorpo.listarRegistrosFrequencia();

    }
}
