import java.util.Scanner;
class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of subjects");
        int subjects = sc.nextInt();
        int totalMarks=0;
        
        for(int i=1;i<=subjects;i++){
            System.out.println("Enter the marks obtained in subject "+i+" : ");
            int marks=sc.nextInt();
            totalMarks+=marks;
            
        }
        System.out.println("Total marks obtainer is: " + totalMarks);
        double percentage=(double) totalMarks/subjects;
        System.out.println("The average percentage obtained by student is :"+percentage);

        char grade;
        if(percentage>=90 && percentage < 100){
            grade='A';
        }
        else if(percentage>=80 && percentage < 90){
            grade='B';
        }
        else if(percentage>=70 && percentage < 80){
            grade='C';
        }
        else if(percentage>=60 && percentage < 70){
            grade='D';
        }
        else if(percentage>=50 && percentage < 60){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("The Grade is: "+ grade);
    }
}

