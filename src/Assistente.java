
public class Assistente extends Gerente {
    
    private Gerente supervisor;
    
    public Assistente (String n, String m, String nd, Gerente s){
        super (n, m, nd);
        this.setSupervisor(s);
    }

    public Gerente getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Gerente supervisor) {
        this.supervisor = supervisor;
    }
   
    
    
}
