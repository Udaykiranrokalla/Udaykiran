package rakeitg;
public class commcharacters
{
  public static void main(String[]args)
 {
	StringBuffer sb1=new StringBuffer("Rakesh ijwoS");
    StringBuffer sb2=new StringBuffer("Mahesh sowrya");
    for(int i=0;i<sb1.length();i++)
    {
    	for(int j=0;j<sb2.length();j++)
    	{
    		if(sb1.charAt(i)==sb2.charAt(j))
    		{
    			System.out.println(sb2.charAt(j));
    		}
    	}
    }
 }
}
