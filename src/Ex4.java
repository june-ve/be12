public class Ex4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;sum<100;i++) {
            if(i%2==0) {
                sum-=i;
            }else{
                sum+=i;
            }
            System.out.println("i="+i);
        }
        System.out.println("sum="+sum);
    }
}
