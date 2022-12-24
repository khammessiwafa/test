import java.util.Scanner;
public class tab {
    public static void main(String[] args) {

        //Declaration de tableau
        int[] etudiants;
        double moyenne[];
        //Creation
        etudiants = new int[5];  // |0|0|0|0|0|
        moyenne = new double[3]; // |0|0|0|
        //Declaration et creation
        int[] table3 = new int[10];

// lecture
        System.out.println(etudiants[2]);
        var x = moyenne[2];
        System.out.print(x);

        // remplissage d'un tableau
        for (int i=0;i<10;i++){
            table3[i]=i*2;
        }

        // Affichage d'un tableau
        for (int i=0;i<10;i++){
            System.out.print( "|" +table3[i]);

        }




    }}