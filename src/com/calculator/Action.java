package com.calculator;

public class Action {
    private static String m;
    /**
    * Welcome message.
    * */
    public String Hello(){
        this.m = "Hello! it's my Calculator two numbers a and b";
        return m;
    }
    /**
     * Input message.
     * */
    public String inputNum(){
        this.m = "Input number";
        return m;
    }
    /**
     * Input operator.
     * */
    public String inputSign(){
        this.m = "Input operator";
        return m;
    }
    /**
    * The message that is displayed if you entered not a number,
    * but something else.
    * */
    public String errNum(){
        this.m = "Not a number";
        return m;
    }
    /**
     * The message that is displayed if a non-expression operator
     * is entered
     * */
    public String errSign(){
        this.m = "It is not an operator";
        return m;
    }
    /**
     * Calculation result message
     * */
    public String resMess(){
        this.m = "the result of your torment: ";
        return m;
    }
}
