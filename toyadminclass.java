import java.util.Scanner;

class Admin{
    private String email;
    private String password;
    private String name;
    
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPassword(String password){
        this.password=password;
    }
    
    public Admin(String email,String name,String password){
        this.email=email;
        this.name=name;
        this.password=password;
    }
    public Admin(){
        
        
    }
     public String toString(){
        return "Admin [email="+ email +", name="+ name +", password="+ password +"]";
    }
}

class Toy{
    
    private int toyId;
    private String toyName;
    private String toyType;
    private int minAge;
    private int maxAge;
    private int price;
    private int  quantity;
    private int rentalAmount;
    private int refundableDeposit;
    
    public int getToyId(){
        return toyId;
    }
     public void  setToyId(int toyId){
        this.toyId=toyId;
    }
     public String getToyName(){
        return toyName;
    }
     public void setToyName(String toyName){
        this.toyName=toyName;
    }
      public String getToyType(){
        return toyType;
    }
     public void setToyType(String toyType){
        this.toyType=toyType;
         
     }
    public int getMinAge(){
        return minAge;
    }
     public void setMinAge(int minAge){
        this.minAge=minAge;
    }
    public int getMaxAge(){
        return maxAge;
    }
     public void setMaxAge(int maxAge){
        this.maxAge=maxAge;
    }
     public int getPrice(){
        return price;
    }
     public void setPrice(int price){
        this.price=price;
    }
     public int getQuantity(){
        return quantity;
    }
     public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getRentalAmount(){
        return rentalAmount;
    }
     public void setRentalAmount(int rentalAmount){
        this.rentalAmount=rentalAmount;
    }
    public int getRefundableDeposit(){
        return refundableDeposit;
    }
     public void setRefundableDeposit(int refundableDeposit){
        this.refundableDeposit=refundableDeposit;
    }
    
    public Toy(int toyId,String toyName,String toyType,int minAge,int maxAge,int price, int  quantity,int rentalAmount,int refundableDeposit){
        this.toyId=toyId;  
        this.toyName=toyName;
        this.toyType=toyType;
        this.minAge=minAge;
        this.maxAge=maxAge;
        this.price=price;
        this.quantity=quantity;
        this.rentalAmount=rentalAmount;
        this.refundableDeposit=refundableDeposit;
    }
    public String toString(){
        return "Toy [toyId="+ toyId +", toyName=" + toyName +", toyType="+ toyType +", minAge="+ minAge +", maxAge="
        + maxAge +", price="+ price +", quantity="+ quantity +", rentalAmount="+ rentalAmount
         + ", refundableDeposit="+ refundableDeposit+ "]";
    }
    
    
    public Toy(){
        
    }
}

public class toyadminclass{
    
    
    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int toyId=scanner.nextInt();
        String toyName=scanner.nextLine();
        scanner.nextLine();
        String toyType=scanner.nextLine();
        int minAge=scanner.nextInt();
         int maxAge=scanner.nextInt();
         int price=scanner.nextInt();
        int quantity=scanner.nextInt();
         int rentalAmount=scanner.nextInt();
         int refundableDeposit=scanner.nextInt();
         Toy toy=new Toy(toyId,toyName,toyType,minAge,maxAge,price,quantity,rentalAmount,refundableDeposit);
        
        System.out.println(toy);
        
    }
}
/*
input

901
Car
Auto
2
7
450
50
100
250
*/








