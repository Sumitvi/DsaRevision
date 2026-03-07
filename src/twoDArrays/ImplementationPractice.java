package twoDArrays;

import java.util.Scanner;

public class ImplementationPractice {
    public static void main(String[] args) {

        int arr[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Arrays Elements");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }


        System.out.println("Matrix is ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }


    }
}
