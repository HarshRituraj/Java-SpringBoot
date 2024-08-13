class StudentConstructor{

int id;
String name;
String gender;
int age;
long phone;
double gpa;
char degree;

boolean international;
double tutionFees = 12000.0;
double internationalFees = 5000.0;

StudentConstructor(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree)
{
    /*	id=newId;
	name=newName;
	gender=newGender;
	age=newAge;
	phone=newPhone;
	gpa=newGpa;
	degree=newDegree;

	compute();      */

	this(newId, newName, newGender, newAge, newPhone, newGpa, newDegree,false);


}

StudentConstructor(int newId, String newName, String newGender, int newAge, long newPhone, double newGpa, char newDegree,boolean newInternational)
{
	id=newId;
	name=newName;
	gender=newGender;
	age=newAge;
	phone=newPhone;
	gpa=newGpa;
	degree=newDegree;
	international =newInternational;
	compute();
}
StudentConstructor() //no argument constructor
{
compute();
}

void compute()
{
if(international)
tutionFees = tutionFees + internationalFees;
System.out.println("id: "+id);
System.out.println("Name: "+name);
System.out.println("Gender: "+gender);
System.out.println("Age: "+age);
System.out.println("phone: "+phone);
System.out.println("GPA: "+gpa);
System.out.println("Degree: "+degree);
System.out.println("TutionFees: "+tutionFees+"\n");
}

void updateName(String newName)
{
	this.name = newName;
}

public static void main(String[] args)
{
StudentConstructor student1 = new StudentConstructor(7,"HP","Male",99,1234456789,10,'P',true);
StudentConstructor student2 = new StudentConstructor(8,"PH","Male",99,1234456789,10,'P');
StudentConstructor student3 = new StudentConstructor();

student1.updateName("Rituraj");
student1.compute();

System.out.println(student1.name);
}
}