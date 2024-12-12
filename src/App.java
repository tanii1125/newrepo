import java.util.*;
public class App {
    String name,pass;
    void signIn(){
        Scanner sc=new Scanner(System.in);
        System.out.println("signIn page");
    String username=sc.nextLine();
        System.out.println("enter username: ");
      name=sc.nextLine();
     System.out.println("enter password: ");
      pass=sc.nextLine();
    
    }boolean login(String n,String p){
        if(name .equals(n)&& pass .equals(p)){
          return true;
        }else{
            return false;
        }
    }
   // public static void main(String[] args) {
     // App obj=new App();
   // obj.signIn();
    //Scanner sc=new Scanner(System.in);
    //System.out.println("login page");
   // System.out.println("enter login username: ");
   // String username=sc.nextLine();
   // System.out.println("enter login password: ");
   // String password=sc.nextLine();
   //  if(obj.login(username, password)){
    //  System.out.println("login succesful");
    // }else{
//System.out.println("invalid username or password");
  //   }
    }


