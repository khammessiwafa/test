import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int taille;
        //
        do{System.out.println("Entrer la taille du tableau");
            taille=sc.nextInt();
        } while(taille <=0);
        // declaration et creation du tableau
        int [] tab= new int[taille];
        //remplire le tableau
        for(int i=0;i<taille;i++){
            System.out.println("tab["+i+"]");
            tab[i]= sc.nextInt();
        }
        // affichage du tableau
        for(int i=0;i<taille;i++){
            System.out.print(tab[i]+" |");
        }
        System.out.println();
        int id1,id2;
        do {
            System.out.println("Saisie le premier indice");
            id1 = sc.nextInt();
        }while ((id1<0)||(id1>=taille));
        do {
            System.out.println("Saisie le deuxieme indice");
            id2 = sc.nextInt();
        }while ((id2<0)||(id2>=taille)||(id1==id2));
        //permutation
        int varInt=tab[id1];
        tab[id1]=tab[id2];
        tab[id2]=varInt;
        // affichage du tableau
        for(int i=0;i<taille;i++){
            System.out.print(tab[i]+" |");
        }


    }
}
