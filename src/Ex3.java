public class Ex3 {
    public static void main(String[] args) {
        int sum = 0;
        int tmp = 0;
        for(int i=1;i<=10;i++) {
            tmp += i-1;
            sum += (tmp + i);
        }
        System.out.println(sum);
    }
}
