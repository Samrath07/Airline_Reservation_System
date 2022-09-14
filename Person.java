import java.util.Arrays;
import java.util.Random;

public class Person {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;
    private String[] passport;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {

        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];

    }

    public Person(Person source){
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = source.passport;
    }
    
    public String getName() {

        return this.name;

    }
    
    public String getNationality() {

        return this.nationality;

    }
    
    public String getDateOfBirth() {

        return this.dateOfBirth;

    }
    
    public int getSeatNumber() {

        return this.seatNumber;

    }

    public String[] getPassport() {
        
        return Arrays.copyOf(this.passport,this.passport.length);


    }
    
    public void setName(String name) {

        this.name = name;

    }

    public void setNationality(String nationality) {

        this.nationality = nationality;

    }

    public void setDateOfBirth(String dateOfBirth) {

        this.dateOfBirth = dateOfBirth;

    }
    
    public void setSeatNumber(int seatNumber) {

        this.seatNumber = seatNumber;

    }

    public void setPassport() {
        
        this.passport = Arrays.copyOf(passport, passport.length);
    }
    
    public boolean applyPassport() {

        Random rd = new Random();
        return rd.nextBoolean();
        

    }
    
    public void chooseSeat() {
        double randomSeat = Math.random() * 10;
        this.seatNumber = (int) randomSeat + 1;
    }

    public String toString() {
        
        return "Name: " + this.name + "\n" + "Nationality: "
                + this.nationality + "\n" + "Date of birth: "
                + this.dateOfBirth + "\n" + "Seat Number: "
                + this.seatNumber + "\n" + "Passport: "
                + Arrays.toString(this.passport);
        
    }
}