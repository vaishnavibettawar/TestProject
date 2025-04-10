package exception;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String isEmail = "Admin123@gmail.com";
String isPass = "Admin123";


Scanner sc = new Scanner(System.in);

System.out.println("Enter the Email : ");
String email = sc.next();
System.out.println("Enter the Password: ");
String pass = sc.next();


if (isEmail.equals(email) && isPass.equals(pass)) {
	System.out.println("Credential matched");
}
else {
	try {
		throw new Exception("Credential Doesn't match");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	}

}
