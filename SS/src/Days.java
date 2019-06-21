import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        int number_Of_Days = 0; 
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        System.out.print("Input a year: ");
        int year = input.nextInt();
        switch (month) {
            case 1:
                number_Of_Days = 31;
                break;
            case 2:
               
                if (year % 4 == 0)
                {
                    number_Of_Days = 29;
                } 
                else {
                    number_Of_Days = 28;
                }
                break;
            case 3:
                
                number_Of_Days = 31;
                break;
            case 4:
               
                number_Of_Days= 30;
                break;
            case 5:
              
                number_Of_Days= 31;
                break;
            case 6:
               
                number_Of_Days = 30;
                break;
            case 7:
               
                number_Of_Days= 31;
                break;
            case 8:
               
                number_Of_Days= 31;
                break;
            case 9:
              
                number_Of_Days= 30;
                break;
            case 10:
               
                number_Of_Days= 31;
            case 11:
               
                number_Of_Days = 30;
                break;
            case 12:
               
                number_Of_Days = 31;
        }
        System.out.print(month + " month " + year + " has " + number_Of_Days+ " days\n");
	}

}
