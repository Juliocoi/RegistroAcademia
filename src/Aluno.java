public class Aluno extends Membro {
    private int vencimento;
    private boolean pagamentoEmDia;

    public Aluno(String nome, int vencimento, boolean pagamentoEmDia) {
        super(nome);

        this.pagamentoEmDia = pagamentoEmDia;

        if(vencimento < 0 || vencimento > 30){
            System.out.println("Atenção aluno, escolha uma data de vencimento válida(entre 1 e 30)");
        } else {
            this.vencimento = vencimento;
        }
    }

    public int getVencimento() {
        return vencimento;
    }
    public void setVencimento(int vencimento) {
        if(vencimento < 1  || vencimento > 30){
            System.out.println("Data de pagamento é inválida.");
        }
        this.vencimento = vencimento;
    }

    public boolean statusPagamento() {
        return pagamentoEmDia;
    }

    public void pagarMensalidade(){
        if(this.pagamentoEmDia==false){
            this.pagamentoEmDia = true;
        } else {
            System.out.println("Pagamento em dia!");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", ID='" + getId() + '\'' +
                '}';
    }
}
