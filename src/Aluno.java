public class Aluno extends Pessoa {

    private int matr;
    private String curso;

    public void cancelarMatr(){
        System.out.println("Matricula será cancelada.");
    }

    public int isMatr() {
        return matr;
    }

    public void setMatr(int ma) {
        this.matr = ma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String cu) {
        this.curso = cu;
    }
}


