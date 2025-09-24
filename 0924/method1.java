public class method1{
 
    
    public static void main(String[] args) {
        

        // 간단한 계산
        int num1 = 10;
        int num2 = 5;
        int sum = num1 + num2;

        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(num1 + " + " + num2 + " = " + sum);

         // 함수(메서드) 호출
        printCalculation(num1, num2, sum);
        printCalculation1(num1, num2, sum);
        sum_prin(num1, num2);
    }
    // 계산 결과를 출력하는 메서드
    public static void printCalculation(int number1, int number2, int result) {
        System.out.println("\\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    public static void sum_prin(int num1, int num2){
        int rt = num1 + num2;

        System.out.println("\\n=== 더하기 계산 ===");
        System.out.println(num1 + " + " + num2 + " = " + rt);

    }

    // 계산 결과를 출력하는 private 메서드
    private static void printCalculation1(int number1, int number2, int result) {
        System.out.println("\\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

       
    


    }

      

