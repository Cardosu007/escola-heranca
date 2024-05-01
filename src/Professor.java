public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    public void receberAum(float aum){

        this.salario += aum;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String es) {
        this.especialidade = es;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float sa) {
        this.salario = sa;
    }
}
