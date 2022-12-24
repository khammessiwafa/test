import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {

// declaration du scanner
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
        System.out.println(" Saisir une valeur numerique");
        int valCher= sc.nextInt();
        int occ=0;
        // boolean notExist= false;
        //les positions de valCher dans tab
        for (int i=0;i<taille;i++){

            if(valCher==tab[i]){
                occ++;
                // notEexist=true;
                System.out.println(valCher+" se trouve dans la case : "+(i+1)+", qui a comme indice :"+i);
            }
        }
        if (occ==0) System.out.println(valCher+" n'existe pas le tableau");

        sc.close();
    }
}
