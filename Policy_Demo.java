/*
   policy class demo
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
      /**
      //file name input
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter the file name you want to read: ");
      File file = new File(keyboard.nextLine());
      */
      
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
         
         //clear non-white space char
         if (inputFile.hasNext()){
            inputFile.nextLine();
         }

         PolicyHolder client = new PolicyHolder(firstName,lastName,smokingStatus,age,weight,height);
         policyList.add(new Policy(client, policyNum, providerName));
         
         if (smokingStatus.equalsIgnoreCase("smoker"))
            smoker ++;
      }
      
      inputFile.close();
      
      //policy info print out loop
      for (Policy policy : policyList){
      
         System.out.println(policy);
         System.out.println();     
      }
      
      System.out.printf("There were %d policy object(s) created\n",policyList.get(0).getCount());
      System.out.printf("The number of policies with a smoker is: %d\n",smoker); 
      System.out.printf("The number of policies with a non-smoker is: %d\n", policyList.size() - smoker);  
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