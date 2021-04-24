package com.company;

public class IsPresent {

    static {
    String allowed = "ab";
    String words [] = {"ad","bd","aaab","baa","badab"};
    int count = 0;
    for(int i =0;i<words.length;i++){
        if(words[i].contains(allowed)){
            count++;
        }
    }


    System.out.print(count);
    }
}
