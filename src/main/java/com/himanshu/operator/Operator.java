package com.himanshu.operator;

public class Operator
{
    private double result;

    public Operator()
    {

    }

    public void operate(double num1,double num2,char expr)
    {

        switch(expr)
        {
            case '+':result=num1+num2;
                break;
            case '-':result=num1-num2;
                break;
            case '*':result=num1*num2;
                break;
            case '/':result=num1/num2;
                break;
            default:break;
        }
    }
    
    public void displayResult()
    {
        System.out.println("Result : "+result);
    }
}