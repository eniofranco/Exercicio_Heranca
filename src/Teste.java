
public class Teste {
    
    public static void main (String [] args){
        
        Pessoa p1 = new Pessoa ("Flávio", "Av. Salmeron, 255", "3741-1530");
        Fornecedor f1 = new Fornecedor("Rocha", "Acacia,345", "99-4174", 1500.67, 251.36);
        Empregado e1 = new Empregado ("Josiane", "Eleuterio,787", "547-8971", "cod-TI78", 2745.69, 0.05);
        Administrador a1 = new Administrador ("Joaquia", "Soeiros,36", "547-9685", "CONT-98", 1476.97, 0.03, 150.0);
        Operario o1 = new Operario ("Edmilson", "Montes, 47", "3741-5471", "MAn-69", 1879.36, 0.02, 240.000, 25.36);
        
       
        System.out.println(e1.calcularSalario());
        System.out.println(a1.calcularSalario());
        System.out.println(o1.calcularSalario());
        
    }
    
}
