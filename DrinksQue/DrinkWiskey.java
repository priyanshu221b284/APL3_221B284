class Wiskey {
    private void pour(){
        System.out.println("1st pour some Wiskey  in the glass");
    }
     private void AddCoke(){
        System.out.println("2nd Add some Coke");
    }
     private void Mix(){
        System.out.println("3rd Mix Ice with Wiskey");
    }
     private void Serve(){
        System.out.println("4th Serve it ");
    }
    
    public void Intrustions(){
        pour();
        AddCoke();
        Mix();
        Serve();
        
    }
}

class DrinkWiskey {
    public static void main(String[] args){
        Wiskey wiskey = new Wiskey();
        wiskey.Intrustions();
    }
}