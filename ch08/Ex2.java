/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {				
		 int i;
		 int[] num1 = new int[] {1,3,-1,6,4};	
		 int[] num2;		 
		 num2=num1;
		 System.out.print("一維整數陣列排序前的資料:");
		 for (i=0;i<5;i++)		  
			 System.out.print(num1[i]+" ");
		 System.out.println();
		 
		 Arrays.sort(num2);
		 System.out.println("有沒有注意到?陣列宣告並初始化在num1, 但是現在卻針對num2進行排序 !");
	 
		 System.out.print("一維整數陣列排序後的資料:");
		 for (i=0;i<5;i++)		  
			 System.out.print(num1[i]+" ");			     
		 
		 System.out.println("前面針對num2進行排序, 現在把num1印出來的結果是排序完成!");
		 System.out.println();
	}
}