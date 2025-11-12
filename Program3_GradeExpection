class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGrading {
    public static void main(String[] args) {
        try {
            int marks = 110;
            if (marks > 100) {
                throw new InvalidGradeException("Marks cannot exceed 100.");
            } else {
                System.out.println("Valid marks: " + marks);
            }
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
