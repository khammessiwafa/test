import java.util.Scanner;

public class ex5revision {
    public static void main(String[] args) {
        int esp = 0, voy = 0, con = 0, div = 0;
        String chaine ;
        Scanner sc = new Scanner (System.in);

        System.out.println(" Saisir une phrase");
        chaine = sc.nextLine();

        // declaration et creation du tableau
        char [] tab= new char[chaine.length()];
        //remplir le tableau
        for(int i=0;i<(chaine.length());i++){
            System.out.println("tab["+i+"]");
            tab[i]= chaine.charAt(i);
        }
        // affichage du tableau
        for(int i=0;i<(chaine.length());i++){
            System.out.print(tab[i]+" |");
        }

        for(int i=0;i<chaine.length();i++){
            if (tab[i]==' '){ esp++;}
            //Character.toLowerCase(tab[i])=='a'
            else if ((tab[i])=='a' || tab[i]=='A' ||tab[i]=='o'|| tab[i]=='O'||
                    tab[i]=='e' || tab[i]=='E'|| tab[i]=='I' || tab[i]=='i' ||tab[i]=='u'
                    || tab[i]=='U' ||tab[i]=='y' ||tab[i]=='Y'){ voy++;
            } else if (( tab[i]>97 && tab[i]<=122)|| (tab[i]>'A' && tab[i]<= 'Z') ){ con++;
            }
            else {div++;}


        }
        System.out.println();
        System.out.println(" Nombre de consomne ="+con);
        System.out.println("Nombre de voyelle = "+voy);
        System.out.println(" Nombre d'espace = "+esp);
        System.out.println(" Nombre de caractere divers = "+div );
    }
}
