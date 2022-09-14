
public class Main{

    public static void main(String[] args) {
        
        Person[] people = new Person[] 
    {   new Person("Cleopatra", "Egypt", "69 BC", 1),
        new Person("Alexander the Great", "Macedon", "356 BC", 2),
        new Person("Julius Caesar", "Rome", "100 BC", 3),
        new Person("Hannibal", "Carthage", "247 BC", 4),
        new Person("Confucius", "China", "551 BC", 5),
        new Person("Pericles", "Greece", "429 BC", 6),
        new Person("Spartacus", "Thrace", "111 BC", 7),
        new Person("Marcus Aurelius", "Rome", "121 AD", 8),
        new Person("Leonidas", "Greece", "540 BC", 9),
        new Person("Sun Tzu", "China", "544 BC", 10),
        new Person("Hammurabi", "Babylon", "1750 BC", 10),
        };
        
        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            if (people[i].applyPassport() == true) {
                people[i].setPassport();
                airline.createReservation(people[i]);
            }
        }

        System.out.println("*************** RESERVATION COMPLETE! *************** \n");
        System.out.println(airline);



        // System.out.println(airline.getPerson(1) +"\n");
        // System.out.println(airline.getPerson(5) + "\n");
        // System.out.println(airline.getPerson(10) + "\n");

        
        // Person person_2 = new Person(person_1);
        // boolean applied = person_1.applyPassport();
        // if (applied) {

        //     person_1.setPassport(
        //             new String[] { person_1.getName(), person_1.getNationality(), person_1.getDateOfBirth() });

        //     System.out.println(person_1.toString());

        // }
        // else {
        //     System.out.println(person_1.toString());

        // }
        // System.out.println("Seat Number is available");
        // person_1.chooseSeat();


        // if (applied) {
        //     System.out.println("Congratulations! " + person_1.getName() + ". Your password was approved ");
        // }
        // else {
        //     System.out.println("We're sorry " + person_1.getName() + ".We cannot process your application");
        // }

        
        

    }
}