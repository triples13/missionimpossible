package com.learning.recursion;
import java.util.*;

public class InfixToPostfix {

    public int evaluatePostfix(String expression){
        Stack<Integer> digitstack=new Stack<>();
        int result=0;
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(Character.isDigit(c)){
                int number=c-'0';
                digitstack.push(number);
                System.out.println("number :"+number);
            }
            else if(c=='*'){
                int first=digitstack.pop();
                int second=digitstack.pop();
                result=second*first;
                digitstack.push(result);

            }
            else if(c=='/'){
                int first=digitstack.pop();
                int second=digitstack.pop();
                result=second/first;
                digitstack.push(result);

            }
            else if(c=='+'){
                int first=digitstack.pop();
                int second=digitstack.pop();
                result=second+first;
                digitstack.push(result);

            }
            else if(c=='-'){
                int first=digitstack.pop();
                int second=digitstack.pop();
                result=second-first;
                digitstack.push(result);

            }

        }

        return digitstack.pop();
    }

    public String infixToPostfix(String expression){
        String result="";
        Stack<Character> infixtopostfixstack=new Stack<>();
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result+=c;
            }
            else if(c=='('){
                infixtopostfixstack.push(c);
            }
            else if (c==')'){
                while(!infixtopostfixstack.isEmpty() && infixtopostfixstack.peek()!='(')
                    result+=infixtopostfixstack.pop();
                if(!infixtopostfixstack.isEmpty() && infixtopostfixstack.peek()=='(')
                    infixtopostfixstack.pop();
            }
            else{
                while(!infixtopostfixstack.isEmpty()&& checkPrecdence(c)<checkPrecdence(infixtopostfixstack.peek()))
                    result+=infixtopostfixstack.pop();
                infixtopostfixstack.push(c);
            }
        }

        while(!infixtopostfixstack.isEmpty()){
            result+=infixtopostfixstack.pop();
        }
        return result;
    }

    static int checkPrecdence(char ch){
        switch (ch){
            case '+':
            case '-':return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
