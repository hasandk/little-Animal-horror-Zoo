public class Animal {

   String name;
   int x,y;
   

   public Animal(String name){
      this.name= name;
   }


   public void move(int x, int y){
      this.x= x;
      this.y= y;
      
   }
   
   
   public void tellPosition(){
      System.out.println("I Am the " + name + " and i am standing on square " + x + ", " + y);
   }

}