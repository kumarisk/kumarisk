// class - collection of methods or colection of objects
public class Basic {

	// main method - set of action to perform
	public static void main(String[] args) {
		
		//creating object to studentinfo class and calling it's main method
		StudentInfo inf = new StudentInfo();
		inf.main(args);
		
		//creating object to onlineshoppiingsite object and calling it's main method
		OnlineShoppingSite site = new OnlineShoppingSite();
		site.main(args);

	}

	// method - set of action to perform
	public void dumyMethod() {

	}

}

// object  ----- objects are stored in heap memory(RAM > JVM > Heap memory)  =======>
//    =======> to reduce object memory we go for <<<<inheritance>>>>

// syntax -  (class name) (object name) = new (class name)();  ///new is keyword


// Example
// StudentDataBase

 class StudentInfo {
	 public void studentName() {
		 System.out.println("Nmae: Java");
	 }
	 public void studentsMarks() {
		 System.out.println("Marks: 78");
	 }
	 
	 public void studentList() {
		 System.out.println("Lists:classes,methods,objects..etc");
	 }
	 
	 public void studentAddress() {
		 System.out.println("Address: Program");
	 }
	 
	 public static void main(String[] args) {
		StudentInfo info = new StudentInfo();
		
		info.studentName();
		info.studentsMarks();
		info.studentList();
		info.studentAddress();
	}
	 
 }
 
 // Example
 // Ecommerce
 class OnlineShoppingSite{
	 
	 public void account() {
		 System.out.println("Account: account@gmail.com");
	 }
	 
	 public void catlog() {
		 System.out.println("Mobiles");
	 }
	 
	 public void wishList() {
		 System.out.println("My Wish List");
	 }
	 
	 public void orders() {
		 System.out.println("order placed");
	 }
	 
	 public static void main(String[] args) {
		
		 OnlineShoppingSite shopping = new OnlineShoppingSite();
		 
		 shopping.account();
		 shopping.catlog();
		 shopping.wishList();
		 shopping.orders();
		 
	}
	 
 }
 
 
 // Inheritance
 
 //types
 
 		//Types:
 			//1. Single Inheritance  =====> parent class --> child class using extends keyword
 			//2. Multilevel Inheritance ====> grand parent --> parent class --> child class
 			//3. Multiple Inheritances ====> parent class --> child class <-- parent class  ====>More than one parent class 
 					//parallely support into one child class but it won't suport in java because
 			//4. Hybrid Inheritance  ====> class A --> class B & C and B & C class --> class D
 			//5. Hierarchical Inheritance ====> One parent class and more than one child class

