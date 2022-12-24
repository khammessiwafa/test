import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phrase;
        int esp = 0, voy = 0, con = 0, div = 0;
        //lecture de la phrase
        System.out.println(" Veuillez saisir une phrase: ");
        phrase = sc.nextLine();
        //Declarer et creer le tableau
        char [] tab=new char[phrase.length()];
        //remplir le tableau
        for(int i=0;i<phrase.length();i++){
            tab[i]=phrase.charAt(i);
        }
        //affichage du tableau
        for(int i=0;i<phrase.length();i++){
            System.out.print(tab[i]+" |");
        }

        for(int i=0;i<phrase.length();i++){
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
    }}
