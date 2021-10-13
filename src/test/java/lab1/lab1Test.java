package lab1;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab1.lab1.Patient;
import lab1.lab1.Patient.Builder;
public class lab1Test {
    public static double EPS = 0.0000001;

    @Test
    public void testSetFirstNamePositive() {

        Patient s = new Patient.Builder().setFirstName("Damian").build();
        assertEquals(s.getFirstName(), "Damian");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testSetFirstNameNegative() {

        Builder builder = new Builder();
        builder.setFirstName("");
    }

    @Test(dataProvider = "equalsProvider")
    public void inputTest(Patient p1, Patient p2,boolean correct) {
        boolean answ=p1.equals(p2);
        assertEquals(answ, correct);
    }

    @DataProvider
    public Object[][] equalsProvider() {
        return new Object[][] {{new Patient("FName", "MName", "LName",30, "Group1", "A0"), new Patient("FName", "MName", "LName",30, "Group1", "A0"), true}};
    }
}