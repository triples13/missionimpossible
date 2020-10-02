package com.learning.recursion;

import java.util.ArrayList;
import java.util.Stack;

public class StackOperation {

    public static void main(String []args){
        StackOperation stackops=new StackOperation();
        Stack<Integer> integerstack=new Stack<>();
        integerstack.push(12);
        integerstack.push(34);
        integerstack.push(3);
        integerstack.push(67);
        integerstack.push(1);
       // StackOperation.sortstack(integerstack);
        String expression="{{{{";
      //  int operations= StackOperation.minimumreversalrequired(expression);
       // System.out.println("minimum required:"+operations);

        ArrayList<Integer> A=new ArrayList<>();
        A.add(34);
        A.add(35);
        A.add(27);
        A.add(42);
        A.add(5);
        A.add(28);
        A.add(39);
        A.add(20);
        A.add(28);

        ArrayList<Integer> result=StackOperation.prevSmaller(A);
        for (Integer x:result){
            System.out.println(x);
        }

    }

    public boolean isvalidSymbolpattern(String s){

        Stack<Character> stack=new Stack<>();
        if(s==null ||s.length()==0){
            return true;
        }
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)==')'){
               if(!stack.isEmpty() && stack.peek()=='(')
                   stack.pop();

               else
                   return false;
           }
           else if(s.charAt(i)==']'){
               if(!stack.isEmpty() && stack.peek()=='[')
                   stack.pop();
               else
                   return false;
           }
           else if(s.charAt(i)=='}'){
               if(!stack.isEmpty() && stack.peek()=='{')
                   stack.pop();
               else
                   return  false;
           }
           else{
               stack.push(s.charAt(i));
           }

        }
        if(stack.isEmpty()){
            return  true;
        }
        else
            return  false;

    }

    public static  void reverseStack( Stack<Integer> operation){

        if(operation.isEmpty()) {
            return;
        }
        int temp=operation.pop();

        reverseStack(operation);
        pushinstack(temp,operation);
    }

    public static void pushinstack(int temp, Stack<Integer> operation){
        operation.push(temp);
    }

    public static void sortstack(Stack<Integer> operation){


        Stack<Integer> temp=new Stack<Integer>();

        while(!operation.isEmpty()){

          int  var=operation.pop();


          if(temp.isEmpty()){
              temp.push(var);
          }
                    while (var <temp.peek() && !temp.isEmpty()) {
                        operation.push(temp.pop());
                    }
                    temp.push(var);


        }

        while(!temp.isEmpty()){
            System.out.println("element"+temp.peek());
            temp.pop();
        }
    }


    public static void getCountOfBrackets(String expression){

        Stack<Integer> integerStack=new Stack<>();
        int []array=new int[expression.length()];
        int count=1;
        for(int i=0;i<expression.length();i++){
           Character str= expression.charAt(i);
           if(str=='('){
               integerStack.push(count);
               array[i]=count;
               count++;
           }
           else if(str==')'){
               array[i]=integerStack.pop();
           }
        }

        for(int i=0;i<array.length;++i){
            System.out.println("elements are:"+array[i]);
        }
    }

    public static int minimumreversalrequired(String expression){
        Stack<Character> stackarray=new Stack<>();
        int count=0;
        boolean matched=false;

        if (expression.length()%2!=0){
            System.out.println("can't be reversed");
        }
        else {
            for(int i=0;i<expression.length();i++){
                char ch=expression.charAt(i);

                if(stackarray.isEmpty() || ch=='{'){
                    stackarray.push(ch);
                    count++;
                }

                else if(ch=='}' || stackarray.isEmpty())
                {
                    if(!stackarray.isEmpty() && stackarray.peek()=='{')
                    {
                        count=count-1;
                        stackarray.pop();
                        matched=true;
                    }
                    else {
                        stackarray.push(ch);
                        count++;
                    }
                }

            }
        }

        if(matched || count==expression.length()){
            count=count/2;
        }
        return count;
    }

    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {

        ArrayList<Integer> smallerElements=new ArrayList<>();
        Stack<Integer> holder=new Stack<>();
        int smallestnumber=0;

        for(Integer number:A){
            if(holder.isEmpty()){
                smallerElements.add(-1);
                smallestnumber=number;
                holder.push(number);
            }
            else{
                if(number>smallestnumber){
                    smallerElements.add(smallestnumber);
                    holder.push(number);
                }
                else{
                    smallestnumber=number;
                    smallerElements.add(-1);
                    holder.push(number);
                }
            }
        }
        return smallerElements;
    }
}
