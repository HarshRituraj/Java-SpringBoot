package hackerRank.Array;

import java.io.*;
import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myList = new ArrayList<ArrayList<Integer>>();
        
ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>();
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Number of rows: ");
        int sizeItems = scn.nextInt();
        
        for(int i=0; i<sizeItems; i++)
        {
        	System.out.println("Column size: ");
            int sizeitems = scn.nextInt();
            myList.add(new ArrayList<Integer>());
            for(int j = 0; j<sizeitems; j++)
            {
            	System.out.println(j+" element ");
                int val = scn.nextInt();
                myList.get(i).add(j,val);
            }
        }
        System.out.println("Number of queries:");
        int queryNos = scn.nextInt();
        int[][] arr = new int[queryNos][2];
        for(int i = 0; i<queryNos; i++)
        {
        	for(int j = 0; j<2; j++)
        	{
        		arr[i][j] = scn.nextInt()-1;
        	}   
        }
        System.out.println("Output");
        for(int i = 0; i<queryNos; i++)
        {
        	
        		
        		if(arr[i][0] < myList.size() )
        		{
        			
        			if(arr[i][1] < myList.get(arr[i][0]).size())
        				System.out.println(myList.get(arr[i][0]).get(arr[i][1]));
        			else
        				System.out.println("ERROR!");
        		}
        		
        }

    }
}
