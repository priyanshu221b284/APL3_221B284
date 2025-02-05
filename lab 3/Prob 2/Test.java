// Test.java
public class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Display method implemented in Test class.");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.display();
    }
}
