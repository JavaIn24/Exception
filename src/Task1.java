public class Task1 {
    public static void main(String[] args) throws Exception {
        System.out.println(numders(21));
    }
    public static int numders (int num) throws Exception {
        if (num % 2 != 0) throw new Exception("Передано нечетное число");
        return num;
    }
}