package basicprograms;

public class Mmx {
	public static void main(String args[]) {
		int col,row;
		
		int a[][]= { {1,2,3},
		             {4,5,6},
		             {7,8,9}};
		int b[][]= { {1,2,3},
				     {4,5,6},
				     {7,8,9}};
		row=a.length;
		col=a[0].length;
		int diff[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				diff[i][j]=a[i][j]*b[i][j];
			}
		
		}
		System.out.println("the sub matrix is");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(diff[i][j]+" ");
			}
		System.out.println();
		
		}
		
		
	}

}
