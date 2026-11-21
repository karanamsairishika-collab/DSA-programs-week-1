import java.util.Scanner;
class MatrixReading
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	int r1=sc.nextInt(); // 3--n
	int c1=sc.nextInt(); // 3--n
	int[][] M1=new int[r1][c1];
	for(int i=0; i<r1; i++)//i=0
	for(int j=0; j<c1; j++)//j=0,1,2
	M1[i][j]=sc.nextInt();//9 times--n*n times n 2 
	int r2=sc.nextInt();
	int c2=sc.nextInt();
	int[][] M2=new int[r2][c2];
	for(int i=0; i<r2; i++)
	for(int j=0; j<c2; j++)
	M2[i][j]=sc.nextInt();
	int[][] c=new int[r2][c2];//output matrix
        if(r1==r2 && c1==c2)
        {
         for(int i=0; i<r1; i++)
	for(int j=0; j<c2; j++)
	 c[i][j] =M1[i][j]+M2[i][j];//-----no of times this will be executed  2*2===>n*n
	for(int i=0; i<r1; i++){
	for(int j=0; j<c2; j++)
	System.out.print(c[i][j] +" ");
	System.out.println();
        }
	}
	else
	System.out.println("Not possible");
}
}