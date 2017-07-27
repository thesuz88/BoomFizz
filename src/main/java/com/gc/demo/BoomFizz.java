package com.gc.demo;

/**
 * Created by Steve on 7/27/2017.
 */
public class BoomFizz {

    /*
       Accepts integer values and returns a "boom" if the
       input number is divisible by 7 or contains a 7 digit,
       otherwise return the input value
        */
    public String boom(int number){

        if (number % 7 == 0){
            return "Boom";
        }else if (Integer.toString(number).contains("7")){
            return "Boom";
        }else{
            return Integer.toString(number);
        }

    }
}
