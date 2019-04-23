package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

//import threesolid.IWorker;


public class ThreeSolidMain
{   
   public static BaseWorker tsBaseW = new BaseWorker();
   public static Manager tsManager = new Manager();
   public static ProjectManager tsProjManager = new ProjectManager();
   public static ProductManager tsProdManager = new ProductManager();
   public static Worker tsWorker = new Worker();
   public static SuperWorker tsSuperW = new SuperWorker();
   public static TempWorker tsTempW = new TempWorker();
   public static Robot tsRobot = new Robot();

   // The entry main() method
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }
	  
	  // call the base worker class and the method work()
	  try
	  {
		  System.out.format("Calling BaseWorker class. Method: work() \n");
		  tsBaseW.work();
		  System.out.format("\n");
	  }
	  catch (Exception main_except)
	  {
		  main_except.printStackTrace();
	  }
	  
	  // call the project manager class and the method schedulework()
	  try
	  {
		  System.out.format("Calling ProjectManager class. Method: schedulework() \n");
		  tsProjManager.schedulework();
		  System.out.format("\n");
	  }
	  catch (Exception main_except)
	  {
		  main_except.printStackTrace();
	  }
	  
	  // call the product manager class and the method defineproduct()
	  try
	  {
		  System.out.format("Calling ProductManager class. Method: defineproduct() \n");
		  tsProdManager.defineproduct();
		  System.out.format("\n");
	  }
	  catch (Exception main_except)
	  {
		  main_except.printStackTrace();
	  }
	  
	  // call the worker class and eat(), sick(), work() methods
	  try
	  {
		  System.out.format("Calling Worker class. Methods: eat(), sick(), work() \n");
		  tsWorker.eat();
		  tsWorker.sick();
		  tsWorker.work();
		  System.out.format("\n");
	  }
	  catch (Exception main_except)
	  {
		  main_except.printStackTrace();
	  }
	  
	  // call the super worker class and eat(), sick(), work() methods
	  try
	  {
		  System.out.format("Calling SuperWorker class. Methods: eat(), sick(), work() \n");
		  tsSuperW.eat();
		  tsSuperW.sick();
		  tsSuperW.work();
		  System.out.format("\n");
	  }
	  catch (Exception main_except)
	  {
		  main_except.printStackTrace();
	  }
	  
	  // call the temp worker class and eat(), sick(), work() methods
	  try
	  {
		  System.out.format("Calling TempWorker class. Methods: eat(), sick(), work() \n");
		  tsTempW.eat();
		  tsTempW.sick();
		  tsTempW.work();
		  System.out.format("\n");
	  }
	  catch (Exception main_except)
	  {
		  main_except.printStackTrace();
	  }
	  
	  // call the robot class and reboot() / work() methods
	  try
	  {
		  System.out.format("Calling Robot class. Methods: reboot(), work() \n");
		  tsRobot.reboot();
		  tsRobot.work();
		  System.out.format("\n");
	  }
	  catch (Exception main_except)
	  {
		  main_except.printStackTrace();
	  }
	  
	  // exit the program
      try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

      System.exit(0);

   }
 }