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
      final double BASE_FEES = 600;
      final double AGE_PREMIUM = 75;
      final double SMOKER_PREMIUM = 100;
      double BMI = (lb * 703 ) / (inch * inch);
      double bmiFees = (BMI - 35 ) * 20;
      double premium = 0;
      //policy holder over 35 BMI
      if ( BMI > 35)
         {
            if ( age > 50 && ss.equalsIgnoreCase("smoker")  )
               { premium = BASE_FEES + AGE_PREMIUM + SMOKER_PREMIUM + bmiFees; }
            else if ( age > 50 && ss.equalsIgnoreCase("non-smoker"))
               { premium = BASE_FEES + AGE_PREMIUM + bmiFees; }
            else if ( age <= 50 && ss.equalsIgnoreCase("smoker"))
               { premium = BASE_FEES + SMOKER_PREMIUM + bmiFees;} 
            else
               { premium = BASE_FEES + bmiFees; }
         }
       //policy holder under and equal to 35 BMI
       else
         {
           if ( age > 50 && ss.equalsIgnoreCase("smoker") )
               { premium = BASE_FEES + AGE_PREMIUM + SMOKER_PREMIUM ; }
           else if ( age > 50 && ss.equalsIgnoreCase("non-smoker"))
               { premium = BASE_FEES + AGE_PREMIUM ; }
           else if ( age <= 50 && ss.equalsIgnoreCase("smoker") )
               { premium = BASE_FEES + SMOKER_PREMIUM ; }
           else
               { premium = BASE_FEES ; }
 
          }  
         return premium;   
   }
   /**
   this method returns the policy number
   @return policy number 
   */
   public String getPolicyNum()
   {
      return policyNum;
   }
   /**
   this method returns the provider number
   @return provider number 
   */
   public String getProviderName()
   {
      return providerName;
   }
   /**
   this method returns the first name
   @return policy holder first name 
   */
   public String getPolicyholderFirstName()
   {
      return pHolderFirstName;
   }
   /**
   this method returns policy holder last name
   @return policy holder last name
   */
   public String getPolicyholderLastName()
   {
      return pHolderLastName;
   }
   /**
   this method returns the age
   @return age 
   */
   public int getPolicyholderAge()
   {
      return pHolderAge;
   }
   /**
   this method returns weight
   @return weight
   */
   public double getPolicyholderWeight()
   {
      return pHolderWeightInLb;
   }
   /**
   this method returns height
   @return height
   */
   public double getPolicyholderHeight()
   {
      return pHolderHeightInInch;
   }
   /**
   this method returns smoking status
   @return smoking status
   */
   public String getPolicyholderSmokingStatus()
   {
      return pHolderSmokingStatus;
   }
   
   /**
   this method sets the policy number
   @param pNum policy number 
   */
   public void setPolicyNum(String pNum)
   {
      policyNum = pNum;
   }
   /**
   this method sets the provider name
   @param proName provider name 
   */
   public void setProviderName(String proName)
   {
      providerName = proName;
   }
   /**
   this method sets the first name
   @param fName first name
   */
   public void setPolicyholderFirstName(String fName)
   {
     pHolderFirstName = fName;
   }
   /**
   this method sets the last name
   @param lName last name
   */
   public void setPolicyholderLastName(String lName)
   {
      pHolderLastName = lName;
   }
   /**
   this method sets the age
   @param age policyholder age 
   */
   public void setPolicyholderAge(int age)
   {
      pHolderAge = age;
   }
   /**
   this method sets the weight
   @param weight weight 
   */
   public void setPolicyholderWeight(double weight)
   {
      pHolderWeightInLb = weight;
   }
   /**
   this method sets the height
   @param height policyholder height
   */
   public void setPolicyholderHeight(double height)
   {
      pHolderHeightInInch = height;
   }
   /**
   this method sets the smoking status
   @param ss smoking status 
   */
   public void setPolicyholderSmokingStatus(String ss)
   {
      pHolderSmokingStatus = ss;
   }
}