public class Main {
    public static int[] coldDays (int []tomb){
        int a= 0;
        for (int i = 0; i < tomb.length; i++) {  //Számláló, hogy hány ilyen nap van
            if (tomb[i]<0){
                a++;
            }
        }

        int [] coldDays2 = new int[a];   //Új tömb, a mérete a 0 fok alatti napok száma, amit az 'a' változóba tároltam
        int b=0;
        for (int i = 0; i < tomb.length; i++) {  //Itt kéne az új tömbbe raknia

            if (tomb[i]<0){
                coldDays2[b] = tomb[i];
                b++;
            }
        }
        return coldDays2; // Returnölöm, de zagyva valamit ad vissza, összevissza karakterek, nem int.
    }
    public static void main(String[] args) {

        int[] tomb = new int[15];
        tomb[0] = 12;
        tomb[1] = 22;
        tomb[2] = -4;
        tomb[3] = 27;
        tomb[4] = -5;
        tomb[5] = 6;
        tomb[6] = -2;
        tomb[7] = -7;
        tomb[8] = 5;
        tomb[9] = 23;
        tomb[10] = 20;
        tomb[11] = 0;
        tomb[12] = -12;
        tomb[13] = 21;
        tomb[14] = 19;
        System.out.println(coldDays(tomb));
    }
}