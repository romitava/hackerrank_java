import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner line = new Scanner(System.in); 
        int counter = 1; 
        while (line.hasNextLine()) {
        String lineStr = line.nextLine(); 
        System.out.println(counter + " " + lineStr);
        counter++;
        }
        line.close();
    }
}
