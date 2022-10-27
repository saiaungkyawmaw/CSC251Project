/*
   project_1_policy class
*/


public class Policy
{
   //fields to store relevant primary data
   private String providerName;
   private String policyNum;
   private static int policyCount = 0;
   private PolicyHolder client;
   
   //no-arg constructor
   public Policy()
   {
      client = new PolicyHolder();
      policyNum = "123345678890";
      providerName = "Omnicorp";
      policyCount++;
   }
   /**
      plug-in constructor method
      @param pName provider name
   */
   public Policy(PolicyHolder obj, String pNum,String pName)
   {
      client = new PolicyHolder(obj);
      policyNum = pNum;
      providerName = pName; 
      policyCount++;
   }
   /**
      toString method
      @return provider name
   */
   public String toString()
   {
      String str = "Policy Number: " + policyNum
                + "\nProvider Name: " + providerName
                + "\n" + client.toString();
      return str;
   }
   /**
   get number of Policy objects created
   @return num of policy objects created
   */
   public int getCount()
   {
      return policyCount;
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
   this method returns the policy number
   @return policy number 
   */
   public String getPolicyNum()
   {
      return policyNum;
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
   this method sets the policy number
   @param pNum policy number 
   */
   public void setPolicyNum(String pNum)
   {
      policyNum = pNum;
   }
 }
 