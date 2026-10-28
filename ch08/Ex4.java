/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Ex4 {
    public static void main(String[] args) {
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        String str3 = str1;

        System.out.printf("str1 identity hash: %x%n",
                System.identityHashCode(str1));
        System.out.printf("str2 identity hash: %x%n",
                System.identityHashCode(str2));
        System.out.printf("str3 identity hash: %x%n",
                System.identityHashCode(str3));
        
        System.out.println("上面你們看到的就是叫做:物件參照（Object Reference），但你也可以把他想成是物件 ID");

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
    }
}
