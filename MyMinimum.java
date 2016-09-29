package com.example.gaeul.mpexercise;

/**
 * Created by Gaeul on 2016-09-29.
 */
public class MyMinimum implements MyValues {
    public int getResult(){
        int min = Array[0];

        for (int i = 0 ; i < Array.length-1 ; i++){
            min = (Array[i] < Array[i+1])? Array[i] : Array[i+1];
        }

        return min;
    }
}
