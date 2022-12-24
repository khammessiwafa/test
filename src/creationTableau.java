import java.util.Scanner;
public class creationTableau {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Declaration de tableau
        int [] etudiants;
        double moyenne [];
        //Creation
        etudiants=new int[5];  // |0|0|0|0|0|
        moyenne=new double[3]; // |0|0|0|
        //Declaration et creation
        int [] table3=new int[10];
        int [][] table4=new int[4][4];
// lecture
        System.out.println(etudiants[2]);
        var x= moyenne[2];
        System.out.println(x);
//Ecriture
        etudiants[0]=15; // |15|0|0|0|0|
        etudiants[4]=20; // |15|0|0|0|20|
        // remplissage d'un tableau
        for (int i=0;i<10;i++){
            table3[i]=i*2;
        }
        for (int i=0;i<5;i++){
            System.out.println(" etudiants ["+i+"] :");
            etudiants[i]=sc.nextInt();
        }
        // affichage du tableau
        System.out.println("Table3:");
        System.out.println("--------------------");
        for (int i=0;i<table3.length;i++){
            System.out.print( "|"+ table3[i]);
        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Etudiants:");
        System.out.println("--------------------");
        System.out.println();
        for (int i=0;i<5;i++){
            System.out.print( "|"+ etudiants[i]);
        }

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.println(" table4 ["+i+"] ["+j+"] :");
                table4[i][j]=sc.nextInt();
            }}
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print( "|"+ table4[i][j]);
            }
            System.out.println();}
    }
}
