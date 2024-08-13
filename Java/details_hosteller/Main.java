// package details_hosteller;
import java.util.*;

public class Main {

    public static Hosteller getHostellerDetails()
    {
        int id;
        String name;
        int deptId;
        String gender;
        String phone;
        String hostel;
        int room;

        Hosteller h1 = new Hosteller();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        id = scn.nextInt();
        h1.setStudentId(id);
        System.out.println("Student Name");
        name = scn.next();
        h1.setName(name);
        System.out.println("Department Id");
        deptId = scn.nextInt();
        h1.setDepartmentId(deptId);
        System.out.println("Gender");
        gender = scn.next();
        h1.setGender(gender);
        System.out.println("Phone Number");
        phone = scn.next();
        h1.setPhone(phone);
        System.out.println("Hostel Name");
        hostel = scn.next();
        h1.setHostelName(hostel);
        
        System.out.println("Room Number");
        room = scn.nextInt();
        System.out.println("Modify Room Number(Y/N)");
        String res = scn.next();
        if(res.equals("Y"))
        {
            System.out.println("New Room Number");
            room = scn.nextInt();
            h1.setRoomNumber(room);
        }
        else
        {
            h1.setRoomNumber(room);

        }

        System.out.println("Modify Phone Number(Y/N)");
        String res1 = scn.next();
        if(res1.equals("Y"))
        {
            System.out.println("New Phone Number");
            phone = scn.next();
            h1.setPhone(phone);
        } 

        return h1;
    }

    public static void main(String[] args)
    {
        Main m1 = new Main();
        Hosteller h1 = m1.getHostellerDetails();
        System.out.println("The student details");
        System.out.println(h1.getStudentId());
        System.out.println(h1.getStudentName());
        System.out.println(h1.getDepartmentId());
        System.out.println(h1.getGender());
        System.out.println(h1.getPhone());
        System.out.println(h1.getHostelName());
        System.out.println(h1.getRoomNumber());

    }
    
}
