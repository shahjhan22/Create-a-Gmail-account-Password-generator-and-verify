//project: Application of email
import java.util.Scanner;         //package for using scanner
class Shah{                              //creat class        
	private String firstName;        //variable creat or global variable
	private String email;
	private int defaultPasswordLength = 10;   //variable creat and set the value 10
	private String companySuffix = "manuu.edu.in";  
	private String password;
	
	//constructor to recive the first name 
	 public Shah(String firstName){
		 this.firstName = firstName; 
		 //call method asking  for the departement - return the departement
		 setDepartment();
		//call a method that returns a random password
		 password = randomPassword(defaultPasswordLength);
		//combine elements to generate email
		email = firstName.toLowerCase() + "@"  + companySuffix;
	 }
	//ask for the departement
	   String setDepartment(){  //method for ask departement
		System.out.println( " Department Codes:\n1. School of technology(101)\n2. School of science(102)\n3. School of social science(103)\n4. School of management(104)\n5. School of mass communication and journalism(105)\n6. School of education and training(106)\n7. School of language and linguictics(107) \n ENTER DEPARTMENT CODE[!!ONLY USE NUMBER]: ");
		Scanner in1 = new Scanner(System.in);  //scanner creat for object
		int depChoice = in1.nextInt();  //input
		if (depChoice == 101){
		return "School of technology";
		} 
		else if (depChoice ==102)
		{
			return "School of science";
		}
		else if (depChoice ==103)
		{
			return " School of social science";
		}
		else if (depChoice  == 104)
		{
			return "School of management";
		}
		else if(depChoice  == 105)
		{
			return "School of mass communication and journalism";
			
		}
		else if(depChoice  == 106) 
		{
			return " School of education and training";
			
		}
		else if (depChoice  == 107)
		{
			return " School of language and linguictics";
		}
		else
		{
			System.out.println("WRONG CHOICE!!!");
			System.exit(0);             //exit the system
		return "NO ENTRY";
		}
		
	}
	//generate a random password
	 String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
		char[] password = new char [length];
		for(int i=0;i<length;i++)
		{
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
			//display
	public String showInfo()
	{
		return "DISPLAY NAME: " + firstName  + "\nEMAIL: " + email + "\nPassword: " + password;
	}

public static void main(String[] args){     //main method 
    System.out.println(".......WELCOME\n MAULANA AZAD NATIONAL URDU UNIVERSITY......\n");  ////welcome part
	Scanner in1 = new Scanner(System.in);  
	int find;   ///local variable
	 int rept; 
    for(rept=1;rept==rept;rept++) //repting part also known as infinite loop
	{
		System.out.println("  TO CONTINUE PRESS'1'\n  EXIT THE SYSTEM TO PRESS ANY KEY[!!DO NOT USE KEY'1' AND ALPHABET]"); 
		find=in1.nextInt();
		switch(find)     //decision part or switch part
		{
			case 1:
	String creatName;
	System.out.print("ENTER YOUR ROLLNO/NAME:");
	creatName = in1.next();
Shah em4 = new Shah(creatName);           //object creat and also run constructor
System.out.println(em4.showInfo());         //display or showInfo method call and print 
System.out.print("\n");
break;                                  
default: System.out.println("EXIT THE SYSTEM");
        System.exit(0);             // exit  the system
		}
	}
System.out.println("THANK YOU\n @SHAHJHAN ALAM");

}
}