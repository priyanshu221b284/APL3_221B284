class Beer {
    private void OpenBottle(){
        System.out.println("1st Open chilled beer");
    }
     private void Pour(){
        System.out.println("2nd Pour it in glass");
    }
     private void AddIce(){
        System.out.println("3rd Mix Ice with Beer");
    }
     private void Enjoy(){
        System.out.println("Enjoy it !!!");
    }
    
    public void Intrustions(){
        OpenBottle();
        Pour();
        AddIce();
        Enjoy();
        
    }
}

class DrinkBeer {
    public static void main(String[] args){
        Beer beer = new Beer();
        beer.Intrustions();
    }
}