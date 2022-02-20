package Stack.PracticeProblems;

import Queue.Main;

public class TwoStackInAnArray {
    int[] arr;
    int size = 0;
    int top1, top2, cap;
    TwoStackInAnArray(int n){
        cap = n;
        top1 = -1;
        top2 = cap;
        arr = new int[cap];
    }

    public void push1(int item)
    {
        if(top1 < top2 - 1)
        {
            top1++;
            arr[top1] = item;
        }
    }
    public void push2(int item)
    {
        if(top1 < top2 - 1)
        {
            top2--;
            arr[top2] = item;
        }
    }

    public int pop1(){
        if(top1 >= 0)
        {
            int removed = arr[top1];
            top1--;
            return removed;
        }
        else{
            return -1;
        }
    }

    public int pop2(){
        if(top1 < cap)
        {
            int removed = arr[top2];
            top2++;
            return removed;
        }
        else{
            return -1;
        }
    }
    public void display1(){
        for(int i = 0; i <= top1; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void display2(){
        for(int i = top2; i < cap; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TwoStackInAnArray stack = new TwoStackInAnArray(6);
        stack.push1(2);
        stack.push1(4);
        stack.push1(6);
        stack.push2(23);
        stack.push2(25);
        stack.push2(29);
        stack.display1();
        stack.display2();
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        stack.display1();
        stack.display2();
    }
}
