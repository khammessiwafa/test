import java.util.Scanner;
    public class ex1 {
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
            String [] tab= new String[taille];
            //remplissage du tableau
            for(int i=0;i<taille;i++){
                System.out.println("tab["+i+"]");
                tab[i]= sc.next();
            }


            for(int i=0;i<taille;i++){
                System.out.print(tab[i]+" |");
            }

            //lecture de la chaine
            System.out.println(" \n Saisir une chaine de caractere");
            String chaine= sc.next();
            //trouver le nbr d'occurence de chaine dans le tableau
            int nbrOcc=0;
            for(int i=0;i<taille;i++){
                if (chaine.equals(tab[i])) { nbrOcc++;
                }
            }

            System.out.println(" le nombre d'occurence de "+chaine+" dans le tableau est :"+nbrOcc);
            sc.close();
        }
    }

