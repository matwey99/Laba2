import java.util.Scanner;

public class Main {
    
    public static boolean cyclicShift(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String doubled = s + s;
        return doubled.contains(t);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("S: ");
        String s = scanner.next();

        System.out.print("T: ");
        String t = scanner.next();

        if (cyclicShift(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}