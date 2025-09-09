package Linearandbinarysearch;
public class StringBufferConcatenate {
    public static void main(String[] args) {
        String[] strings = {"Java", "Python", "C++", "Go"};
        StringBuffer sb = new StringBuffer();
        for (String s : strings) sb.append(s);
        System.out.println("Concatenated String: " + sb.toString());
    }
}

