package String.medium;

public class MaximumDepthParenthesis {
    public static void main(String[] args) {

    }

    static int Depth(String s){
        int n = s.length();
        int res = 0 , count = 0;

        for(int i=0; i<n; i++){

            if(s.charAt(i)==')'){
                count--;
            }

            if(s.charAt(i)=='('){
             count++;
            }

            if(count > res){
                res = count;
            }
        }

        return res;
    }
}
