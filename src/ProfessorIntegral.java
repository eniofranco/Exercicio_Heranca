
public class ProfessorIntegral extends Professor {
    
    private int horas;
    
    public ProfessorIntegral (String n, int i, int m, int h){
        super (n, i, m);
        this.setHoras(h);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
     public void salarioIntegral(double sal){
        
       sal = this.horas * 40;
    }

    
}
