public class RenameThisClass
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i;
        double f = 2.5;
        boolean flag = true;
        i = 10;
        f = i + f;
        flag = !flag;
        while (i<5) {
            System.out.print(++i);
        }
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringsEqual = string1.equals(string3);
        String[] Array = {"Alpha","Bravo","Delta","Echo"};
        for (String i = 0;i < Array.length; i++) {
            Array[i] = Array[1] * 2;
            System.out.println(Array[1]);
        }
    }
}