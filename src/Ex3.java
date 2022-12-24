import java.util.Scanner;
public class Ex3 {
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
        // voir si le tableau est trie
        System.out.println();
        for(int i=0;i<taille-1;i++){

            if((tab[i+1])< tab[i]){
                System.out.println(" ce tableau n'est pas trie");
                break;
            }

            if(i==(taille-2)){ System.out.println("ce tableau est trie");}
        }


    }
}
