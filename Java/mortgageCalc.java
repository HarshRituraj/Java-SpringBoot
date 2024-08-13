import java.util.Scanner;
// import java.math.*;
public class mortgageCalc {
    
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        float principle;
        float rate;
        float time;
        double p;
        double mort;

        while(true)
        {
            System.out.print("Enter principle($1K - &1M): ");
            principle = scn.nextFloat();
            if(principle < 1000 || principle >1000000)
            {
                System.out.println("Enter a number between 1000 and 1000000");
                continue;
            }
            break;
        }

        while(true)
        {
            System.out.print("Enter rate in percent: ");
            rate = scn.nextFloat();

            if(rate <=0 || rate >30)
            {
                System.out.println("Enter a number between 0 and 30");
                continue;
            }
            break;
        }

        while(true)
        {
            System.out.print("Enter time in months: ");
            time = scn.nextFloat();

            if(time < 1 || time >30)
            {
                System.out.println("Enter a number between 1 and 30");
                continue;
            }
            break;
        }

            rate =rate/100;
            rate = rate/12;

            p = Math.pow(1+rate,time); 

            mort = (principle *rate*(p))/(p-1);

            System.out.println("Mortgage = "+mort);
            scn.close();
    }

}
