package String.easy;

public class RemoveOuterParen {
    public static void main(String[] args) {

        String s = "(()())(())";
        System.out.println(ParenthesisRemove(s));

    }

    static String ParenthesisRemove(String s){

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)==')'){
                count--;
            }

            if(s.charAt(i)!=0){
                sb.append(s.charAt(i));
            }

            if(s.charAt(i)=='('){
                count++;
            }
        }

        return sb.toString();
    }
}
