package Submissionofalgo;
public class StringConcatenationDemo {

    public static void main(String[] args) {
        int n = 100000;

        // Using String
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        long end = System.nanoTime();
        System.out.println("String: " + (end - start)/1e6 + " ms");

        // Using StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start)/1e6 + " ms");

        // Using StringBuffer
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("a");
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start)/1e6 + " ms");
    }
}


