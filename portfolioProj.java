//option 1
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class portfolioProj {

	public static void main(String[] args) throws IOException {
		
		LinkedList<Student> list = new LinkedList<>();
		Scanner input = new Scanner(System.in);

		String user;
		
		/*
		 * This do while loop lets you add students as necessary
		 * By default, you must add at least 1 student
		 * a temporary student object  collects data
		 * at the end, the temp student is added to the list
		 * this loop will continue until the user does not input yes (y)
		 */
		
		do {
			Student temp = new Student();
			System.out.println("Student's name: ");
			temp.setName(input.nextLine());
			
			System.out.println("Student's address: ");
			temp.setAddress(input.nextLine());
			
			
			System.out.println("Student's GPA: ");
			temp.setGPA(input.nextDouble());
			
			input.nextLine(); //consume newline char
			
			list.add(temp);
			
			System.out.println("Add another student? y/n");
			user = input.nextLine();
			
			
		}while (user.toUpperCase().equals("Y"));
		
		
		
		Collections.sort(list); //sorts students by name
		
		//write contents to a text file
		File file = new File("portProject.txt");
		PrintWriter writer = new PrintWriter(new FileWriter(file));
		
		for(int i = 0; i < list.size(); i++) {
			writer.println("Student " +(i+1));
			writer.println(list.get(i).getName());
			writer.println(list.get(i).getAddress());
			writer.println("GPA: " +list.get(i).getGPA());
			writer.println();
			
		}//end for loop
		
		
		input.close();
		writer.close();
	}//end of main

}//end of class

class Student implements Comparable<Student> {
	
	private String name;
	private String address;
	private double GPA;
	
	public Student() {
		name=null;
		address=null;
		GPA=0;
	}
	
	public Student (String name, String address, double GPA) {
		this.name= name;
		this.address=address;
		this.GPA=GPA;
	}
	
	
	//setters and getters
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAddress (String address) {
		this.address=address;
	}
	public void setGPA (double GPA) {
		this.GPA=GPA;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	@Override
	public int compareTo(Student student) { //sorts students alphabetically
		return this.getName().compareTo(student.getName());
	}
	
	
}//end of student