package FunctionalInterfaces;
interface TestSecurity {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*");
    }
}

public class TestSecurity {
    public static void main(String[] args) {
        System.out.println(TestSecurity.isStrongPassword("Pass1234")); // true
    }
}


