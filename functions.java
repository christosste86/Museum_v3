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

    //Table with firstname and last names for randomize users
    String [][] randomNames = {
            {"Eliška", "Tereza", "Adéla", "Anna", "Natálie"},
            {"Jakub", "Jan", "Tomáš", "Adam", "Matyáš"},
            {"Novákova", "Svobodova", "Novotna", "Dvořákova", "Černa"},
            {"Novák", "Svoboda", "Novotný", "Dvořák", "Černý"}
    };

    //table with status names and offers
    private final int statusNameID = 0;
    private final int statusOfferID = 1;
    private Object [][] statuses= {
            {"Invalid", "Student", "Child", "Pensioner", "Normal"},
            { 70,         30,         80,       60,       0}};

    //create user
    public void randomUserAndStatus(){
        int maleFemaleFirstnameID = (int) (Math.random() * 1);
        int femaleFirstnameID = 0;
        int maleFirstnameID = 1;
        int femaleLastnameID = 2;
        int maleLastnameID = 3;
        firstname = randomNames[maleFemaleFirstnameID][(int) (Math.random() * randomNames[maleFemaleFirstnameID].length-1)];
        if (maleFemaleFirstnameID == femaleFirstnameID){
            lastName = randomNames[femaleLastnameID][(int) (Math.random()* randomNames[femaleLastnameID].length-1)];
        }if (maleFemaleFirstnameID == maleFirstnameID){
            lastName = randomNames[maleLastnameID][(int) (Math.random()* randomNames[maleLastnameID].length-1)];
        }
        status = statuses[statusNameID][(int) Math.random() * statuses[statusNameID].length].toString();
    }

}
