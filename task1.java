import java.util.*;
public class mlsa
{
  public static void main()
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    int div=y/x;
    int rem=y-(div*x);
    z=z+rem;
    if(z>=x)
    { 
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }
  }
}