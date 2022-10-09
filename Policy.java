/*
   project_1_policy class___
*/


public class Policy
{
   //fields to store relevant primary data
   private String firstName;
   private String lastName;
   private String ss;
   private int age = 0;
   private double weight;
   private double height;
   private String policyNum;
   private String providerName;
   
   //no-arg constructor
   public Policy()
   {
      age = 0;
      weight = 0;
      height = 0;
      firstName = "John/Jane";
      lastName = "Doe";
      policyNum = "abcd1234";
      providerName = "Omnicorp";
      ss = " ";
   }
   /**
      plug-in constructor method
      @param fName policy holder first name
      @param lName policy holder last name
      @param ss    policy holder smoking status
      @param age   policy holder age
      @param lb    policy holder weight in lb
      @param inch  policy holder height in inch
      @param pNum  policy number
      @param pName provider name
   */
   public Policy(String fName, String lName, String SS, int Age,
                 double lb,double inch,String pNum, String pName)
   {
      firstName = fName;
      lastName = lName;
      ss = SS;
      age = Age;
      weight = lb;
      height = inch;
      providerName = pName;
      policyNum = pNum;
      
   }
   /**
      this method calculates and returns BMI for policy holder
      @param lb policyholder weight in lb
      @param inch policyholder height in inch
      @return BMI
   */
   public double BMI()
   {
      return ( (weight * 703 ) / (height * height) );
   }
   /**
      this method calculates and returns the policy premium
      @param age policyholder age
      @param ss somking status
      @param lb policyholder weight in lb
      @param inch policyholder height in inch
      @return premium
   */
   public double premium()
   {
<<<<<<< Updated upstream
      final double baseFees = 600;
      final double agePremium = 75;
      final double smokerPremium = 100;
      double BMI = (lb * 703 ) / (inch * inch);
=======
      final double BASE_FEES = 600;
      final double AGE_PREMIUM = 75;
      final double SMOKER_PREMIUM = 100;
      double BMI = (weight * 703 ) / (height * height);
      double bmiFees = (BMI - 35 ) * 20;
>>>>>>> Stashed changes
      double premium = 0;
      //for policyholder < BMI - 35
      if ( BMI > 35)
         {  
            //for policy holder over the age of 50
            if ( age > 50 )
               {
                  //check if smoker or not
                  if ( ss.equalsIgnoreCase("smoker") )
                     { premium = baseFees + agePremium + smokerPremium + (( BMI - 35 ) * 20); }
                  else
                     { premium = baseFees + agePremium + (( BMI - 35 ) * 20); }
               }
             //for policyholder = or under the age of 50
             else 
               {
                  //check if smoker or not
                  if ( ss.equalsIgnoreCase("smoker") )
                     { premium = baseFees + smokerPremium + (( BMI - 35 ) * 20); }
                  else
                     { premium = baseFees + (( BMI - 35 ) * 20); }
 
               } 
         }
       //for policyholder = or > BMI - 35
       else
         {
           //for policyholder over the age of 50
           if ( age > 50 )
               {
                  //check if smoker or not
                  if ( ss.equalsIgnoreCase("smoker") )
                     { premium = baseFees + agePremium + smokerPremium ; }
                  else
                     { premium = baseFees + agePremium ; }
               }
             //for policyholder = or under the age of 50
             else 
               {
                  //check if smoker or not
                  if ( ss.equalsIgnoreCase("smoker") )
                     { premium = baseFees + smokerPremium ; }
                  else
                     { premium = baseFees ; }
 
               }  
         }
         
         return premium;   
   }
   /**
      accessor methods for class 
   */
   public String getPolicyNum()
   {
      return policyNum;
   }
   public String getProviderName()
   {
      return providerName;
   }
   public String getPolicyholderFirstName()
   {
      return firstName;
   }
   public String getPolicyholderLastName()
   {
      return lastName;
   }
   public int getPolicyholderAge()
   {
      return age;
   }
   public double getPolicyholderWeight()
   {
      return weight;
   }
   public double getPolicyholderHeight()
   {
      return height;
   }
   public String getPolicyholderSmokingStatus()
   {
      return ss;
   }
   
   /**
      mutator methods for class 
   */
   public void setPolicyNum(String pNum)
   {
      policyNum = pNum;
   }
   public void setProviderName(String proName)
   {
      providerName = proName;
   }
   public void setPolicyholderFirstName(String fName)
   {
     firstName = fName;
   }
   public void setPolicyholderLastName(String lName)
   {
      lastName = lName;
   }
   public void setPolicyholderAge(int age)
   {
      age = age;
   }
   public void setPolicyholderWeight(double weight)
   {
      weight = weight;
   }
   public void setPolicyholderHeight(double height)
   {
      height = height;
   }
   public void setPolicyholderSmokingStatus(String ss)
   {
      ss = ss;
   }
}