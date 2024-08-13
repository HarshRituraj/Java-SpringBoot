import java.lang.annotation.*;;
public class deprecatedTest {
@SuppressWarnings(value = "deprecation")

    public static void main(String[] args)
    {
        deprecated d1 = new deprecated();

        d1.nonDeprecatedFunction();
        d1.deprecatedFunction();
    }
    
}
