package Task2;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(exceptString("Привет"));
    }
    public static String exceptString (String a) throws Exception {
        if (a.contains("1") || a.contains("2") || a.contains("3")
                || a.contains("4") || a.contains("5") || a.contains("6")
                || a.contains("7") || a.contains("8") || a.contains("9")) throw new Exception("Строка содержит числа");
        return a;
    }
}
