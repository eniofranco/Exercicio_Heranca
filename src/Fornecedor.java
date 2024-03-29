
public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida;
    
    public Fornecedor (String n, String e, String t, double vc, double vd){
        super (n, e, t);
        this.setValorCredito (vc);
        this.setValorDivida (vd);
    }
    
    public double getValorCredito(){
        return this.valorCredito;
    }
    public void setValorCredito(double vc){
        this.valorCredito = vc;
    }
    
    public double getValorDivida(){
        return this.valorDivida;
    }
    public void setValorDivida(double vd){
        this.valorDivida = vd;
    }
    
    public double obterSaldo(){
        return getValorCredito() - getValorDivida();
    }
       
}
