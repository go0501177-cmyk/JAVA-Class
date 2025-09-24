public class method1{
 
    
    public static void main(String[] args) {
        final int MAX_SIZE = 100;

        System.out.println("상수 1 : "+ MAX_SIZE); 
        int num1 = 123;   // 10진수 표현
        int num2 = 0123;  // 8진수 표현
        int num3 = 0x123; // 16진수 표현

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);

        System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
        System.out.println(3147483647L + 3147483648L);
        System.out.println(3.0004999F + 2.0004999F);
        System.out.println(3.0004999D + 2.0004999D);

        int num5 =50;
        long num6 =3147483647L;
        System.out.println(num5 + num6);

        double pi = 3.1415;
        int wholeNumber = (int)pi;
        
        short num = 10;
        num = (short)(num + 77L);   // 형 변환 안하면 컴파일 오류 발생
        int rate = 3;
        rate = (int)(rate * 3.5);   // 형 변환 안하면 컴파일 오류 발생
        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num += 77L;    // 형 변환 필요하지 않다.
        rate = 3;
        rate *= 3.5;   // 형 변환 필요하지 않다.
        System.out.println(num);
        System.out.println(rate);


        // 간단한 계산
        int num10 = 10;
        int num11 = 5;
        int sum = num10 + num11;

        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(num11 + " + " + num10 + " = " + sum);
    }



       
    


    }

      

