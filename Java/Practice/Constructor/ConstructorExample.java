
public class ConstructorExample {
    
    public String name;
    public int id;

    ConstructorExample() //default constructor
    {}
    /* comment */
    ConstructorExample(String name, int id)  //parameterized constructor
    {
        this.name = name;
        this.id = id;
    }


    public static void main(String args[])
    {
        //default constructor will be called
        ConstructorExample c2 = new ConstructorExample();  
        // parmeterized constructor will be called
        ConstructorExample c1 = new ConstructorExample("Rituraj", 7); 

        System.out.println(c1.name);
        System.out.println(c1.id);

        System.out.println(c2.name);
        System.out.println(c2.id);
    }

}
