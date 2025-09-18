public class MyFirstClass {
    // 인스턴스 변수
    private String name;
    private int number;
    
    // 생성자
    public MyFirstClass(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    // 메서드
    public void introduce() {
        System.out.println("안녕하세요! 저는 " + name + "입니다.");
        System.out.println("제 번호는 " + number + "입니다.");
    }
    
    // Getter 메서드
    public String getName() {
        return name;
    }
    
    public int getNumber() {
        return number;
    }
    
    public static void main(String[] args) {
        MyFirstClass obj = new MyFirstClass("자바학습자", 1);
        obj.introduce();
    }
}