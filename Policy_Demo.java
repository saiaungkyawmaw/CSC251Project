/*
   policy class demo___
*/

import java.util.*; //scanner class to read input
import java.io.*;

public class Policy_Demo
{
   public static void main(String[] args)throws IOException
   {
      //variables to hold individual object info
      String firstName,lastName;
      String smokingStatus;
      int age = 0;
      double weight, height;
      String policyNum, providerName;
      //objet list
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      //input file name
      File file = new File("PolicyInformation.txt");
      //smokers count
      int smoker = 0;
      
      //Scanner object to read text
      Scanner inputFile = new Scanner(file);
      
      //read line and create objects
      while(inputFile.hasNextLine())
      {
         policyNum        = inputFile.next();
         providerName     = inputFile.next();
         firstName        = inputFile.next();
         lastName         = inputFile.next();
         age              = inputFile.nextInt();
         smokingStatus    = inputFile.next();
         height           = inputFile.nextDouble();
         weight           = inputFile.nextDouble();
         
         policyList.add(new Policy(firstName,lastName,smokingStatus,age,weight,height,providerName,policyNum));
         
         if (smokingStatus.equalsIgnoreCase("smoker"))  { smoker ++;}   
      }

      for (int i = 0; i < policyList.size(); i++)
      {
         Policy policy = policyList.get(i);
         printOut(policy);
      }
      
      System.out.printf("The number of policies with a smoker is: %d\n",smoker); 
      System.out.printf("The number of policies with a non-smoker is: %d\n", policyList.size() - smoker);  
   }
   /**
   this method prints out detail info from the the policyholder list
   and return the smokers count
   @param poicyholder list
   @return smokers count
   */
   public static void printOut(Policy obj)
   {

      System.out.printf("Policy Number: %s\n",obj.getPolicyNum());
      System.out.printf("Provider Name: %s\n",obj.getProviderName());
      System.out.printf("Policyholder's First Name: %s\n",obj.getPolicyholderFirstName());
      System.out.printf("Policyholder's Last Name: %s\n",obj.getPolicyholderLastName());
      System.out.printf("Policyholder's Age : %d\n",obj.getPolicyholderAge());
      System.out.printf("Policyholder's Smoking Status: %s\n",obj.getPolicyholderSmokingStatus());
      System.out.printf("Policyholder's Height: %,.2f inches\n",obj.getPolicyholderHeight());
      System.out.printf("Policyholder's Weight: %,.2f lb\n",obj.getPolicyholderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n",obj.BMI());
      System.out.printf("Policy Price: $%,.2f \n",obj.premium());

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