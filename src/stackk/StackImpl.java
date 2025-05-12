package stackk;

public class StackImpl {
    private int[] arr;
    private int maxSize;
    private int top = 0;

    public StackImpl(int size){
        this.maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    //push operation
    public void push(int data){
        if(top == maxSize-1){
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = data;
        }
    }

    // pop operation
    public int pop(int data){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }

        int lastElement = arr[top];
        top--;
        return lastElement;
    }


    //to check if top is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //peek operation
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }

        return arr[top];
    }

    // display elements in stack
    public void displayElements(){
        if(top == -1){
            System.out.println("Stack is full");
        }

        for(int i = 0; i <= top; i++){
            System.out.println(arr[i] + "\t");
        }
    }



    public static void main(String[] args) {
        StackImpl stackImpl = new StackImpl(4);
        stackImpl.push(10);
        stackImpl.push(20);
        stackImpl.push(30);

        stackImpl.displayElements();

        stackImpl.pop(30);
        stackImpl.displayElements();

        stackImpl.peek();

    }

}
