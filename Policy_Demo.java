/*
   policy class demo
*/

import java.util.*; 
import java.io.*;

public class Policy_Demo
{
   public static void main(String[] args)throws IOException
   {
      //variables to hold input
<<<<<<< Updated upstream
      String pHolderFirstName,pHolderLastName;
      String pHolderSmokingStatus;
      int pHolderAge = 0;
      double pHolderWeight, pHolderHeight;
      String policyNum, providerName;
      
      //Scanner object to read input
      Scanner keyboard = new Scanner(System.in);
      
      //get input from user
=======
      String firstName,lastName;
      String smokingStatus;
      int age = 0;
      double weight = 0.0; 
      double height = 0.0;
      String policyNum, providerName;
      //policy object list and file name
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      //smoker count
      int smoker = 0;
      /**
      //file name input
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the file name you want to read: ");
      File file = new File(keyboard.nextLine());
      */
      File file = new File("PolicyInformation.txt");
      //Scanner object to read text
      Scanner inputFile = new Scanner(file);
      
      //read line and create objects
      while(inputFile.hasNext())
      {
         policyNum        = inputFile.nextLine();
         providerName     = inputFile.nextLine();
         firstName        = inputFile.nextLine();
         lastName         = inputFile.nextLine();
         
         age              = Integer.parseInt(inputFile.nextLine());
         smokingStatus    = inputFile.nextLine();
         height           = Double.parseDouble(inputFile.nextLine());
         weight           = Double.parseDouble(inputFile.nextLine());
         if (inputFile.hasNext())
            inputFile.nextLine();

         policyList.add(new Policy(firstName,lastName,smokingStatus,age,weight,height,policyNum, providerName));
         
         if (smokingStatus.equalsIgnoreCase("smoker"))
            smoker ++;
      }
      
      inputFile.close();
      
      for (Policy policy : policyList)
         printOut(policy);
      
      
      
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
      //print out relevant statements
      System.out.printf("Policy Number: %s\n",obj.getPolicyNum());
      System.out.printf("Provider Name: %s\n",obj.getProviderName());
      System.out.printf("Policyholder's First Name: %s\n",obj.getPolicyholderFirstName());
      System.out.printf("Policyholder's Last Name: %s\n",obj.getPolicyholderLastName());
      System.out.printf("Policyholder's Age : %d\n",obj.getPolicyholderAge());
      System.out.printf("Policyholder's Smoking Status: %s\n",obj.getPolicyholderSmokingStatus());
      System.out.printf("Policyholder's Height: %,.2f inches\n",obj.getPolicyholderHeight());
      System.out.printf("Policyholder's Weight: %,.2f lb\n",obj.getPolicyholderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n",obj.BMI());
      System.out.printf("Policy Price: $%,.2f \n\n",obj.premium());
   }
}

/**
input prompt
//get input from user
>>>>>>> Stashed changes
      //set policy number
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextLine();
      System.out.println();
      
      //set provider name
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      System.out.println();
      
      //set policyholder's first name
      System.out.print("Please enter the Policyholder's First Name: ");
      pHolderFirstName = keyboard.nextLine();
      System.out.println();
      
      //set policyholder's last name
      System.out.print("Please enter the Policyholder's Last Name: ");
      pHolderLastName = keyboard.nextLine();
      System.out.println();
      
      //set policyholder's age 
      System.out.print("Please enter the Policyholder's Age: ");
      pHolderAge = keyboard.nextInt();
      System.out.println();
      
      //buffer for next data entry
      keyboard.nextLine();
      
      //set policyholder's smoking status
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      pHolderSmokingStatus = keyboard.nextLine();
      System.out.println(); 
      
      //set policyholder's height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      pHolderHeight = keyboard.nextDouble();
      System.out.println();
      
      //set policyholder's weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      pHolderWeight = keyboard.nextDouble();
      System.out.println();
      
      //policy object to store data
      Policy policy1 = new Policy(pHolderFirstName, pHolderLastName, pHolderSmokingStatus, pHolderAge, 
                                  pHolderWeight, pHolderHeight, policyNum, providerName);
      
      //print out relevant statements
      System.out.printf("Policy Number: %s\n",policy1.getPolicyNum());
      System.out.printf("Provider Name: %s\n",policy1.getProviderName());
      System.out.printf("Policyholder's First Name: %s\n",policy1.getPolicyholderFirstName());
      System.out.printf("Policyholder's Last Name: %s\n",policy1.getPolicyholderLastName());
      System.out.printf("Policyholder's Age : %d\n",policy1.getPolicyholderAge());
      System.out.printf("Policyholder's Smoking Status: %s\n",policy1.getPolicyholderSmokingStatus());
      System.out.printf("Policyholder's Height: %,.2f inches\n",policy1.getPolicyholderHeight());
      System.out.printf("Policyholder's Weight: %,.2f lb\n",policy1.getPolicyholderWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n",policy1.BMI(pHolderWeight,pHolderHeight));
      System.out.printf("Policy Price: $%,.2f \n",policy1.premium(pHolderAge, pHolderSmokingStatus, pHolderWeight, pHolderHeight));
      
   }
}