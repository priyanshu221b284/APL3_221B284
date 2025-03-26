abstract class Beverage{
    private void pour(int qui){
        System.out.println("Pouring " + qui + " ml of beverage in glass");
    }
    protected abstract void addCondiments();
    protected void stir(){}
    private void serve(){
        System.out.println("Serving beverage");
    }
    public void template(int qui){
        pour(qui);
        addCondiments();
        stir();
        serve();
    }
}