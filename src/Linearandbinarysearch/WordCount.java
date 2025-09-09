package Linearandbinarysearch;
import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String targetWord = "Java";
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                if (word.equals(targetWord)) count++;
            }
        }
        br.close();
        System.out.println("Occurrences of \"" + targetWord + "\": " + count);
    }
}


