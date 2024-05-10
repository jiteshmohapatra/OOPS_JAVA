class Account{


     char name;
	 char country;
	 int phoneno;
	 int emailid;
	 int principalamount;
}
	 
    class savingsac extends Account{
	
	public int displayinterest(){
	   int rate;
	   int res;
	   int time;
	   time = 5;
	   rate = 5;
	   res = principalamount * rate *time/100;
	   
	   return res;
	   
	  }
	  
	 }
	   
	   
	class currentac extends Account{
	
	
	public int displayoverdraft(){
	
	int overdraftp = 50;
	int output;
	
	output = principalamount * overdraftp /100;
	
	return output;
	
	
	}
	
	}
	   
	   
	   
	 class objoutput{
	 
	 
	 public static void main(String args[]){
	 
	 
	 int n1,n2,n3,n4,n5,n6;
	 
	 savingsac a1 = new savingsac();
	 
	 a1.principalamount = 50000;
	 
	 n1 = a1.displayinterest();
	 
	 System.out.println("The interest accured for 5years is "+ n1);
	 
	 
	 currentac a2 = new currentac();
	 a2.principalamount = 50000;
	 
	 n2 = a2.displayoverdraft();
	 
	 System.out.println("The 50% over draft is :"+ n2);
	 
	 
	 
	  savingsac b1 = new savingsac();
	 
	 b1.principalamount = 60000;
	 
	 n3 = b1.displayinterest();
	 
	 System.out.println("The interest accured for 5years is "+ n3);
	 
	 currentac b3 = new currentac();
	 b3.principalamount = 60000;
	 
	 n3 = b3.displayoverdraft();
	 
	 System.out.println("The 50% over draft is :"+ n3);
	 
	 
	 
	 
	 savingsac c1 = new savingsac();
	 
	 c1.principalamount = 70000;
	 
	 n5 = c1.displayinterest();
	 
	 System.out.println("The interest accured for 5years is "+ n5);
	 
	 currentac b4 = new currentac();
	 b4.principalamount = 60000;
	 
	 n6 = b4.displayoverdraft();
	 
	 System.out.println("The 50% over draft is :"+ n6);
	 
	 
	 
	 
	 }
	 
	 
	 
	 
	 
	 
	 }
	 
	 
	 
	 
	 
	 
	 