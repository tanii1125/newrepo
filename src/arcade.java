import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class arcade extends App{
    public static void arcadeB(){
     Scanner sc=new Scanner(System.in);
     System.out.println("welcome to arcade: ");
     System.out.println("press 3 for game stone,paper,scissor: ");
     System.out.println("press 4 for game 2: ");
     System.out.println("press 5 for game 3: ");
     int choice=sc.nextInt();
     int random = ThreadLocalRandom.current().nextInt(3);
    
     switch(choice){  //game selection
        case 3:
      System.out.println("starting game 1.... ");
       System.out.println("press 6 if you want to play the game");
      System.out.println("press 7 if you want to exit");
      int select=sc.nextInt();
       switch (select) { //options
     case 6:
     game(sc,random);
        break;
      case 7:
      System.out.println("exit");
      break;
        default:
        System.out.println("invalid");
        break;
    } break;
    case 4:
    System.out.println("starting game 2.... ");
    //second game's logic
    break;
    case 5:
    System.out.println("good byee see u again");
    break;
    default:
    System.out.println("invalid selection");
    break;
} 
}
        
    public static void game(Scanner sc,int random){
        System.out.println("you are in game");
           System.out.println("0 for stone");
           System.out.println("1 for paper");
           System.out.println("2 for scissor");
           int play=sc.nextInt();
           switch (play) {  //stone,paper,scissor
          case 0:
               if(random==0){
                   System.out.println("no one wins as you both choose "+random);
               }else if(random==1){
                   System.out.println("comp wins as he choose "+random);
               }else{
                   System.out.println("you won as comp choose "+random);
               }
               break;
          case 1:
               if(random==0){
                   System.out.println("you won as comp choose "+random);
               }else if(random==1){
                   System.out.println("no one wins as you both choose "+random);
               }else{
                   System.out.println("comp wins as he choose "+random);
               }
               break;
          case 2:
               if(random==0){
                  System.out.println("comp wins as he choose "+random);
               }else if(random==1){
                  System.out.println("you won as comp choose "+random);
               }else{
                  System.out.println("no one wins as you both choose "+random);
               }
               break;
               default:
               System.out.println("invalid selection");
           }
       } 
        
        
        
        
        
    
public static void main(String args[]){
    arcade obj=new arcade();
    obj.signIn();
    Scanner sc=new Scanner(System.in);
    System.out.println("login page");
    System.out.println("enter login username: ");
    String username=sc.nextLine();
    System.out.println("enter login password: ");
    String password=sc.nextLine();
     if(obj.login(username, password)){
      System.out.println("login succesful");
      obj.arcadeB();

     }else{
System.out.println("invalid username or password");
     }
}
}