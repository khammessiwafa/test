import java.util.Scanner;

public class tab2Dimension {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int [][] table4=new int[3][4];

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.println(" table4 ["+i+"] ["+j+"] :");
                table4[i][j]=sc.nextInt();
            }}
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print( "|"+ table4[i][j]);
            }
            System.out.println();}


    }
}
