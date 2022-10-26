/*
   project_1_policy class
*/


public class Policy
{
   //fields to store relevant primary data
   private String providerName;
   private static int policyCount = 0;
   
   //no-arg constructor
   public Policy()
   {
      providerName = "Omnicorp";
      policyCount++;
   }
   /**
      plug-in constructor method
      @param pName provider name
   */
   public Policy(String pName)
   {
      providerName = pName; 
      policyCount++;
   }
   /**
      toString method
      @return provider name
   */
   public String toString()
   {
      String str = "Provider Name: " + providerName;
      return str;
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
   this method sets the provider name
   @param proName provider name 
   */
   public void setProviderName(String proName)
   {
      providerName = proName;
   }
 }
 