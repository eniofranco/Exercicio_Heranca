
public class AssistenteAdministrativo extends Assistente {
    
    private double adnoturno;

    public AssistenteAdministrativo (String n, String m, String nd, Gerente s, double an){
        super (n, m, nd, s);
        this.setAdnoturno(an);
        
    } 
    
    public double getAdnoturno() {
        return adnoturno;
    }

    public void setAdnoturno(double adnoturno) {
        this.adnoturno = adnoturno;
    }
    
    
    
}
