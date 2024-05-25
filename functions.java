import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class functions {
    //customers
    private String firstname;
    private String lastName;
    private String status;

    //date Format
    private DateTimeFormatter czDateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    //Statistics
    private Object [][] table;
    private final int ticketID = 11;
    private final int paymentID = 12;

    //Tickets
    private Double ticketPrice;
    private Integer maxTicketsPerDay;

}
