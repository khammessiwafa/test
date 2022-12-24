import java.util.Scanner;

public class ex2révision {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int taille, nbSaisie;
        int occ=0;
        // lecture et verification des inputs
        do{
            System.out.println("Entrer la taille du tableau");
            taille=sc.nextInt();
        } while(taille <=0);

        int [] tab=new int [taille];
        for (int i=0;i<taille;i++){
            System.out.println(" tab ["+i+"] :");
            tab [i]=sc.nextInt();}

        for (int i=0;i<taille;i++){
            System.out.print("|" +tab [i]);

        }

        System.out.println("Saisie un numéro :");
        nbSaisie=sc.nextInt();

        boolean notExist = false;
        for(int i=0;i<taille;i++) {

            if (tab[i] == nbSaisie) {
                notExist = true;
                System.out.println(nbSaisie + "est de l'indice " + i);
            }
        }









}}
