/*
   programming exam-1
   BikeRental Class
*/

public class BikeRental
{
   private String ID;
   private String fName;
   private int age = 0;
   private double mileage = 0.0;
   /**
   no-arg constructor
   */
   public BikeRental()
   {
      ID = null;
      fName = null;
      age = 0;
      mileage = 0.0;
   }
   /**
   constructor with parameter
   @param id customer's ID
   @param fN customer's full name (first and last)
   @param a customer's age
   @param bM bike mileage
   */
   public BikeRental(String id, String fN, int a, double bM)
   {
      ID = id;
      fName = fN;
      age = a;
      mileage = bM;
   }
   /**
   this method returns the final bike rental fees
   @return total bike rental fees
   */
   public double getRentalPrice()
   {  //fees variable
      final double BASE_FEES = 2.5;
      //under 18
      final double TIER1 = 0.25;
      final double TIER2 = 0.2;
      //18 and over
      final double TIER3 = 0.4;
      final double TIER4= 0.35;
   
      //calculate fees based on age and mileage
      if (age < 18 && mileage <= 10)
      {
         return (BASE_FEES + (mileage * TIER1));
      }
      else if ( age < 18 && mileage > 10)
      {
         return (BASE_FEES + (mileage * TIER2));
      }
      else if ( age >= 18 && mileage <= 10)
      {
         return (BASE_FEES + (mileage * TIER3));
      }
      else
      {
         return (BASE_FEES + (mileage * TIER4));
      }
   }

   public String getID()
   {
      return ID;
   }
   /**
   this method returns full name
   @return fName
   */
   public String getFullName()
   {
      return fName;
   }
   /**
   this method returns age
   @return age
   */
   public int getAge()
   {
      return age;
   }
   /**
   this method returns bike mileage
   @return mileage
   */
   public double getMileage()
   {
      return mileage;
   }
   /**
   this method modifies id
   @param id customer's id
   */
   public void setID(String id)
   {
     ID = id;
   }
   /**
   this method modifies full name
   @param fN customer's full name
   */
   public void setFullName(String fN)
   {
      fName = fN;
   }
   /**
   this method modifies age
   @param a customer's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   /**
   this method modifies mileage
   @param m bike's mileage
   */
   public void setMileage(double m)
   {
      mileage = m;
   }
}