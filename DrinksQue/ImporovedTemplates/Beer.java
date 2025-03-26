class Beer extends Beverage{
    protected void addCondiments(){
        System.out.println("nothing to add");
    }
    protected void pour(int qui){
        System.out.println("Pour Beer in the beer mug which is of " + qui + " ml");
    }
}