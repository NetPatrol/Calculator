package com.calculator;

public class Action {
    private static String m;
    private static String mb;
    /**
    * Welcome message.
    * */
    public String Hello(){
        m = "============================================= \nHello! it's my Calculator two numbers a and b";
        return m;
    }
    /**
     * Input message.
     * */
    public String inputNum(){
        m = "Input expression \n==================";
        return m;
    }
    /**
    * The message that is displayed if you entered not a number,
    * but something else.
    * */
    public String errNum(){
        m = "Not a number";
        return m;
    }
    /**
     * Calculation result message
     * */
    public String resMess(){
        m = "the result of your torment: \n==================\n";
        return m;
    }
    public String errorInput(){
        m = "Неверный ввод";
        return m;
    }
}
