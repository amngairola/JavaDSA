package Basic_Hasing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        try {

            File file = new File("../Basic_Hasing/input.txt");
            Scanner s = new Scanner(file);
            int n = Math.min(13, s.nextInt());

            int[] arr = new int[n];

            for (int index = 0; index < arr.length; index++) {
                arr[index] = s.nextInt();
            }
            // precompute
            int[] hash = new int[13];
            for (int i = 0; i < n; i++) {
                hash[arr[i]] += 1;
            }
            System.out.println("query");
            int q = s.nextInt();
            while (q >= 0) {
                int number = s.nextInt();
                // feth number
                System.out.println(hash[number]);
                q--;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println("Error reading input: Insufficient elements in the file");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
