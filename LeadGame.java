import java.util.*;
import java.lang.*;
import java.io.*;

class LeadGame {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxLead = 0, currLead = 0, winner = 0;
        int score1 = 0, score2 = 0;
        for (int i = 0; i < n; i++) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            score1 += s1;
            score2 += s2;
            currLead = score1 - score2;
            if (currLead > maxLead) {
                maxLead = currLead;
                winner = 1;
            } else if (-currLead > maxLead) {
                maxLead = -currLead;
                winner = 2;
            }
        }
        System.out.println(winner + " " + maxLead);
        sc.close();
    }
}
