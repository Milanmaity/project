import java.io.IOException;
import java.util.*;
public class Main {
    
    public static void main(String args[]) throws IOException {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Integer[] a=new Integer[n];
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
	}

System.out.println(UserMainCode.addUnique(a));

  s.close();
    	
    }
    
}


