
public class Administrador extends Empregado {
    
    private double ajudaDeCusto;
    
    public Administrador (String n, String e,String t, String cs, double sb, double i, double adc){
        super (n, e, t, cs, sb, i);
        this.setAjudaDeCusto (adc);
        
    }
    
    public double getAjudaDeCusto(){
        return this.ajudaDeCusto;
    }
    public void setAjudaDeCusto (double adc){
        this.ajudaDeCusto = adc;
    }
    
    public double calcularSalario(){
        return calcularSalario() + getAjudaDeCusto();
    }
}
