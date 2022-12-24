import java.util.Scanner;

public class ex1revision {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int taille;
        // lecture et verification des inputs
        do{
            System.out.println("Entrer la taille du tableau");
            taille=sc.nextInt();
        } while(taille <=0);

        String [] tab=new String [taille];
        for (int i=0;i<taille;i++){
            System.out.println(" tab ["+i+"] :");
            tab [i]=sc.next();}

        for (int i=0;i<taille;i++){
            System.out.print("|" +tab [i]);

    }
}}
