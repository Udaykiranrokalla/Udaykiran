package sample;

import java.util.StringTokenizer;

public class token {
public static void main(String args[]) {
	StringTokenizer st=new StringTokenizer("syamu is a cute girl"," ");
	while(st.hasMoreTokens());
	System.out.println(st.nextToken());
}
}
