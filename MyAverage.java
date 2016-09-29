package com.example.gaeul.mpexercise;

/**
 * Created by Gaeul on 2016-09-29.
 */
public class MyAverage implements MyValues {
    public int getResult(){
        int sum = 0;

        for (int i=0; i<Array.length;i++){
            sum += Array[i];
        }
        int aver = sum/Array.length;

        return aver;
    }
}
