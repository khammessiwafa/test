

import java.util.Scanner;



public class ex3Thomas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int times = 0;

        System.out.println("Entrez le nombre de variable");

        int arrNumb = scan.nextInt();



        int array[];



        array = new int[arrNumb];



        for (int i = 0; i < arrNumb; i++){

            System.out.println("Saisir tab["+i+"]");

            array[i] = scan.nextInt();

        }

        System.out.print("[");

        for (int i = 0; i < arrNumb ;i++){

            if (i == arrNumb-1){

                System.out.print(array[i]+"]");

                break;

            }

            System.out.print(array[i]+", ");

        }

        int numb = array[0];

        for (int i = 0; i < arrNumb ;i++){

            if(array[i] >= numb){



            } else{

                System.out.println("Mauvaise orde"); System.exit(0);

            }

            numb = array[i];








        }

        System.out.println("\nBonne orde");

    }}
