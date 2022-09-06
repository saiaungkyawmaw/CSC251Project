/*
   project_1_policy class
*/


public class Policy_Sai_Maw
{
   //fields to store relevant primary data
   private String pHolderFirstName,pHolderLastName;
   private String pHolderSmokingStatus;
   private int pHolderAge = 0;
   private double pHolderWeightInLb; pHolderHeightInInch;
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
      pHolderSmokingStatus = "24/7";
   }
   /**
      parameter included constructor method
      @param fName policy holder first name
      @param lName policy holder last name
      @param ss    policy holder smoking status
      @param age   policy holder age
      @param lb    policy holder weight in lb
      @param inch  policy holder height in inch
      @param pNum  policy number
      @param pName provider name
   */
   public Policy_Sai_Maw(String fName, String lName, String ss, int age,
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
      double premium = 0;
      double BMI = (lb * 703 ) / (inch * inch);
      
      if ( age > 50 && ss && BMI > 35)
      {
         premium = baseFees + 75 + 100 + (( BMI – 35 ) * 20);
         return premium;
      }
      else if ( age < 50 && ss && BMI > 35)
      {
         premium = baseFees + 100 + (( BMI – 35 ) * 20);
      }

   
   }
      
   
}