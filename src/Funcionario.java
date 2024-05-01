public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public void mudaTrabalho(){

        this.trabalhando = ! this.trabalhando;

    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String se) {
        this.setor = se;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean tr) {
        this.trabalhando = tr;
    }
}
