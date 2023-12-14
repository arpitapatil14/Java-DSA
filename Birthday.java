 import java.util.Scanner;

class Birthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate (in the format: day/month/year)");
        String date = sc.nextLine(); 
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        
        if (day == 14 && month == 9 && year == 2003) {
            System.out.println("Happy Birthday Arpita");
        } else if(day == 29 && month == 8 && year == 2003) {
            System.out.println("Happy Birthday Meet");
        }
        else if(day == 4 && month == 4 && year == 2003) {
            System.out.println("Happy Birthday Saakshi");
        }
        else if(day == 29 && month == 7 && year == 2001) {
            System.out.println("Happy Birthday Muskan");
        }
    }
}

