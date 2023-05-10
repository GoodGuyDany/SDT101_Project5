public class Person implements Comparable<Person>{ // Creating a class Person that implements the Comparable interface
    private int birthYear; // Initiating the birthYear private integer
    public Person(int birthYear) { // Creating a constructor for Person objects
        this.birthYear = birthYear;
    }
    public int getBirthYear() { // Creating a getter for birthYear variable
        return birthYear;
    }
    @Override
    public int compareTo(Person other) { // Implementing the compareTo method from the Comparable interface to compare the person.birthYear to other.birthYear
        return Integer.compare(this.birthYear, other.birthYear);
    }
}
