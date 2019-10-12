public class AlunoPosGraduacao extends Aluno {
    
    private String area;
    
    public AlunoPosGraduacao (String n, String m, String a){
        super (n, m);
        this.setArea (a);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String a) {
        this.area = a;
    }
    
    
}