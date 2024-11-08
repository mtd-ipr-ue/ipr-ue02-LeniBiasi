import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        Out.println("Geben Sie eine Jahreszahl ein:");
        int Jahr = 2024;

        Out.println(".Geben Sie einen Monatswert ein:");
        int Monat = 1;

        if (Monat < 1 || Monat > 12) {
        Out.println("Fehler: Der Monatswert muss zwischen 1 und 12 liegen.");
        return;
        }

        boolean isLeapJahr= (Jahr % 4 == 0 && Jahr % 100 != 0) || (Jahr % 400 == 0);

    int Tage;
    switch (Monat) {
        case 1, 3, 5, 7, 8, 10, 12 -> // Jannuar
            // Dezember
            Tage = 31;
        case 4, 6, 9, 11 -> // März
            // November
            Tage = 30;
        case 2 -> // Mai
            {
            // Februar
            if(isLeapJahr) {
                Tage = 29;
            } else{
                Tage = 28;
            }   }
        default -> // Juli
            Tage = 0;
    }
    
    Out.println("Der Monat" + Monat + "im Jahr" + Jahr + "hat" + Tage + "Tage.");

    }
}
