
public class AlunoGraduacao extends Aluno {
    
    private String periodo;
    
    public AlunoGraduacao (String n, String m, String p){
        super (n, m);
        this.setPeriodo (p);
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
}
