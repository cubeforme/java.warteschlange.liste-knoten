package warteschlange.liste.knoten;
public class LISTE {
    private KNOTEN anfang;
    
    LISTE(){
        anfang=null;
    }
    
    public void hintenEinfuegen(DATENELEMENT dneu){
        if (anfang!=null){
            anfang.hintenEinfuegen(dneu);
        }
        else{
            anfang = new KNOTEN(null, dneu);
        }
    }
    
    public KNOTEN anfangEntfernen(){
        KNOTEN alterAnfang = anfang;
        anfang = anfang.nachfolgerGeben();
        return alterAnfang;
    }
    
    public void vorneEinfuegen(DATENELEMENT dneu){
        anfang = new KNOTEN(anfang, dneu);
    }
    
    public void einfuegenVor(DATENELEMENT dneu, DATENELEMENT dvergleich){
        if (anfang!=null){
            anfang = anfang.einfuegenVor(dneu, dvergleich);
        }
        else{
            anfang=new KNOTEN(null, dneu);
        }
    }
    
    public void alleAusgeben(){
        if (anfang!=null){
            anfang.alleAusgeben();
        }
    }
    
    public int durchzaehlen(){
        if(anfang!=null){
            return(anfang.durchzaehlen());
        }
        else{
            return 0;
        }
    }
    
    public int wartenummergeben(DATENELEMENT dvergleich){
        if(anfang!=null){
            return(anfang.wartenummergeben(dvergleich));
        }
        else{
            return 0;
        }
    }
    
    public DATENELEMENT kundeentfernen(DATENELEMENT dvergleich){
        if(anfang!=null){
            if(anfang.datenGeben()!=dvergleich){
                return (anfang.kundeentfernen(dvergleich));
            }
            else{
                DATENELEMENT alteranfang;
                alteranfang=anfang.datenGeben();
                anfang=anfang.nachfolgerGeben();
                return(alteranfang);
            }
        }
        else{
            return null;
        }
    }
}
