package warteschlange.liste.knoten;
public class KNOTEN {
    private KNOTEN nachfolger;
    private DATENELEMENT daten;
    
    KNOTEN(){
        nachfolger=null;
        daten=null;
    }
    
    KNOTEN(KNOTEN naechsterKnoten, DATENELEMENT datenObjekt){
        nachfolger=naechsterKnoten;
        daten=datenObjekt;
    }
    
    public void hintenEinfuegen(DATENELEMENT dneu){
        if (nachfolger!=null){
            nachfolger.hintenEinfuegen(dneu);
        }
        else{
            KNOTEN kneu = new KNOTEN(null, dneu);
            nachfolger=kneu;
        }
    }
    
    public KNOTEN nachfolgerGeben(){
        if (nachfolger!=null){
            return nachfolger;
        }
        else{
            return null;
        }
    }
    
    public DATENELEMENT datenGeben(){
        return daten;
    }
    
    public KNOTEN einfuegenVor(DATENELEMENT dneu, DATENELEMENT dvergleich){
        if (daten!=dvergleich){
            if (nachfolger!=null){
                nachfolger=nachfolger.einfuegenVor(dneu, dvergleich);
            }
            else{
                nachfolger=new KNOTEN(null, dneu);
            }
        return this;
        }
        else{
            KNOTEN kneu = new KNOTEN(this, dneu);
            return kneu;
        }
    }
    
    public void alleAusgeben(){
        daten.alleAusgeben();
        if (nachfolger!=null){
            nachfolger.alleAusgeben();
        }
    }
    
    public int durchzaehlen(){
        if(nachfolger!=null){
            return(nachfolger.durchzaehlen()+1);
        }
        else{
            return 1;
        }
    }
    
    public int wartenummergeben(DATENELEMENT dvergleich){
        if (dvergleich!=daten){
            if (nachfolger!=null){
                if (nachfolger.wartenummergeben(dvergleich)==0){
                    return 0;
                }
                else{
                    return(nachfolger.wartenummergeben(dvergleich)+1);
                }
            }
            else{
                return 0;
            }
        }
        else{
            return 1;
        }
    }
    
    public DATENELEMENT kundeentfernen(DATENELEMENT dvergleich){
        if(nachfolger!=null){
            if(nachfolger.datenGeben()!=dvergleich){
                return (nachfolger.kundeentfernen(dvergleich));
            }
            else{
                DATENELEMENT alternachfolger;
                alternachfolger=nachfolger.datenGeben();
                nachfolger=nachfolger.nachfolgerGeben();
                return(alternachfolger);
            }
        }
        else{
            return null;
        }
    }
}
