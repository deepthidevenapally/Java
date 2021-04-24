package com.company;

// this program returns the number of matches played in the tournament until a winner is decided.

public class numberOfMatches {
    public static void main(String args[]) {
            int n= 14;
            int games=0;
            int total = 0;
            for(int i=0;i<n;i++) {
                while (n > 1) {
                    if (n % 2 == 0) {
                        n = n / 2;
                        games++;
                    } else if (n % 2 != 0) {
                        n = (n / 2) + 1;
                        games = games +2;
                    }
                }
                total = total + games;
                n = games;
                games=0;
            }
            System.out.println(total);
        }
    }


