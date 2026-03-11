package stack;

public class myStack {

    private int arr[];
    private int top ;

    public myStack(int n){
       arr = new int[1000];
       top = -1;
    }

    public void push(int x){
        if(top > 1000) {
            System.out.println("Value Exceed");
        }

        top = top + 1;
        arr[top] = x;
    }

    public int pop(){
        if(top == -1) return  -1;

        
    }
}
