
public class Students {
	
	
	public static void main(String[] args) {
		
		class Student {
			String name;
			String surname;
			String pesel;

			void EnterValueName(String enterName) {
				name = enterName;

			}

			void EnterValueSurname(String enterSurnama) {
				surname = enterSurnama;
			}

			void EnterValuePesel(String enterPesel) {
				pesel = enterPesel;
			}

		}
		class StundentOfUniversity extends Student {
			String nameOfUniversity;

			void EnterNameOFUniversity(String enterNameOFUniversity) {
				nameOfUniversity = enterNameOFUniversity;
			}
		}
		class StudentOfGroup extends StundentOfUniversity{
			String nameOfGroup;
			void EnterNameOFGrop(String EnterNameOFGrop) {
				nameOfGroup = EnterNameOFGrop;
			}
		}
		
		StudentOfGroup studentFirst= new StudentOfGroup();
		System.out.println("Enter the name of student:");
		byte [] value=new byte[300];
		String newValue;
		try {
			System.in.read(value);
			newValue=new String (value);
			newValue=newValue.trim();
			studentFirst.EnterValueName(newValue);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		System.out.println("Enter the surname of student:");
		try {
			System.in.read(value);
			newValue=new String (value);
			newValue=newValue.trim();
			studentFirst.EnterValueSurname(newValue);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		System.out.println("Enter the pesel of student:");
		try {
			System.in.read(value);
			newValue=new String (value);
			newValue=newValue.trim();
			studentFirst.EnterValuePesel(newValue);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		System.out.println("Enter the pesel of student:");
		try {
			System.in.read(value);
			newValue=new String (value);
			newValue=newValue.trim();
			studentFirst.EnterValuePesel(newValue);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		System.out.println("Enter the name of university:");
		try {
			System.in.read(value);
			newValue=new String (value);
			newValue=newValue.trim();
			studentFirst.EnterNameOFUniversity(newValue);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		System.out.println("Enter the name of group:");
		try {
			System.in.read(value);
			newValue=new String (value);
			newValue=newValue.trim();
			studentFirst.EnterNameOFGrop(newValue);
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		
	}

}



