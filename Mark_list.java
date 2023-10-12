package Marklist;
import java.util.Scanner;
public class Marklist {

	public static void main(String[] args) 
{
		int mark[][]=new int[4][3];
		int rollNo[]=new int[4];
		String names[]=new String[4];
		char result[]=new char[4];
		char grade[]=new char[4];
		int total[]=new int[4];
		float average[]=new float[4];
		
		int i,j;
		for(i=0;i<4;i++) 
		{
			
			System.out.println("Enter the Student Roll Number :");
			Scanner in = new Scanner(System.in);
			rollNo[i]=in.nextInt();
			
			System.out.println("Enter the Student Name :");
			names[i]=in.next();
			
			{System.out.println("Enter the Three Marks :");
			for(j=0;j<3;j++)
			{
			mark[i][j]=in.nextInt();
			}
			
			total[i]=mark[i][0]+mark[i][1]+mark[i][2];
			System.out.println("The Total is :"+total[i]);
			average[i]=total[i]/3;
		}
			
				
			if(average[i]>50) {
				result[i]='P';
			} else {
				result[i]='F';
			}
			
			if(average[i]>69) {
				grade[i]='A';
			}else if(average[i]>49) {
				grade[i]='B';
			}else if(average[i]<50) {
				grade[i]='C';
			}
			
	}
						
System.out.println("*****************************************************************************************************************************************************");
System.out.println("                                                  STUDENT MARKLIST                                                            ");
System.out.println("*****************************************************************************************************************************************************");
System.out.println("ROLL\t\tNAME\t\tMARK1\t\tMARK2\t\tMARK3\t\tTOTAL\t\tRESULT\t\tAverage\t\tGRADE\t\t");
System.out.println(""+rollNo[0]+"\t\t"+names[0]+"\t\t  "+mark[0][0]+"\t\t"+mark[0][1]+"\t\t"+mark[0][2]+"\t\t"+total[0]+"\t\t"+result[0]+"\t\t"+average[0]+"\t\t"+grade[0]); 
System.out.println(""+rollNo[1]+"\t\t"+names[1]+"\t\t  "+mark[1][0]+"\t\t"+mark[1][1]+"\t\t"+mark[1][2]+"\t\t"+total[1]+"\t\t"+result[1]+"\t\t"+average[1]+"\t\t"+grade[1]);
System.out.println(""+rollNo[2]+"\t\t"+names[2]+"\t\t  "+mark[2][0]+"\t\t"+mark[2][1]+"\t\t"+mark[2][2]+"\t\t"+total[2]+"\t\t"+result[2]+"\t\t"+average[2]+"\t\t"+grade[2]);
System.out.println(""+rollNo[3]+"\t\t"+names[3]+"\t\t  "+mark[3][0]+"\t\t"+mark[3][1]+"\t\t"+mark[3][2]+"\t\t"+total[3]+"\t\t"+result[3]+"\t\t"+average[3]+"\t\t"+grade[3]); 
}
}