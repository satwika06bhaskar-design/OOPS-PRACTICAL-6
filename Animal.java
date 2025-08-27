package tutorial;
class animals{
  void animalseat(){
    System.out.println("animals eat");  
  }

  
}
class lion extends animals{
  void actions() {
    System.out.println("roars");
  }
}

public class Animal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
lion lions = new lion();
lions.animalseat();
lions.actions();
  }

}