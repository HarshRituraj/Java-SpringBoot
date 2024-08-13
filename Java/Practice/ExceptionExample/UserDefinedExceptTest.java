

public class UserDefinedExceptTest {
   
    public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new UserDefinedExcept("This is user-defined exception");  
        }  
        catch (UserDefinedExcept e)  
        {   
            System.out.println(e.getMessage());  
        }  
    }  
}   

