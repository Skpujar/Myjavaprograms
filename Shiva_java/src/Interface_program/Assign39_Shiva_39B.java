package Interface_program;
// write a program for multiple level inheritance with 4 parents  using interface?
interface parent1 {

	void auth();

	void authentication();
}

interface parent2 {

	void usename();

	void password();
}

interface parent3 {

	void login();

	void profile();
}

interface parent4 {

	void profileupdetails();

	void logout();
}

public class Assign39_Shiva_39B implements parent1, parent2, parent3, parent4 // child class

{

	public static void main(String[] args) {

		Assign39_Shiva_39B a1 = new Assign39_Shiva_39B();
		a1.auth();
		a1.authentication();
		a1.usename();
		a1.password();
		a1.login();
		a1.profile();
		a1.profileupdetails();
		a1.logout();
	}

	public void auth() {

		System.out.println("verify if the user is author this system");
	}

	public void authentication() {
		System.out.println("verify user able to authenticate");

	}

	public void usename() {

		System.out.println("user should provide the username");

	}

	public void password() {
		System.out.println("user should provide the password ");
	}

	public void login() {

		System.out.println("login successfull ");
	}

	public void profile() {
		System.out.println("user able to  see profile ");
	}

	public void profileupdetails() {

		System.out.println("user able to  update profiledetails ");
	}

	public void logout() {
		System.out.println("logout sucessfull ");
	}

}
