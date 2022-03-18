package javake;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter your time in secconds");
        int time = sc.nextInt();
        int years, hrs, mint, sec;
        years = time / 31622400;
        hrs = (time % 31622400) / 3600;
        mint = ((time % 31622400) % 3600) / 60;
        sec = (((time % 31622400) % 3600) % 60);

        System.out.println("your time is" + years + "years and" + hrs + "hours and" + mint +

                "minutes    and" + sec + "seconds");

    }

}
