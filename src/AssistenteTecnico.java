
public class AssistenteTecnico extends Assistente {
    
    private double bonus;

    public AssistenteTecnico (String n, String m, String nd, Gerente s, double b){
        super (n, m, nd, s);
        this.setBonus(b);
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
}
