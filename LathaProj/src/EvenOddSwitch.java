
public class EvenOddSwitch {
public static void main(String args[]) {
	int sum=0,odd=0;
	for(int i=1;i<=10;i++) {
		switch(i%2) {
		case 0:
			   sum=sum+i;
			   break;
		case 1:
			   odd=odd+i;
		}
	}System.out.println(sum);
		System.out.println(odd);
	}
}

