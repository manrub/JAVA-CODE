import java.util.Scanner;

public class stringPermutation
{
    public static void  permute(String s,int l,int r)
    {
        if(l==r)
        System.out.println(s);
        else
        {
            for(int i=l;i<=r;i++)
            {
                s=swap(s,l,i);
                permute(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }
    public static String swap(String s,int i,int j)
    {
        char[] temp=s.toCharArray();
        char t=temp[i];
        temp[i]=temp[j];
        temp[j]=t;
        return String.valueOf(temp);



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int l=0;
        int r=str.length();
        permute(str,0,r-1);
    }
}
