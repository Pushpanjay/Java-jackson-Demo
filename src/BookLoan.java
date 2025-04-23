import com.fasterxml.jackson.annotation.JsonProperty;

public class BookLoan {

    @JsonProperty("loan_id")
    public int loanId;

    @JsonProperty("borrower_name")
    public String borrowerName;

    @JsonProperty("book_title")
    public String bookTitle;

    @JsonProperty("due_date")
    public String dueDate;

    @Override
    public String toString() {
        return "BookLoan{" +
                "loanId=" + loanId +
                ", borrowerName='" + borrowerName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}
