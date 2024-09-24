import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {

    Person p1, p2, p3, p4, p5;

    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "Jake", "Childs", 2000, "Mr.");
        p2 = new Person("00000A", "Anthony", "Hopkins", 1942, "Sir");
        p3 = new Person("00000B", "Mantis", "Toboggan", 1955, "Dr.");
        p4 = new Person("000004", "Saul", "Goodman", 1975, "Esq.");
        p5 = new Person("000005", "Sigourney", "Weaver", 1954, "Mrs.");

    }

    @Test
    void setIDseed() {
        Person.setIDseed(1);
        assertEquals(1, Person.getIDseed());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Bobby");
        assertEquals("Bobby", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p5.setLastName("Johnson");
        assertEquals("Johnson", p5.getLastName());
    }

    @Test
    void setYOB() {
        p3.setYOB(1980);
        assertEquals(1980, p3.getYOB());
    }

    @Test
    void setTitle() {
        p1.setTitle("Dr.");
        assertEquals("Dr.", p1.getTitle());
    }

    @Test
    void testToString() {
        assertEquals("Person{ID='000001', firstName='Jake', lastName='Childs', YOB=2000, title='Mr.'}", p1.toString());
    }

    @Test
    void fullName() {
        assertEquals("Saul Goodman", p4.FullName());
    }

    @Test
    void formalName() {
        assertEquals("Sir Anthony Hopkins", p2.FormalName());
    }

    @Test
    void getAge() {
        assertEquals("24", p1.getAge());
    }

    @Test
    void testGetAge() {
        assertEquals("3", p4.getAge(1978));
    }

    @Test
    void toCSV() {
        assertEquals("00000A,Anthony,Hopkins,Sir,1942", p2.toCSV());
    }

    @Test
    void toJSON() {

        assertEquals("{\"ID\":\"00000A\",\"firstName\":\"Anthony\",\"lastName\":\"Hopkins\",\"title\":\"Sir\",\"YOB\":\"1942\"}", p2.toJSON());
    }

    @Test
    void toXML() {
        assertEquals("<Person><ID>000004</ID><firstName>Saul</firstName><lastName>Goodman</lastName><title>Esq.</title><YOB>1975</YOB></Person>", p4.toXML());
    }

    @Test
    void setID() {
        p1.setID("000002");
        assertEquals("000002", p1.getID());
    }
}