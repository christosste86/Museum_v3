import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class functions {
    //customers
    private String firstname;
    private String lastName;
    private String status;

    //date Format
    private DateTimeFormatter czDateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    //Statistics
    private Object [][] table = new Object[13][365 - LocalDate.now().getDayOfYear()];
    private final int ticketID = 11;
    private final int paymentID = 12;
    private final int dateID = 0;

    //Tickets
    private Double ticketPrice;
    private Integer maxTicketsPerDay;

    public void setDatesToStatisticTable() {
        for (int i = 0; i < table[dateID].length; i++) {
            table[dateID][i] = LocalDate.now().plusDays(i);
        }
    }

    public void setRundomUsersToStatisticTable(){

    }

}
