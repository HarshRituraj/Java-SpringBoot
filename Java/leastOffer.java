import java.util.*;
class leastOffer {

    static int k =0;
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int inputs=0;
        String rough;
        System.out.print("Enter number of inputs:");
        if(scn.hasNextInt())
        inputs = scn.nextInt();
        System.out.println(inputs);
        if(scn.hasNextLine())
        rough=scn.nextLine();

        String[] str = new String[inputs];
        for(int i=0; i<inputs; i++)
        {   
           
            System.out.println("Provide Input:");
            str[i] = scn.nextLine();
        }

        String[] arrayofstr= new String[(inputs)*3];
        String[] aux = new String[inputs*3];
        for(int i=0; i<inputs; i++)
        {
            arrayofstr = str[i].split(",",3);
          
                for(int z=0; z<3; z++)
                {
                    aux[k] =arrayofstr[z];
                    k++;
                }
                
            
        }

        // int flag = 0;
        // String maxString;
        float[] auxPercent = new float[inputs];

        int j=0;
        for(int i=1; i<aux.length;i+=3)
        {
            float a = Float.parseFloat(aux[i]);
            float b = Float.parseFloat(aux[i+1]);
            if( a > 0 && b >0)
            {
                auxPercent[j] = (a*b)/100;
                j++;
            }
           else
           {
            System.out.println("Invalid");
            System.exit(0);
           }
        }

        float minDisc = auxPercent[0];
        int minIndex = 0; 
        for(int i =0; i<auxPercent.length; i++)
        {
                if(minDisc > auxPercent[i])
                {
                    minDisc = auxPercent[i];
                    minIndex = i;
                }
            
        }


        int[] indexes = new int[inputs];
        int r =0;
        for(int i = 0; i<auxPercent.length; i++)
        {
            if(minDisc == auxPercent[i])
            {
                indexes[r] = i;
                r++;
            }
        }

        int looping = 0;
        int s=0;
        for(int i=0; i<aux.length; i=i+3)
        {
            
            if(looping == indexes[s])
            {
                System.out.println(aux[i]);
                s++;
            }

            looping++;
        }


    }
}
