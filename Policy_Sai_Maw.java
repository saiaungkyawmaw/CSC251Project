/*
   project_1_policy class
*/


public class Policy_Sai_Maw
{
   //fields to store relevant primary data
   private String pHolderFirstName,pHolderLastName;
   private char pHolderSmokingStatus;
   private int pHolderAge = 0;
   private double pHolderWeightInLb, pHolderHeightInInch;
   private String policyNum, providerName;
   
   //no-arg constructor
   public Policy_Sai_Maw()
   {
      pHolderAge = 0;
      pHolderWeightInLb = 0;
      pHolderHeightInInch = 0;
      pHolderFirstName = "John/Jane";
      pHolderLastName = "Doe";
      policyNum = "abcd1234";
      providerName = "Omnicorp";
      pHolderSmokingStatus = 'y';
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
   public Policy_Sai_Maw(String fName, String lName, char ss, int age,
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
   public double premium(int age, char ss, double lb, double inch)
   {
      final double baseFees = 600;
      final double agePremium = 75;
      final double smokerPremium = 100;
      double BMI = (lb * 703 ) / (inch * inch);
      double premium = 0;
      
      if ( BMI > 35)
         {
            if ( age > 50 )
               {
                  if ( ss == 'y' )
                     { premium = baseFees + agePremium + smokerPremium + (( BMI - 35 ) * 20); }
                  else
                     { premium = baseFees + agePremium + (( BMI - 35 ) * 20); }
               }
             else 
               {
                  if ( ss == 'y' )
                     { premium = baseFees + smokerPremium + (( BMI - 35 ) * 20); }
                  else
                     { premium = baseFees + (( BMI - 35 ) * 20); }
 
               } 
         }
       else
         {
           if ( age > 50 )
               {
                  if ( ss == 'y' )
                     { premium = baseFees + agePremium + smokerPremium ; }
                  else
                     { premium = baseFees + agePremium ; }
               }
             else 
               {
                  if ( ss == 'y' )
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
   public char getPolicyholderSmokingStatus()
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
   public void setPolicyholderSmokingStatus(char ss)
   {
      pHolderSmokingStatus = ss;
   }
}