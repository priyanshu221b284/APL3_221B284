class Drinks{
    public static void main(String[] args){
        Beverage b = new Whiskey();
        b.template(35);
        System.out.println("**********************************");
        b = new Beer();
        b.template(500);
    }
}