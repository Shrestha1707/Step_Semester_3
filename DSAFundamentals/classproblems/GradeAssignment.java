public class GradeAssignment {
    static String grade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        for (int m : new int[]{72, 95, 35}) {
            System.out.println("Grade " + grade(m));
        }
    }
}