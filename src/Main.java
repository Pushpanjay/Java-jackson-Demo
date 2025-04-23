import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class LibraryMain {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Deserialize JSON to Java object
            String jsonInput = """
            {
                "loan_id": 501,
                "borrower_name": "Alex Carry",
                "book_title": "Introduction to Java",
                "due_date": "2025-05-01"
            }
            """;
            BookLoan loan = mapper.readValue(jsonInput, BookLoan.class);
            System.out.println("Deserialized BookLoan:\n" + loan);

            // Serialize Java object to JSON string
            BookLoan newLoan = new BookLoan();
            newLoan.loanId = 502;
            newLoan.borrowerName = "Ram Kapoor";
            newLoan.bookTitle = "Java Basics";
            newLoan.dueDate = "2025-06-01";

            String jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(newLoan);
            System.out.println("\nSerialized JSON:\n" + jsonOutput);

            // Serialize to file
            mapper.writeValue(new File("book_loan_output.json"), newLoan);
            System.out.println("\nWritten to file: book_loan_output.json");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
