package JPmorgan;

import java.util.Arrays;
import java.util.Scanner;

class CharCount implements Comparable<CharCount> {
    char character;
    int count;

    public CharCount(char character, int count) {
        this.character = character;
        this.count = count;
    }

    @Override
    public int compareTo(CharCount other) {
  
        return Integer.compare(other.count, this.count);
    }
}

public class occurnce_sort {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] c = s.toCharArray();
        Arrays.sort(c);

      
        int[] count = new int[26]; 
        for (char x : c) {
            count[x - 'a']++;
        }

        
        CharCount[] charCounts = new CharCount[26];
        for (int i = 0; i < 26; i++) {
            charCounts[i] = new CharCount((char) ('a' + i), count[i]);
        }

      
        Arrays.sort(charCounts);

      
        System.out.print("Sorted char array (by count, in decreasing order): ");
        for (CharCount charCount : charCounts) {
            for (int i = 0; i < charCount.count; i++) {
                System.out.print(charCount.character + " ");
            }
        }
    }
}
