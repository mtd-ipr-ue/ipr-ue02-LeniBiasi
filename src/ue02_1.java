import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {

        int x = 50;
        int y = 100;
        int z = 150;

        int max = x;
        if(y > max) {
            max = y;
        }

        if(z > max){
            max = z;
        }

        Out.println("Das Maximum der drei Zahlen ist: "+ max);


    }
}
