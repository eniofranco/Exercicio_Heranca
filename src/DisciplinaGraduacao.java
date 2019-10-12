
public class DisciplinaGraduacao extends Disciplina {
  
    private String antropologia;
    
    public DisciplinaGraduacao (String cd,String a){
        super (cd);
        this.setAntropologia (a);
    }

    public String getAntropologia() {
        return antropologia;
    }

    public void setAntropologia(String antropologia) {
        this.antropologia = antropologia;
    }
    
    
    
}
