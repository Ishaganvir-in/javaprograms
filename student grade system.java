package finaljavaproject;
import java.util.Scanner;

class Details {
    public void data() {
        Scanner obj = new Scanner(System.in);

        
        int rollNo[] = {101, 102, 103, 104, 105};

        System.out.println("---- Student Marks Entry ----");
        System.out.print("Enter Roll Number: ");
        int inputRoll = obj.nextInt();

        boolean found = false; 

       
        for (int i = 0; i < rollNo.length; i++) {
            if (inputRoll == rollNo[i]) {
                found = true;

                
                System.out.println("Roll Number " + inputRoll + " Found!\n");

                System.out.print("Enter English Marks: ");
                int english = obj.nextInt();

                System.out.print("Enter Physics Marks: ");
                int physics = obj.nextInt();

                System.out.print("Enter Chemistry Marks: ");
                int chemistry = obj.nextInt();

                System.out.print("Enter Biology Marks: ");
                int biology = obj.nextInt();

                System.out.print("Enter Maths Marks: ");
                int maths = obj.nextInt();

                int sum = english + physics + chemistry + biology + maths;
                double average = sum / 5.0;

                System.out.println("\nTotal Marks = " + sum);
                System.out.println("Average Marks = " + average);

               
                if (average >= 90) {
                    System.out.println("Grade: A+");
                } else if (average >= 80) {
                    System.out.println("Grade: A");
                } else if (average >= 70) {
                    System.out.println("Grade: B");
                } else if (average >= 60) {
                    System.out.println("Grade: C");
                } else if (average >= 50) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: Fail");
                }

                System.out.println("----- Congratulations Student Roll No " + inputRoll + " -----");
                break; 
            }
        }

       
        if (!found) {
            System.out.println("Invalid Roll Number! Please try again.");
        }

        obj.close();
    }
}

public class program {
    public static void main(String[] args) {
        Details obj = new Details();
        obj.data();
    }
}
