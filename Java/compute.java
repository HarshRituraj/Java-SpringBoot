class Student{
static int Computecount;
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
Computecount =Computecount+1; 
if(international)
tutionFees = tutionFees + internationalFees;
System.out.println("\nid: "+id);
System.out.println("Name: "+name);
System.out.println("Gender: "+gender);
System.out.println("Age: "+age);
System.out.println("phone: "+phone);
System.out.println("GPA: "+gpa);
System.out.println("Degree: "+degree);
System.out.println("TutionFees: "+tutionFees);
System.out.println("Computecount: "+Computecount);
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
student2.phone=88765;
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
}
}