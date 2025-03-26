class Rum {
    private void pour(){
        System.out.println("1st pour some rum in the glass");
    }
     private void AddIce(){
        System.out.println("2nd Add some Ice cubes");
    }
     private void Mix(){
        System.out.println("3rd Mix Ice with Rum");
    }
     private void Serve(){
        System.out.println("4th Serve it with cinamon");
    }
    
    public void Intrustions(){
        pour();
        AddIce();
        Mix();
        Serve();
        
    }
}

class DrinkRum {
    public static void main(String[] args){
        Rum rum = new Rum();
        rum.Intrustions();
    }
}