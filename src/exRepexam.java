import java.util.Scanner;

public class exRepexam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chaine;

        //lecture de la phrase
        System.out.println(" Veuillez saisir une phrase: ");
        chaine = sc.nextLine();
        //Declarer et creer le tableau
        char [] tab=new char[chaine.length()];
        //remplir le tableau
        for(int i=0;i<chaine.length();i++){
            tab[i]=chaine.charAt(i);
        }
        //affichage du tableau
        for(int i=0;i<chaine.length();i++){
            System.out.print(tab[i]+" |");
        }
    }
}
