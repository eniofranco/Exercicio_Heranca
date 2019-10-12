
public class TestaEmpresa {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente ("Luciano", "4571", "INFO"); 
        
        AssistenteAdministrativo aa1 = new AssistenteAdministrativo ("Enio", "1457", "INFO", g1, 0.31);
        
        AssistenteTecnico at1 = new AssistenteTecnico ("Meiriane", "438", "INFO", g1 , 1420.25);
        
        System.out.println(aa1.getNome());
        System.out.println(aa1.getMatricula());
        System.out.println(g1.getNomedep());
        System.out.println(g1.getNome());
        System.out.println(aa1.getAdnoturno());
        
        System.out.println(at1.getNome());
        System.out.println(at1.getMatricula());
        System.out.println(g1.getNomedep());
        System.out.println(g1.getNome());
        System.out.println(at1.getBonus());
    } 
    
}
