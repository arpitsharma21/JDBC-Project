import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.StudentDao;
import com.student.manage.Student;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 for Adding Students");
			System.out.println("Press 2 for Deleting Students");
			System.out.println("Press 3 for Displaying Students");
			System.out.println("Press 4 for Exit");
//			readline() gives us string so we convert it into int
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//add student
				System.out.println("Enter User Name");
				String name = br.readLine();
				
				System.out.println("Enter User Phone");
				String phone = br.readLine();
				
				System.out.println("Enter User City");
				String city = br.readLine();
				
				//create database
				Student st = new Student(name,phone,city);
				boolean answer  = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Data is inserted ");
				}
				else {
					System.out.println("Something went wrong");
				}
				System.out.println(st);
				
			}
			else if(c == 2){
				//delete
				System.out.println("Enter student id to delete :");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Deleted.............");
				}
				else {
					System.out.println("Something went wrong.........");
				}
			}
			else if(c == 3) { 
				//display
				StudentDao.showAllStudents();
			}
			else if(c== 4){
				//exit
				
				break;
			}
			else {
				//wrong
			}
		}
		
		System.out.print("Thank you for using the app");
	}

}
