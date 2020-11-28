import java.util.*;
public class mlsa
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,k=0;
        n=sc.nextInt();
        k=sc.nextInt();
        System.out.println();
        String temp=sc.next();
        char str[]=new char[n];
        for(int i=0;i<n;i++)
        {
            str[i]=temp.charAt(i);
        }
        System.out.println();
        char ch[]=new char[k];
        for(int j=0;j<k;j++)
        {
            String t=sc.next();
            ch[j]=t.charAt(0);
            t="";
        }
        System.out.println();
        char arr[]=new char[n];
        int g=0;int count=0;
        int d=0;
        int x[]=new int[d];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ch[i]==str[j])
                {
                    arr[g]=ch[i];
                    count++;
                    g++;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<g;j++)
            {
                if(str[i]==arr[j])
                {
                    x[d]=i;
                    d++;
                    break;
                }
            }
        }
        for(int i=0;i<d;i++)
        {
            if(x[i]==x[i+1]-1)
            {
                count++;
            }
            if(x[i]==(x[i+1]-1)&&x[i]==(x[i+2]-2))
            {
                count++;
            }
            if(x[i]==(x[i+1]-1)&&x[i]==(x[i+2]-2)&&x[i]==(x[i+3]-3))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}