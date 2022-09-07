/*
   project_1_policy class___
*/


public class Policy
{
   //fields to store relevant primary data
   private String pHolderFirstName;
   private String pHolderLastName;
   private String pHolderSmokingStatus;
   private int pHolderAge = 0;
   private double pHolderWeightInLb;
   private double pHolderHeightInInch;
   private String policyNum;
   private String providerName;
   
   //no-arg constructor
   public Policy()
   {
      pHolderAge = 0;
      pHolderWeightInLb = 0;
      pHolderHeightInInch = 0;
      pHolderFirstName = "John/Jane";
      pHolderLastName = "Doe";
      policyNum = "abcd1234";
      providerName = "Omnicorp";
      pHolderSmokingStatus = "";
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
   public Policy(String fName, String lName, String ss, int age,
                 double lb,double inch,String pNum, String pName)
   {
      pHolderFirstName = fName;
      pHolderLastName = lName;
      pHolderSmokingStatus = ss;
      pHolderAge = age;
      pHolderWeightInLb = lb;
      pHolderHeightInInch = inch;
      providerName = pName;
      policyNum = pNum;
      
   }
   /**
      this method calculates and returns BMI for policy holder
      @param lb policyholder weight in lb
      @param inch policyholder height in inch
      @return BMI
   */
   public double BMI(double lb, double inch)
   {
      return ( (lb * 703 ) / (inch * inch) );
   }
   /**
      this method calculates and returns the policy premium
      @param age policyholder age
      @param ss somking status
      @param lb policyholder weight in lb
      @param inch policyholder height in inch
      @return premium
   */
   public double premium(int age, String ss, double lb, double inch)
   {
      final double baseFees = 600;
      final double agePremium = 75;
      final double smokerPremium = 100;
      double BMI = (lb * 703 ) / (inch * inch);
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
      return pHolderFirstName;
   }
   public String getPolicyholderLastName()
   {
      return pHolderLastName;
   }
   public int getPolicyholderAge()
   {
      return pHolderAge;
   }
   public double getPolicyholderWeight()
   {
      return pHolderWeightInLb;
   }
   public double getPolicyholderHeight()
   {
      return pHolderHeightInInch;
   }
   public String getPolicyholderSmokingStatus()
   {
      return pHolderSmokingStatus;
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
     pHolderFirstName = fName;
   }
   public void setPolicyholderLastName(String lName)
   {
      pHolderLastName = lName;
   }
   public void setPolicyholderAge(int age)
   {
      pHolderAge = age;
   }
   public void setPolicyholderWeight(double weight)
   {
      pHolderWeightInLb = weight;
   }
   public void setPolicyholderHeight(double height)
   {
      pHolderHeightInInch = height;
   }
   public void setPolicyholderSmokingStatus(String ss)
   {
      pHolderSmokingStatus = ss;
   }
}