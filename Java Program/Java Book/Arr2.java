//Total marks and percentage 
import java.io.*;
class Arr2
{
    public static void main(String args[]) throws IOException
    {
        //To accept data from keybord 
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        //ask how many Subject
        System.out.println("How many Subject ?");
        int n=Integer.parseInt(br.readLine());

        //create 1D array with size n
        int[] marks =new int[n];

        //To store elements into array
       for(int i=0; i<n; i++)
       {
        System.out.println("Enter marks:");
        marks[i]=Integer.parseInt(br.readLine());
       }

       //find the total marks
       int tot=0;
       for(int i=0;i<n;i++);
       //tot +=
       marks[i];
    }
}