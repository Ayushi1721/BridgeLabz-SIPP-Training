package Day1_programs;

	import java.util.*;
	public class ParkingLote {
	     public static void main(String[] args) {
	    	 Scanner sc = new Scanner(System.in);
	    	 int capacity = 5;
	         int occupied = 0;
	         int choice;
	         System.out.println();
	    	 System.out.println("Welcome to Smart Parking System");
	         while(true){
	        	 
	        	 System.out.println("The menu for parking system: ");
	        	 System.out.println("1. Park");
	        	 System.out.println("2. Exit");
	        	 System.out.println("3. Show Occupancy");
	        	 System.out.println("Enter choice 1, 2, or 3 : ");
	        	 choice = sc.nextInt();
	        	 
	        	 switch(choice) {
	        	     case 1: 
	        		     if (occupied < capacity) {
	                         occupied++;
	                         System.out.println("Vehicle parked. Slots occupied: " + occupied + "/" + capacity);
	                     } else {
	                         System.out.println("Parking lot is full!");
	                     } 
	                     break;
	        	     case 2:
	        	    	 if (occupied > 0) {
	                         occupied--;
	                         System.out.println("Vehicle exited. Slots occupied: " + occupied + "/" + capacity);
	                     } else {
	                         System.out.println("Parking lot is empty!");
	                     }
	                     break;
	        	     case 3:
	        	    	 System.out.println("Current occupancy: " + occupied + "/" + capacity);
	                     break;
	        	     default:
	        	    	 System.out.println("Invalid choice. please try again");
	        		 
	        	 }
	         
	             if (occupied == capacity) {
	                  System.out.println("Parking lot is now full. No more vehicles can be parked.");
	                  break;
	             }
	         }
	    	 
	     }
	}