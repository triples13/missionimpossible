package com.learning.recursion;

public class TestInfixtoPostfix {
    public static void main(String []args){

        String s="A+(B*C-(D/E-F)*G)*H";
        InfixToPostfix postfix=new InfixToPostfix();
        String result=postfix.infixToPostfix(s);
        System.out.println("hey string :"+result);
        String evaluate="123*+5-";
        int exprssionresult=postfix.evaluatePostfix(evaluate);
        System.out.println("expression evaluation"+exprssionresult);
    }
}
