import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Star {
    public static void main(String[] args) {
        // 1.
        System.out.println("1번");
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.printf("*");
            }
            System.out.println();
        }


        // 2.
        System.out.println();
        System.out.println("2번");
        for (int i = 0; i < 5; i++) {
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // 3.
        System.out.println();
        System.out.println("3번");
        for(int i=0; i<5; i++) {
            for(int j=4; j>i; j--){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // 4.
        System.out.println();
        System.out.println("4번");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < i%3; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0 ; j < 3-2*i ; j++) {
                System.out.print(" ");
            }
            if(i == 2) {
                System.out.println();
                break;
            }
            System.out.println("*");
        }
        for(int i=0; i<2; i++) {
            for(int j = 0; j >= i; j--) {
               System.out.print(" ");
            }
            System.out.print("*");
            for(int j = 0 ; j <= 2*i ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //도연
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int x = i;
            //가장 중간 줄일 때
            if ( i == num / 2 + 1) {
                for( int j = 0; j < num / 2; j ++) {
                    System.out.print('_');
                }
                System.out.print('*');
                for( int h = 0; h < num / 2; h ++) {
                    System.out.print('_');
                }
            }
            //나머지
            else {
                //세로 기준 중간 아래 줄 (대칭으로 하려고)
                if ( i >= num / 2 + 1) {
                    x = num - i + 1;
                }

                for (int a = 0; a < x - 1 ; a++) {
                    System.out.print('_');
                }
                System.out.print('*');
                for (int b = 0; b < num - 2 * x ; b++) {
                    System.out.print('_');
                }
                System.out.print('*');
                for (int b = 0; b < x - 1 ; b++) {
                    System.out.print('_');
                }
            }
            System.out.println(); //줄바꿈
        }

        // 5.
        System.out.println();
        System.out.println("5번");
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 6.
        System.out.println();
        System.out.println("6번");
        for(int i = 1; i <= 5; i++) {
            for(int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 7.
        System.out.println();
        System.out.println("7번");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 8.
        System.out.println();
        System.out.println("8번");
        for (int i = 1; i <= 5; i++) {
            for(int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 9.
        System.out.println();
        System.out.println("9번");
        for(int i = 1; i <= 3; i++) {
            for(int k = 1; k <= ((i-1)%3); k++) {
                System.out.print(" ");
            }
            for(int j = 5; j >= (2*i-1) ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=2; i++) {
            for(int j=1; j>=(i%3); j--) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 용준님꺼
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= i && j <= 5 - i - 1) {
                    System.out.print("*");
                } else if (j <= i && i >= 5 - j - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 10.
        System.out.println();
        System.out.println("10번");
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++){
                if(i == 2 || j == 0 || j == 4) {
                    System.out.print("*");
                }else if(i == j || (i+j)==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
       }

    }
}