package String.easy;

public class RotateString {
    public static void main(String[] args) {

//        Rotate String
        String s = "Sumit";
        System.out.println(StringRotate(s));

    }

    static String StringRotate(String s){
//        using String Builder
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        for(int i=n-1; i>=0; i--){
            sb.append(s.charAt(i));
        }

        return sb.toString();

    }
}
