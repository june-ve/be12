public class Ex1 {
    public static void main(String[] args) {
        int x = 16;
        char ch = 'x';
        int year = 2025;
        boolean powerOn = false;
        String str = new String("yes");

        System.out.println(10<x && x<20);
        System.out.println(ch!=' ' && ch!='\t');
        System.out.println(ch=='x' || ch=='X');
        System.out.println( (year%400==0) || (year%4==0) && (year%100!=0) );
        System.out.println(powerOn==false);
        System.out.println(str.equals("yes"));
    }
}
