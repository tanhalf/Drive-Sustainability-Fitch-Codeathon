import java.util.Scanner;
public class user {   
    private String name; // giving the users attributes to call to
     private String email;
     private String phoneNumber;
     private String Qrcode;
     private String refferalLink;
     private int amountReturned;
     private int RewardPoints;
     private int dicountpoints;
     private int redeemPoints;
    public user(String name, String email, String phoneNumber, String Qrcode, String refferalLink, int amountReturned, int RewardPoints, int dicountpoints, int redeemPoints) {
       this.name = name; // telling them the attribute of the object is equal to the ones in the paramater
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.Qrcode = Qrcode;
       this.refferalLink = refferalLink;
       this.amountReturned =amountReturned;
       this.RewardPoints = RewardPoints;
       this.redeemPoints= redeemPoints;
    }
    public String  getName(){
        return name;// getting back 
    }
    public String getEmail( ){
        return email;
    }
    public String getphoneNumber( ){
        return phoneNumber;
    }
    public String  getQrcode (){
        return Qrcode;
    } 
    public String  getrefferalLink (){
        return refferalLink;
    }
    public int  getamountReturned (){
        return amountReturned;
    }
    public int  getRewardPoints (){
        return RewardPoints;
    }  
    public int  getdicountpoints (){
        return dicountpoints;
    }
    public int  redeemPoints (){
        return redeemPoints;
    } 
public void addPoints(int RewardPoints){
       if (RewardPoints > 0){
           this.RewardPoints += RewardPoints;
           System.out.println(RewardPoints +"points added" + this.RewardPoints);
           }else{
           System.out.println("Points added need to be positive");
        }
   }
public void removePoints(int RewardPoints){
        if (RewardPoints > 0){
            if (this.RewardPoints>=0){
           this.RewardPoints -= RewardPoints;
           System.out.println(RewardPoints +"points removed" + this.RewardPoints);
           }else{
           System.out.println("Points removed need to be negative");
        }  
     }  
}
public void user(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("What is your name?");
    name =scanner.nextLine();
    System.out.print("What is your email?");
     email =scanner.nextLine();
    System.out.print("What is your phone number?");
     phoneNumber =scanner.nextLine();
    System.out.print("what is your Qrcode");
     Qrcode =scanner.nextLine();
}
}   

  