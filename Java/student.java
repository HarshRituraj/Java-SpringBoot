class Student{

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
System.out.println("TutionFees"+tutionFees+"\n");
}

public static void swap(Student students[], int index1, int index2)
{
	Student aux =students[index2];
	students[index2]=students[index1];
	students[index1]=aux;
}

public static void main(String[] args)
{
Student student1 = new Student();
student1.id = 1000;
student1.name ="Ritu";
student1.gender="Female";
student1.age=22;
student1.phone=98765;
student1.gpa=8.5;
student1.degree='B';
student1.international=false;
student1.compute();

Student student2 = new Student();
student2.id = 1001;
student2.name ="Raj";
student2.gender="Male";
student2.age=23;
student2.phone=887654;
student2.gpa=7.5;
student2.degree='C';
student2.international=false;
student2.compute();

Student student3 = new Student();
student3.id = 1002;
student3.name ="Harsh";
student3.gender="Male";
student3.age=24;
student3.phone=78765;
student3.gpa=9.5;
student3.degree='M';
student3.international=true;
student3.compute();

Student[]   students = {student1, student2, student3};

swap(students,0,2);
System.out.println("After swaping");

students[0].compute();
students[1].compute();
students[2].compute();
}
}