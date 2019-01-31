import java.util.*;
import java.io.*;

public class Employees {
	static ArrayList<Buisness> employees = new ArrayList<>();

	public static void main(String[] arg) throws FileNotFoundException {
		ArrayList<String> Accounts = new ArrayList<>();
		ArrayList<String> Sales = new ArrayList<>();
		ArrayList<String> Marketing = new ArrayList<>();
		ArrayList<String> Delivery = new ArrayList<>();
		ArrayList<String> Management = new ArrayList<>();
		ArrayList<String> IT = new ArrayList<>();
		ArrayList<String> Support = new ArrayList<>();
		ArrayList<String> ProjectX = new ArrayList<>();
		ArrayList<String> ProjectY = new ArrayList<>();
		ArrayList<String> ProjectZ = new ArrayList<>();
		ArrayList<String> ProjectH = new ArrayList<>();
		ArrayList<String> ProjectK = new ArrayList<>();
		ArrayList<String> ProjectC = new ArrayList<>();
		ArrayList<String> ProjectB = new ArrayList<>();
		ArrayList<String> NoProject = new ArrayList<>();
		String id, name, DOB, SkillSetName, ProjectName;
		String choice = "Filler";
		Scanner userinput = new Scanner(System.in);
		Scanner input = new Scanner(new File("src/Employee.txt")).useDelimiter(";");
		while (input.hasNext()) {
			id = input.next();
			name = input.next();
			DOB = input.next();
			SkillSetName = input.next();
			if (SkillSetName.contains("Accounts")) {
				Accounts.add(name);
			}
			if (SkillSetName.contains("Sales")) {
				Sales.add(name);
			}
			if (SkillSetName.contains("Marketing")) {
				Marketing.add(name);
			}
			if (SkillSetName.contains("Delivery")) {
				Delivery.add(name);
			}
			if (SkillSetName.contains("Management")) {
				Management.add(name);
			}
			if (SkillSetName.contains("IT")) {
				IT.add(name);
			}
			if (SkillSetName.contains("Support")) {
				Support.add(name);
			}
			ProjectName = input.next();
			if (ProjectName.contains("ProjectX")) {
				ProjectX.add(name);
			}
			if (ProjectName.contains("ProjectY")) {
				ProjectY.add(name);
			}
			if (ProjectName.contains("ProjectZ")) {
				ProjectZ.add(name);
			}
			if (ProjectName.contains("ProjectC")) {
				ProjectC.add(name);
			}
			if (ProjectName.contains("ProjectB")) {
				ProjectB.add(name);
			}
			if (ProjectName.contains("ProjectH")) {
				ProjectH.add(name);
			}
			if (ProjectName.contains("ProjectK")) {
				ProjectK.add(name);
			}
			if (ProjectName.contains("NoProject")) {
				NoProject.add(name);
			}
			Buisness employee = new Buisness(id, name, DOB, SkillSetName, ProjectName);
			employees.add(employee);
		}
		// System.out.print(employees);
		while (!choice.equals("0")) {
			System.out.println("What do you want to do?");
			System.out.println("1. Get info on an employee");
			System.out.println("2. Number of people: SkillSets");
			System.out.println("3. Number of people: Projects");
			System.out.println("0. Quit the program");
			choice = userinput.nextLine();

			if (choice.equals("1")) {
				System.out.println();
				System.out.println("Who would you like to print? ");
				System.out.println("1. Steve Smith");
				System.out.println("2. Bob Jones");
				System.out.println("3. Peter John");
				System.out.println("4. John Adams");
				System.out.println("5. Adam Fourth");
				System.out.println("6. Sally Gouch");
				System.out.println("7. Sarah Obersach");
				System.out.println("8. Fred Flintsone");
				System.out.println("9. Susan Samuel");
				System.out.println("10. Ryan Knee");
				System.out.println("11. Tami Williams");
				choice = userinput.nextLine();
				System.out.println();

				if (choice.equals("1")) {
					getInfo(0);
				}
				if (choice.equals("2")) {
					getInfo(1);
				}
				if (choice.equals("3")) {
					getInfo(2);
				}
				if (choice.equals("4")) {
					getInfo(3);
				}
				if (choice.equals("5")) {
					getInfo(4);
				}
				if (choice.equals("6")) {
					getInfo(5);
				}
				if (choice.equals("7")) {
					getInfo(6);
				}
				if (choice.equals("8")) {
					getInfo(7);
				}
				if (choice.equals("9")) {
					getInfo(8);
				}
				if (choice.equals("10")) {
					getInfo(9);
				}
				if (choice.equals("11")) {
					getInfo(10);
				}
			} else if (choice.equals("2")) {
				System.out.println();
				System.out.println("Accounts: " + Accounts);
				System.out.println("Sales: " + Sales);
				System.out.println("Marketing: " + Marketing);
				System.out.println("Delivery: " + Delivery);
				System.out.println("Management: " + Management);
				System.out.println("IT: " + IT);
				System.out.println("Support: " + Support);
				System.out.println();
			} else if (choice.equals("3")) {
				System.out.println();
				System.out.println("ProjectB: " + ProjectB);
				System.out.println("ProjectC: " + ProjectC);
				System.out.println("ProjectH: " + ProjectH);
				System.out.println("ProjectK: " + ProjectK);
				System.out.println("ProjectX: " + ProjectX);
				System.out.println("ProjectY: " + ProjectY);
				System.out.println("ProjectZ: " + ProjectZ);
				System.out.println("No Project: " + NoProject);
				System.out.println();
			}
		}
	}

	public static void getInfo(int index) throws FileNotFoundException {
		for (int i = 0; i < employees.size(); i++) {
			if (i == index) {
				printInfo(employees.get(i).toString(), i);
				System.out.println();
			}
		}
	}

	public static void printInfo(String buisness, int i) throws FileNotFoundException {
		int count = 0;
		String scanned = "Hi";
		Scanner first = new Scanner(new File("src/Employee.txt"));
		while (first.hasNextLine()) {
			scanned = first.nextLine();
			count++;
			if (i == count - 1) {
				break;
			}
		}
		Scanner output = new Scanner(scanned).useDelimiter(";");
		System.out.println("ID: " + output.next());
		System.out.println("Name: " + output.next());
		System.out.println("DOB: " + output.next());
		System.out.println("Skills: " + output.next());
		System.out.println("Projects: " + output.next());
	}
}
