package projectjava;

public class Variables {
    int s_id,s_per,s_rank,s_m,s_p,s_c;
    String s_name;
    static String s_branch;
    void average()
    {
    	float avg;
    	avg=((this.s_m + this.s_p + this.s_c)/3);
    	System.out.println("averge of marks="+avg);
    	
    }
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Variables vr=new Variables();
        		
		vr.s_branch="cse";
		vr.initial(1,80,2,80,79,90);
		vr.average();
        
	}
	public void initial(int a,int b,int c,int d,int e,int f)
	{
	 
	 this.s_id=a;
	 this.s_p=b;
	 this.s_rank=c;
	 this.s_m=d;
	 this.s_p=e;
	 this.s_c=f;
	 
	}

}
