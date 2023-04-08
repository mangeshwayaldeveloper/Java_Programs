package Exception;

import java.util.Scanner;

class Hrishi_Attendance extends Exception {
    public String getMessage() {
        return "hum Rahate Hai Sakti se";
    }
}

public class AttendLecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lecture format");
        String lecture = sc.nextLine();
        if (lecture.equals("b") || lecture.equals("combine")) {
            try {
                if (lecture.equals("combine")) {
                    System.out.println("Hrishi will attend lecture");
                } else if (lecture.equals("b")) {
                    System.out.println("yenar nhi(hum attendance ke liye nahi aate bhaii)...yenar it depend on mood");
                    throw new Hrishi_Attendance();
                } else {
                    throw new Hrishi_Attendance();
                }
            } catch (Exception e) {
                System.out.println(e);

            } finally {
                System.out.println("Mangesh will attend the lecture (Lecture kara re tyachya shivay nhi kalt");
                System.out.println("Arundhati-->> ganja ganja.... ");
                System.out.println("Java asel tr aloch...aata nighatoy");
                System.out.println("Hoy Karuyat lecture");
            }
        }else {
            System.out.println("Enter Correct Input(Khar Sanga re)");
        }
    }
}
