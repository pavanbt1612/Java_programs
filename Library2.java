import java.util.Scanner;

abstract class LoginStudent{
	
	abstract void studentLogin();
	
}
abstract class LoginFaculty{
	
	abstract void facultyLogin(); 
	
}
//The scannecr key word it delcaled in below class is it can call and use in method 
class StudentPage extends  LoginStudent{


	void studentLogin(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Emain id");
		String email_id = sc.next();
		System.out.println("Eneter the password");
		String pass = sc.next();
	
	
	System.out.println("\nSuccssfully login");
	
	System.out.println("Eneter your deatailes\n");
	}
	
	void student(){	
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id card No:");
		int id = sc.nextInt();
		
		System.out.println("Enter Student name");
		String name = sc.next();
		
		
		
		System.out.println("Selct course:");
		System.out.println("1. MCA\n2. MBA\n3. M.Tech\n4. BBA\n5. BCA");
		System.out.println("Choice:");
		
		int choice = sc.nextInt();
		switch (choice){
			case 1:System.out.println("MCA");break;
			case 2:System.out.println("MBA");break;
			case 3:System.out.println("M.Tech");break;
			case 4:System.out.println("BBA");break;
			case 5:System.out.println("BCA");break;
		}
		
		
		System.out.print("How many books do you want? ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        String[] books = new String[n];
        System.out.println("Enter the book names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }
		System.out.print("Date of book taken (DDMMYYYY): ");
        int issueDate = sc.nextInt();

        System.out.print("Date of book return (DDMMYYYY): ");
        int returnDate = sc.nextInt();
		
		System.out.println("\n=================================");
        System.out.println("       STUDENT ISSUE SUMMARY     ");
        System.out.println("=================================");
        System.out.println("ID           : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Course       : " + choice);
        System.out.println("Books Issued : " + n);
		System.out.println("Book Names   : " + String.join(", ", books));
        System.out.println("Issue Date   : " + issueDate);
        System.out.println("Return Date  : " + returnDate);
        System.out.println("=================================");
	}
}
class FacultyPage extends LoginFaculty{
	void facultyLogin(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password and login");
		String pass1 = sc.next();
	}
	
	void faculty(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID Number:");
		int idNO = sc.nextInt();
		
		System.out.println("Enter Faculty name");
		String facultyName = sc.next();
		
		System.out.println("Selct Department");
		System.out.println("MCA\n2. MBA\n3. M.Tech\n4. BBA\n5. BCA");
		System.out.println("Choice:");
		
		int choice1 = sc.nextInt();
		switch (choice1){
			case 1:System.out.println("MCA");break;
		    case 2:System.out.println("MBA");break;
			case 3:System.out.println("M.Tech");break;
			case 4:System.out.println("BBA");break;
			case 5:System.out.println("BCA");break;
		}
		
		System.out.print("How many books are taken? ");
        int booksCount = sc.nextInt();
        sc.nextLine(); // Clear buffer

        String[] books = new String[booksCount];
        System.out.println("Enter the book names:");
        for (int i = 0; i < booksCount; i++) {
            System.out.print("Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }
		System.out.print("Date of book taken (DDMMYYYY): ");
        int issueDate = sc.nextInt();

        System.out.print("Date of book return (DDMMYYYY): ");
        int returnDate = sc.nextInt();
		
		System.out.println("\n=================================");
        System.out.println("       FACULTY ISSUE SUMMARY     ");
        System.out.println("=================================");
        System.out.println("ID           : " + idNO);
        System.out.println("Name         : " + facultyName);
        System.out.println("Department   : " + choice1);
        System.out.println("Books Issued : " + booksCount);
		System.out.println("Book Names   : " + String.join(", ", books));
        System.out.println("Issue Date   : " + issueDate);
        System.out.println("Return Date  : " + returnDate);
        System.out.println("=================================");
	}
}
public class Library2{
	public static void main(String[] args){
		StudentPage obj1 = new StudentPage();
		FacultyPage obj2 = new FacultyPage();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=================================");
        System.out.println("  LIBRARY MANAGEMENT SYSTEM     ");
        System.out.println("=================================");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Faculty");
        System.out.print("Select your choice (1 or 2): ");
		int chioce2 = sc.nextInt();
	
	
		switch(chioce2){
		case 1 : obj1.studentLogin();
		         obj1.student();break;
		case 2 : obj2.facultyLogin();
				  obj2.faculty();;break;
		default : System.out.println("Invalid Selection! Please restart.");
		}
	}
}

		
		
		
	
	