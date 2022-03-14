package emi_calculator;
import java.util.*;
//EMI class has general variables like gold price,principal,time which is
//parent class for all three IB,SBI,IOB banks
class EMI{
    public double gold_price_per_gram=4853;
    protected double principal;
    protected double years;
    EMI(){
        System.out.println("------------------------------------WELCOME TO INTEREST CALCULATOR------------------------------");
        System.out.println();
    }
}
//This indian bank inherits Emi class which has its own rate of
//interest for all loans it provides and has methods to calculate emi 
class IB extends EMI {
     //below are rate of interest for four loans in indian bank
     public double P_l= 9.20;
     public double E_l= 8.5;
     public double H_l= 7.55; 
     public double G_l= 5.88;
    //constructor initialzes user inputs
    IB(double principal,double years){
        this.principal=principal;
        this.years=years;
    }
   //it calculate emi for personal loan in indian bank 
   public double personal_loan ()
   {   //conevrt yearly interest to monthly interest
       P_l=P_l/(12*100);
       //convert time in years to months
       years=years*12;
       //general formula for calculate emi
       double emi= (principal*P_l*Math.pow(1+P_l,years))/(Math.pow(1+P_l,years)-1);
       return emi;
       
   }
   //it calculate emi for educational loan in indian bank
   public double educational_loan()
   { 
       E_l=E_l/(12*100); 
       years=years*12;      
       double emi= (principal*E_l*Math.pow(1+E_l,years))/(Math.pow(1+E_l,years)-1);
       return emi;
       
   }
   //it calculate emi for home loan in indian bank
   public double home_loan()
   {
       H_l=H_l/(12*100); 
       years=years*12;      
       double emi= (principal*H_l*Math.pow(1+H_l,years))/(Math.pow(1+H_l,years)-1);
       return emi;
   }
   //it calculate emi for gold loan loan in indian bank
   public double gold_loan()
   {   //calculate principal from given grams of gold
       //which is 75% of actual gold price 
       principal=(gold_price_per_gram*principal)*0.75; 
       G_l=G_l/(12*100); 
       years=years*12;   
       double emi= (principal*G_l*Math.pow(1+G_l,years))/(Math.pow(1+G_l,years)-1);
       return emi;      
   }
   
}

//This SBI bank inherits Emi class which has its own rate of
//interest for all loans it provides and has methods to calculate emi 
class SBI extends EMI {
     //below are rate of interest for four loans in  SBI
     public double P_l= 9.6;
     public double E_l= 10.25;
     public double H_l= 6.95; 
     public double G_l= 7.3;
    
    //constructor initialzes user inputs
    SBI(double principal,double years){
        this.principal=principal;
        this.years=years;
    }
    //it calculate emi for educational loan in State bank of india
   public double personal_loan ()
   {  
       P_l=P_l/(12*100); 
       years=years*12;      
       double emi= (principal*P_l*Math.pow(1+P_l,years))/(Math.pow(1+P_l,years)-1);
       return emi;
       
   }
   //it calculate emi for educational loan in State bank of india
   public double educational_loan()
   { 
       E_l=E_l/(12*100); 
       years=years*12;      
       double emi= (principal*E_l*Math.pow(1+E_l,years))/(Math.pow(1+E_l,years)-1);
       return emi;
       
   }
   //it calculate emi for educational loan in State bank of india
   public double home_loan()
   {
       H_l=H_l/(12*100); 
       years=years*12;      
       double emi= (principal*H_l*Math.pow(1+H_l,years))/(Math.pow(1+H_l,years)-1);
       return emi;
   }
   //it calculate emi for educational loan in State bank of india
   public double gold_loan()
   {   //calculate principal from given grams of gold
       //which is 75% of actual gold price 
       principal=(gold_price_per_gram*principal)*0.75; 
       G_l=G_l/(12*100); 
       years=years*12;   
       double emi= (principal*G_l*Math.pow(1+G_l,years))/(Math.pow(1+G_l,years)-1);
       return emi;      
   }
   
}

//This IOB bank inherits Emi class which has its own rate of
//interest for all loans it provides and has methods to calculate emi 
class IOB extends EMI {
     //below are rate of interest for four loans in  IOB
     public double P_l= 11.5;
     public double E_l= 10.4;
     public double H_l= 7.05; 
     public double G_l= 7;
    
     //constructor initialzes user inputs
    IOB(double principal,double years){
        this.principal=principal;
        this.years=years;
    }
   
    //it calculate emi for educational loan in Indian overseas bank
   public double personal_loan ()
   {  
       P_l=P_l/(12*100); 
       years=years*12;      
       double emi= (principal*P_l*Math.pow(1+P_l,years))/(Math.pow(1+P_l,years)-1);
       return emi;
       
   }
    //it calculate emi for educational loan in Indian overseas bank
   public double educational_loan()
   { 
       E_l=E_l/(12*100); 
       years=years*12;      
       double emi= (principal*E_l*Math.pow(1+E_l,years))/(Math.pow(1+E_l,years)-1);
       return emi;
       
   }
    //it calculate emi for educational loan in Indian overseas bank
   public double home_loan()
   {
       H_l=H_l/(12*100); 
       years=years*12;      
       double emi= (principal*H_l*Math.pow(1+H_l,years))/(Math.pow(1+H_l,years)-1);
       return emi;
   }
    //it calculate emi for educational loan in Indian overseas bank
   public double gold_loan()
   {   //calculate principal from given grams of gold
       //which is 75% of actual gold price 
       principal=(gold_price_per_gram*principal)*0.75; 
       G_l=G_l/(12*100); 
       years=years*12;   
       double emi= (principal*G_l*Math.pow(1+G_l,years))/(Math.pow(1+G_l,years)-1);
       return emi;      
   }
   
}


public class EMI_Calculator {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        //Parent class
        EMI welcome=new EMI();
        
        
        System.out.println("Choose a Bank to know loan details");
        System.out.println("Enter 1 for INDIAN BANK");
        System.out.println("Enter 2 for STATE BANK OF INDIA");
        System.out.println("Enter 3 for INDIAN OVERSEAS BANK");
        System.out.println();
        int a=s.nextInt();
        double principal=0,years=0,emi=0,r=0;
        int b;
        //Switch case for users to select respective bank
        switch(a)
        {case 1:  System.out.println("---------------------INDIAN BANK--------------------");
                  System.out.println("Choose type of loan you want to calculate");
                  System.out.println("Enter 1 for PERSONAL LOAN");
                  System.out.println("Enter 2 for EDUCATIONAL LOAN");
                  System.out.println("Enter 3 for HOME LOAN");
                  System.out.println("Enter 4 for GOLD LOAN");
                  System.out.println();
                  b=s.nextInt();
                  //Switch case to select respective loans for emi calculation in IB
                  switch(b){
                      case 1:System.out.println("---------------------PERSONAL LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble();
                             //Access Indian bank class 
                             IB obj1=new IB(principal,years);
                             //Calling personal loan function in IB class to get emi 
                             emi=obj1.personal_loan();
                             //Access rate of interest from indian bank
                             r=obj1.P_l;
                             break;
                      case 2:System.out.println("---------------------EDUCATIONAL LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble(); 
                             //Access Indian bank class 
                             IB obj2=new IB(principal,years);
                             //calling educational loan function in IB class to get emi 
                             emi=obj2.educational_loan(); 
                             //Access rate of interest from indian bank
                             r=obj2.E_l;
                             break;
                      case 3:System.out.println("---------------------HOME LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble();
                             //Access Indian bank class 
                             IB obj3=new IB(principal,years);
                             //Calling home loan function in IB class to get emi 
                             emi=obj3.home_loan();
                             //Access rate of interest from indian bank
                             r=obj3.H_l;
                             break;
                      case 4:System.out.println("---------------------GOLD LOAN--------------------");
                             //User input data
                             System.out.println("Enter gold in grams: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble();
                             //Access Indian bank class 
                             IB obj4=new IB(principal,years);
                             //Calling gold loan function in IB class to get emi 
                             emi=obj4.gold_loan();
                             //Convert gold in grams into principal amount
                             principal=(obj4.gold_price_per_gram*principal)*0.75; 
                             //Access rate of interest from indian bank
                             r=obj4.G_l;
                  }
                  break;
         case 2:  System.out.println("---------------------STATE BANK OF INDIA--------------------");
                  System.out.println("Choose type of loan you want to calculate");
                  System.out.println("Enter 1 for PERSONAL LOAN");
                  System.out.println("Enter 2 for EDUCATIONAL LOAN");
                  System.out.println("Enter 3 for HOME LOAN");
                  System.out.println("Enter 4 for GOLD LOAN");
                  System.out.println();
                  b=s.nextInt();
                  //Switch case to select respective loans for emi calculation in SBI
                  switch(b){
                      case 1:System.out.println("---------------------PERSONAL LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble();  
                             //Access State bank of india bank class 
                             SBI obj1=new SBI(principal,years);
                             //Calling personal loan function in SBI class to get emi
                             emi=obj1.personal_loan();
                             //Access rate of interest from state bank of india 
                             r=obj1.P_l;
                             break;
                      case 2:System.out.println("---------------------EDUCATIONAL LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             //Access State bank of india bank class 
                             years=s.nextDouble();                           
                             SBI obj2=new SBI(principal,years);
                             //Calling educational loan function in SBI class to get emi
                             emi=obj2.educational_loan(); 
                             //Access rate of interest from state bank of india 
                             r=obj2.E_l;
                             break;
                      case 3:System.out.println("---------------------HOME LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): ");
                             //Access State bank of india bank class 
                             years=s.nextDouble();                           
                             SBI obj3=new SBI(principal,years);
                             //Calling home loan function in SBI class to get emi
                             emi=obj3.home_loan();
                             //Access rate of interest from state bank of india
                             r=obj3.H_l;
                             break;
                      case 4:System.out.println("---------------------GOLD LOAN--------------------");
                             //User input data
                             System.out.println("Enter gold in grams: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble();                           
                             //Access State bank of india bank class 
                             SBI obj4=new SBI(principal,years);
                             //Calling gold loan function in SBI class to get emi
                             emi=obj4.gold_loan();
                             //Convert gold in grams into principal amount
                             principal=(obj4.gold_price_per_gram*principal)*0.75;
                             //Access rate of interest from state bank of india
                             r=obj4.G_l;
                  }
                  break;                 
         case 3:  System.out.println("---------------------INDIAN OVERSEAS BANK--------------------");
                  System.out.println("Choose type of loan you want to calculate");
                  System.out.println("Enter 1 for PERSONAL LOAN");
                  System.out.println("Enter 2 for EDUCATIONAL LOAN");
                  System.out.println("Enter 3 for HOME LOAN");
                  System.out.println("Enter 4 for GOLD LOAN");
                  System.out.println();
                  b=s.nextInt();
                  //switch case to select respective loans for emi calculation in IOB
                  switch(b){
                      case 1:System.out.println("---------------------PERSONAL LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble();  
                             //Access Indian overseas bank class 
                             IOB obj1=new IOB(principal,years);
                             //Calling personal loan function in IOB class to get emi
                             emi=obj1.personal_loan();
                             //Access rate of interest from indian overseas bank
                             r=obj1.P_l;
                             break;
                      case 2:System.out.println("---------------------EDUCATIONAL LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble();                           
                             //Access Indian overseas bank class 
                             IOB obj2=new IOB(principal,years);
                             //Calling educational loan function in IOB class to get emi
                             emi=obj2.educational_loan(); 
                             //Access rate of interest from indian overseas bank
                             r=obj2.E_l;
                             break;
                      case 3:System.out.println("---------------------HOME LOAN--------------------");
                             //User input data
                             System.out.println("Enter Principal amount: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble();   
                             //Access Indian overseas bank class
                             IOB obj3=new IOB(principal,years);
                             //Calling home loan function in IOB class to get emi
                             emi=obj3.home_loan();
                             //Access rate of interest from indian overseas bank
                             r=obj3.H_l;
                             break;
                      case 4:System.out.println("---------------------GOLD LOAN--------------------");
                             //User input data
                             System.out.println("Enter gold in grams: ");  
                             principal=s.nextDouble();
                             System.out.println("Enter Loan Tensure(in years): "); 
                             years=s.nextDouble(); 
                             //Access Indian overseas bank class
                             IOB obj4=new IOB(principal,years);
                             //Calling gold loan function in IOB class to get emi
                             emi=obj4.gold_loan();
                             //Convert gold in grams into principal amount
                             principal=(obj4.gold_price_per_gram*principal)*0.75; 
                             //Access rate of interest from indian overseas bank
                             r=obj4.G_l;
                  }
                  break;               
         default: System.out.println("Please choose among 1,2,3");
        }
        //Finally printing the calclated interest amount for user to be paid for the
        //loan amount with time in years
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("Principal amount is :"+principal+" rupees");
        System.out.println("Time is             :"+years+" years");
        System.out.println("Rate of interest is :"+(r*1200)+"%");
        System.out.println("Monthly EMI is      :"+emi+" rupees");
        System.out.println("----------------------------------------------------");
    }
    
}
