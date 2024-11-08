import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        Out.print("Geben Sie den Radius des Kreises ein: ");


        double radius = In.readInt();

        Out.println("Geben sie die x-Koordinate des Punktes ein: ");
        double x = In.readInt();
        Out.println("Geben Sie die y-Koordinate des Punkts ein: ");
        double y = In.readInt();

        double distance = Math.sqrt(x * x + y *y);
        if (distance <= radius) {
            Out.println("Der Punkt liegt innerhalb des Kreises.");
        } else {
            Out.println("Der Punkt liegt auserhalb der Kreises.");

        }
    
    }
}
