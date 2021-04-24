package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class test {

        public static void main(String[] args) throws IOException {
            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);
            String line1;
            int lineInt;
            String line2;
            int sum[] = new int[10];
//            System.out.println("enter num");
//            line1 = in.readLine();
            System.out.println("enter array");
            line2 = in.readLine();
//            lineInt = Integer.parseInt(line1);
//            int val = lineInt*lineInt;
            String[] array = line2.split(",");
//            System.out.println(val);

            for (int i=0;i<array.length;i++){
                if (i==0) {
                    sum[i] = Integer.parseInt(array[i]);
                }
                else sum[i] = Integer.parseInt(array[i]) + Integer.parseInt(String.valueOf(sum[i-1]));
            }
            for (int i =0;i<sum.length;i++)
            System.out.println(sum[i]);
        }
    }


