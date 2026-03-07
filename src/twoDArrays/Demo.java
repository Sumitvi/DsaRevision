package twoDArrays;

public class Demo {
    public static void main(String[] args) {

        int arr[][] = {{1 , 2 , 3} , {1 , 2 , 3} , {1 , 2 , 3}};

//        printing the matrix

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
