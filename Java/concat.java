import java.util.*;
class  concat {

    static boolean alphabetChecker(String str)
    {
        String regex = "^[a-zA-Z ]*$";
        if(str != null && (str.matches(regex)))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        String cName;
        String fName;

        Scanner scn = new Scanner(System.in);
        cName = scn.nextLine();
        fName = scn.nextLine();

        
        // System.out.println(aux1);
        if(alphabetChecker(fName) && alphabetChecker(cName))
        System.out.println((cName.concat(" "+fName)).toUpperCase());
        else
        System.out.println("Invalid Input");
    }
}
