import java.util.Scanner;

public class ex3revision {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int taille;
        // lecture et verification des inputs
        do{
            System.out.println("Entrer la taille du tableau");
            taille=sc.nextInt();
        } while(taille <=0);
        // declaration et creation du tableau
        int [] tab= new int[taille];
        //remplire le tableau
        //remplissage du tableau
        for(int i=0;i<taille;i++){
            System.out.println("tab["+i+"]");
            tab[i]= sc.nextInt();
        }
        // affichage du tableau
        for(int i=0;i<taille;i++){
            System.out.print(tab[i]+" |");
        }

        for (int i=0;i<taille-1;i++) {

            if (tab[i] > tab[i + 1]) {

                System.out.println(" le tableau n'est pas trié ");
                break;
            }
        }
}}
