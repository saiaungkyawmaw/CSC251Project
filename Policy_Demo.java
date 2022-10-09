/*
   policy class demo___
*/

import java.util.Scanner; //scanner class to read input

public class Policy_Demo
{
   public static void main(String[] args)
   {
      //variables to hold input
      String firstName,lastName;
      String smokingStatus;
      int age = 0;
      double weight, height;
      String policyNum, providerName;
      int smoker = 0;
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      File file = new File("PolicyInformation.txt");
      //Scanner object to read text
      Scanner inputFile = new Scanner(file);
      
      //read line and create objects
      while(inputFile.hasNextLine())
      {
         policyNum        = inputFile.next();
         providerName     = inputFile.next();
         firstName        = inputFile.next();
         lastName         = inputFile.next();
         age              = inputFile.int();
         smokingStatus    = inputFile.next();
         height           = inputFile.double();
         weight           = inputFile.double();
         
         policyList.add(new policy(firstName,lastName,somkingStatus,age,weight,height,providerName,policyNum));
      }
      
      smoker = printOut(policyList);
      
      System.out.printf("The number of policies with a smoker is: %d\n",smoker); 
      System.out.printf("The number of policies with a non-smoker is: %d\n", policyList.size() - smoker);  
   }
   /**
   this method prints out detail info from the the policyholder list
   and return the smokers count
   @param poicyholder list
   @return smokers count
   */
   public static int printOut(ArrayList<policy> pLst)
   {
      int smokerCount = 0;
      for (int i = 0; i < pLst.size() ; i++)
      {
         Policy policy = new pLst.get(i);
      //print out relevant statements
      System.out.printf("Policy Number: %s\n",policy.getPolicyNum());
      System.out.printf("Provider Name: %s\n",policy.getProviderName());
      System.out.printf("Policyholder's First Name: %s\n",policy.getPolicyholderFirstName());
      System.out.printf("Policyholder's Last Name: %s\n",policy.getPolicyholderLastName());
      System.out.printf("Policyholder's Age : %d\n",policy.getPolicyholderAge());
      System.out.printf("Policyholder's Smoking Status: %s\n",policy.getPolicyholderSmokingStatus());
      System.out.printf("Policyholder's Height: %,.2f inches\n",policy.getPolicyholderHeight());
      System.out.printf("Policyholder's Weight: %,.2f lb\n",policy.getPolicyholderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n",policy.BMI(pHolderWeight,pHolderHeight));
      System.out.printf("Policy Price: $%,.2f \n",policy.premium(pHolderAge, pHolderSmokingStatus, pHolderWeight, pHolderHeight));
         if (policy.getPolicyholderSmokingStatus.equalsIgnoreCase("Smoker")) 
         {
               smokerCount ++;     
         }   
      }
      return smokerCount;
   }
}

/**
input prompt
//get input from user
      //set policy number
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextLine();
      policy1.setPolicyNum(policyNum);
      System.out.println();
      
      //set provider name
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      policy1.setProviderName(providerName);
      System.out.println();
      
      //set policyholder's first name
      System.out.print("Please enter the Policyholder's First Name: ");
      pHolderFirstName = keyboard.nextLine();
      policy1.setPolicyholderFirstName(pHolderFirstName);
      System.out.println();
      
      //set policyholder's last name
      System.out.print("Please enter the Policyholder's Last Name: ");
      pHolderLastName = keyboard.nextLine();
      policy1.setPolicyholderLastName(pHolderLastName);
      System.out.println();
      
      //set policyholder's age 
      System.out.print("Please enter the Policyholder's Age: ");
      pHolderAge = keyboard.nextInt();
      policy1.setPolicyholderAge(pHolderAge);
      System.out.println();
      
      //buffer for next data entry
      keyboard.nextLine();
      
      //set policyholder's smoking status
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      pHolderSmokingStatus = keyboard.nextLine();
      policy1.setPolicyholderSmokingStatus(pHolderSmokingStatus);
      System.out.println(); 
      
      //set policyholder's height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      pHolderHeight = keyboard.nextDouble();
      policy1.setPolicyholderHeight(pHolderHeight);
      System.out.println();
      
      //set policyholder's weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      pHolderWeight = keyboard.nextDouble();
      policy1.setPolicyholderWeight(pHolderWeight);
      System.out.println();
*/