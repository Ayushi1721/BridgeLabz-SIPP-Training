package Linearandbinarysearch;
public class SentenceSearch {
    public static void main(String[] args) {
        String[] sentences = {"Hello world", "Java programming", "Data Structures"};
        String target = "Java";
        String found = "Not Found";
        for (String s : sentences) {
            if (s.contains(target)) {
                found = s;
                break;
            }
        }
        System.out.println(found);
    }
}


