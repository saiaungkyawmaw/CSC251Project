/*
   project_1_policy class
*/


public class PolicyHolder
{
   //fields to store relevant primary data
   private String firstName;
   private String lastName;
   private String ss; //smoking status
   private int age = 0;
   private double weight;
   private double height;
   
   //no-arg constructor
   public PolicyHolder()
   {
      age = 0;
      weight = 0;
      height = 0;
      firstName = "John/Jane";
      lastName = "Doe";
      ss = ""; //smoking status
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
   */
   public PolicyHolder(String fName, String lName, String SS, int age,
                 double lb,double inch)
   {
      firstName = fName;
      lastName = lName;
      ss = SS;
      age = age;
      weight = lb;
      height = inch;
   }
   /**
      copy constructor
      @param PolicyHolder object
   */
   public PolicyHolder(PolicyHolder obj)
   {
      this.firstName = obj.firstName;
      this.lastName = obj.lastName;
      this.ss = obj.ss;
      this.age = obj.age;
      this.weight = obj.weight;
      this.height = obj.height;
   }
   /**
      this method calculates and returns BMI for policy holder
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
      final double BASE_FEES = 600;
      final double AGE_PREMIUM = 75;
      final double SMOKER_PREMIUM = 100;
      double BMI = (weight * 703 ) / (height * height);
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
      toString method
      @return all fields data in string type 
   */
   public String toString()
   {  String bmi = String.format("%,.2f", this.BMI());
      String premium = String.format("%,.2f", this.premium());
      
      String str = "PolicyHolder's First Name: " + firstName
                + "\nPolicyHolder's Last Name: " + lastName
                + "\nPolicyHolder's Smoking Status: " + ss
                + "\nPolicyHolder's Height: " + height + " inches"
                + "\nPolicyHolder's Weight: " + weight + " pounds"
                + "\nPolicyHolder's BMI: " + bmi
                + "\nPolicyHolder's Premium: $" + premium;
                
      return str;         
   }
   /**
   this method returns the first name
   @return policy holder first name 
   */
   public String getPolicyholderFirstName()
   {
      return firstName;
   }
   /**
   this method returns policy holder last name
   @return policy holder last name
   */
   public String getPolicyholderLastName()
   {
      return lastName;
   }
   /**
   this method returns the age
   @return age 
   */
   public int getPolicyholderAge()
   {
      return age;
   }
   /**
   this method returns weight
   @return weight
   */
   public double getPolicyholderWeight()
   {
      return weight;
   }
   /**
   this method returns height
   @return height
   */
   public double getPolicyholderHeight()
   {
      return height;
   }
   /**
   this method returns smoking status
   @return smoking status
   */
   public String getPolicyholderSmokingStatus()
   {
      return ss;
   }
   /**
   this method sets the first name
   @param fName first name
   */
   public void setPolicyholderFirstName(String fName)
   {
     firstName = fName;
   }
   /**
   this method sets the last name
   @param lName last name
   */
   public void setPolicyholderLastName(String lName)
   {
      lastName = lName;
   }
   /**
   this method sets the age
   @param age policyholder age 
   */
   public void setPolicyholderAge(int age)
   {
      age = age;
   }
   /**
   this method sets the weight
   @param weight weight 
   */
   public void setPolicyholderWeight(double weight)
   {
      weight = weight;
   }
   /**
   this method sets the height
   @param height policyholder height
   */
   public void setPolicyholderHeight(double height)
   {
      height = height;
   }
   /**
   this method sets the smoking status
   @param ss smoking status 
   */
   public void setPolicyholderSmokingStatus(String ss)
   {
      ss = ss;
   }
}