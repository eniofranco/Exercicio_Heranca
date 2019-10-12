public class DisciplinaPosGraduacao extends Disciplina {
  
    private String metodologia;
    
    public DisciplinaPosGraduacao (String cd, String m){
        super (cd);
        this.setMetodologia (m);
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String m) {
        this.metodologia = m;
    }
    
    
    
}