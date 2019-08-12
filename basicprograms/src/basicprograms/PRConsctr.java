package basicprograms;

class Constpr{
int i;int j;	

Constpr(int i,int j){
this.i=i;
j=j;

}
void add() {
	System.out.println(i);
	System.out.println(j);
}
}
public class PRConsctr {
	public static void main(String args[]) {
	Constpr c=new Constpr(2,4);	
    c.add();
	}

}
