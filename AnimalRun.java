public class AnimalRun{
/*
public void check(int x1, int y1, int x2, int y2){
      if(x1 == x2 && y1== y2){
          System.out.println("Nooooo Please do not eat me!!");
          System.out.println("Ahhrrrr I am eating you ha ha!");
      }else{
         System.out.println("go on...");
      }

}
*/

public static void main(String[] args){
      int x1, y1;
      int x2, y2;
      
      Animal rabbit = new Animal("rabbit");
      Animal snake = new Animal("snake");
      //AnimalRun animal = new AnimalRun();
      
      x1= 2;
      y1= 2;
      rabbit.move(x1,y1);
      rabbit.tellPosition();
      x2= 9;
      y2= 9;
      snake.move(x2,y2);
      snake.tellPosition();
      
      //animal.check(x1,y1, x2, y2);
      x1+=1;
      y1+=1;
      if(x1 == x2 && y1 == y2){
         System.out.println("Nooooo Please do not eat me!!");
         
         x2-=1;
         y2-=1;
         snake.move(x2,y2);
         snake.tellPosition();
         System.out.println("Ahhrrrr I am eating you ha ha!"); 
      }else{
         x2-=1;
         y2-=1;
         
      }
      
      rabbit.move(x1,y1);
      rabbit.tellPosition();
      snake.move(x2,y2);
      snake.tellPosition();
      
     // animal.check(x1,y1, x2, y2);
      x1+=1;
      y1+=1;
      if(x1 == x2 && y1 == y2){
         System.out.println("Nooooo Please do not eat me!!");
         
         x2-=1;
         y2-=1;
         snake.move(x2,y2);
         snake.tellPosition();
         System.out.println("Ahhrrrr I am eating you ha ha!"); 
      }else{
         x2-=1;
         y2-=1;
         
      }

      
      rabbit.move(x1,y1);
      rabbit.tellPosition();
      snake.move(x2,y2);
      snake.tellPosition();
      
      //animal.check(x1,y1, x2, y2);
      x1+=1;
      y1+=1;
      if(x1 == x2 && y1 == y2){
         System.out.println("Nooooo Please do not eat me!!");
         
         x2-=1;
         y2-=1;
         snake.move(x2,y2);
         snake.tellPosition();
         System.out.println("Ahhrrrr I am eating you ha ha!"); 
      }else{
         x2-=1;
         y2-=1;
         
      }

      
      rabbit.move(x1,y1);
      rabbit.tellPosition();
      snake.move(x2,y2);
      snake.tellPosition();
      
      //animal.check(x1,y1, x2, y2);
      x1+=1;
      y1+=1;
      if(x1 == x2 && y1 == y2){
         System.out.println("Nooooo Please do not eat me!!");
         
         x2-=1;
         y2-=1;
         snake.move(x2,y2);
         snake.tellPosition();
         System.out.println("Ahhrrrr I am eating you ha ha!"); 
      }else{
         x2-=1;
         y2-=1;
         
      }
      
   }

}