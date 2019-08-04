import java.util.Scanner;
public class duplicateCharacter
{
    public static void main(String[] args)
    {
        Scanner  sc=new Scanner(System.in);
        String s=sc.next();
        int[]  count=new int[32766];
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)]++;
            if(count[s.charAt(i)]>1) {
                c = 1;
                break;
            }

        }
        if(c==0)
            System.out.print("not duplicate character");
        else
            System.out.print("duplicate");
    }
}
