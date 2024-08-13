package ExceptionExample;

public class MultiCatch {  
  
        public static void main(String[] args) {  
              
               try{    
                    int a[]=new int[5];    
                    a[5]=30/0;    
                   }    
                   catch(ArithmeticException e)  
                      {  
                       System.out.println("Arithmetic Exception");  
                      }    
                   catch(ArrayIndexOutOfBoundsException e)  
                      {  
                       System.out.println("ArrayIndexOutOfBounds");  
                      }    
                   catch(Exception e)  
                      {  
                       System.out.println("Exception occurs");  
                      }             
                   System.out.println("Hello world");    
        }  
    }  

