public class derksworld
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (String value : strArray) {
                System.out.println(value);
        }
        for (String value : strArray) {
                System.out.print(value);
        }
        System.out.println();
        for (String value : strArray) {
                System.out.print(value+"-");
        }
    }
}