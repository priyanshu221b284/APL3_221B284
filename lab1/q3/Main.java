class Mother {
    int x;
    static void show(){
         System.out.println("static");
    }

//     void  show() {
//         System.out.println("Hello World");
//     }
//  }


class Child extends Mother {
     static void show(){
         System.out.println("static of child");
    }

    
//     @Override
//     void show() {
//         System.out.println("Hello JUET");
//     }
// }


class Main {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.show();
        Mother m1 = new Mother();
        m1.show();
        

        Child ch = new Child();
        ch.show(); 
        
    }
}
