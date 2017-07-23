/* here I'm taking four classes and one main method  in a single program
 * we can implement number of classes taking a main method and creating objects in the main method
 */
package Classes; //here I have created a package of classes 

 class ClassA {   //taking a class name of Class A
	  //taking a class name of ClassA
	   static void display() {      //initializing a method to display
		 int months = 12;            //showing that to print no. of months by taking integer type of data type 
		  System.out.println("no. of months in a year " +months); //and initialized the value
	   }
}
class ClassB{   //taking another subclass as ClassB and  printing something
	 static void display(){
		 int weeks = 4;
		 System.out.println("no. of weeks in a month "+weeks);
	 }
	 
}
class ClassC{             //here taking another class as CLassC and
	 static void display(){
		int days = 7;              //displaying something
		 System.out.println("no. of days in a week " +days);
	 }
}
public class ClassD {                         //here I'm taking main class as ClassD
public static void main(String[]args){        //and taking main method  
	   
	   System.out.println("display the  details ");          //trying to display the details 
	   
	 ClassA classa = new ClassA();         //here I'm creating the objects of 4 different classes
	  ClassB classb = new ClassB();
	  ClassC classc = new ClassC();
	  ClassD are =new ClassD();	
	  
	  ClassA.display();   //here I'm displaying the classes
	  ClassB.display();
	  ClassC.display(); 
	   
}


}
	


