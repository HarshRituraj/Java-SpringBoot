public class student1 {
    
    float roll;
    String name;
    String course;
    float m1;
    float m2;
    float m3;

    student1()
    {}

    student1(float roll, String name, String course, float m1, float m2, float m3)
    {
        this.roll = roll;
        this.name = name;
        this. course = course;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    float total()
    {
        return m1+m2+m3;
    }

    float average()
    {
        return total()/3;
    }


    String grade()
    {
        if(average() > 70)
        return "A";
        else if(average() <70 & average() >=60)
        return "B";
        else if(average() < 60 & average() >=50)
        return "C";
        else if(average() <50 & average() >=40)
        return "D";
        else
        return "Fail";
    }

    public static void main(String[] args)
    {
        student1 s1 = new student1(27,"Ritu","MCA",99,93,97);
        System.out.println("Average = "+s1.average());
        System.out.println("Grade = "+s1.grade());
        System.out.println("Total = "+s1.total());

    }
}
