package warteschlange.liste.knoten;
public class DATENELEMENT {
    private String nachname;
    private String vorname;
    
    DATENELEMENT(String a, String b){
        nachname=a;
        vorname=b;
    }
    
    public void alleAusgeben(){
        System.out.println(nachname+", "+vorname);
    }
}
