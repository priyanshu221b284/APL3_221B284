
class Mother {
    int x;

    void show() {
        System.out.println("This is the show method of Mother class.");
    }
}


class Child extends Mother {
    
}

class Application {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show();

        Child ch = new Child();
        ch.show(); 
    }
}
