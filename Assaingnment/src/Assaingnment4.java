
public class Assaingnment4 {
	// Write an algoritham to display age in years, months and days.
	// Note : Accept birth date and today's date in format mm, dd, and yyyy
	public static void main(String[] args) {
		int present_date = 22;
		int present_month = 11;
		int present_year = 2022;
		int birth_date = 26;
		int birth_month = 12;
		int birth_year = 1998;
		int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(birth_date > present_date) {
			present_date = present_date + month[birth_month - 1];
			present_month = present_month - 1;
		}
		else if(birth_month > present_month)
		{
			present_year = present_year - 1;
			present_month = present_month + 12;
		}

		int final_date = present_date - birth_date;
		int final_month = present_month - birth_month;
		int final_year = present_year - birth_year;

		System.out.print("The age is in date month year "+ final_date );
		System.out.print(" "+ final_month);
		System.out.print(" "+ final_year);

		}

	}


