public class Gerente extends Funcionarios {
    
    private String nomedep;

    public Gerente(String n, String m, String nd){
        super(n, m);
        this.setNomedep(nd);
    }
    
    
    public String getNomedep() {
        return nomedep;
    }

    public void setNomedep(String nomedep) {
        this.nomedep = nomedep;
    }
    
    
    
    
}
