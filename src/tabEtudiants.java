import java.util.Scanner;

public class tabEtudiants {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            //Declaration de tableau
        int [] etudiants;

        // Creation
        etudiants=new int[5];  // |0|0|0|0|0|



        for (int i=0;i<5;i++){
            System.out.println(" etudiants ["+i+"] :");
            etudiants[i]=sc.nextInt();}

        for (int i=0;i<5;i++){
            System.out.print("|" +etudiants [i]);

    }

}}
