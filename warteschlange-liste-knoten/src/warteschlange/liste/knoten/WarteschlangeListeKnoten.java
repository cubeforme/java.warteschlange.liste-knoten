package warteschlange.liste.knoten;
public class WarteschlangeListeKnoten {
    public static void main(String[] args) {
        //Liste wird über Konstruktor erstellt
        LISTE l1=new LISTE();
        //Datenelemente werden erzeugt
        DATENELEMENT d1 = new DATENELEMENT("Kästner", "Stefan");
        DATENELEMENT d2 = new DATENELEMENT("Mustermann", "Max");
        DATENELEMENT d3 = new DATENELEMENT("Musterfrau", "Erika");
        DATENELEMENT d4 = new DATENELEMENT("Maier", "Fritz");
        //Datenelemente werden eingefuegt
        l1.hintenEinfuegen(d1);
        l1.hintenEinfuegen(d2);
        l1.einfuegenVor(d3, d2);
        //Alle Datenelemente in der Schlange werden ausgegeben
        l1.alleAusgeben();
        //Anzahl der wartenden Kunden werden ausgegeben
        System.out.println(l1.durchzaehlen()+" Kunden warten");
        //---
        System.out.println("---");
        l1.anfangEntfernen();
        l1.alleAusgeben();
        System.out.println(l1.durchzaehlen()+" Kunden warten");
        //---
        System.out.println("---");
        l1.vorneEinfuegen(d2);
        l1.hintenEinfuegen(d4);
        l1.alleAusgeben();
        System.out.println(l1.durchzaehlen()+" Kunden warten");
        //Kunde wird gesucht und wenn er gefunden wird, wird die Warteposition ausgegeben:
        //Wenn die Zahl, die hier ankommt gleich 0 ist, befindet sich der ges. Kunde nicht in der Warteschlange.
        if (l1.wartenummergeben(d1)==0){
            System.out.println("Der Kunde konnte in dieser Liste nicht gefunden werden");
        }
        else{
            System.out.println("Der angegebene Kunde ist in Warteposition "+l1.wartenummergeben(d1));
        }
        //Der Knoten mit folgenden Datenelementen wird entfernt
        l1.kundeentfernen(d4);
        l1.kundeentfernen(d2);
        l1.alleAusgeben();
    }
}