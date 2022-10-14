import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudentTest {

    public static void main(){
        Student std = new Student("pippo","porco");
        Exam esame = new Exam("java",new GregorianCalendar(1999,02,12),26);
        Exam esame2 = new Exam("matematica",new GregorianCalendar(2000,02,12),26);
        Exam esame3 = new Exam("bestemmiatore",new GregorianCalendar(2001,04,12),26);
        std.registerExam(esame);
        std.registerExam(esame2);
        std.registerExam(esame3);

        Assert.assertEquals(26,std.computeAverageGrade(),0);

        /*
         * Creare lo studente (nome e cognome)
         * Creiamo x per quello studente gli esami (nomesame, data, voto)
         * prendere la media e fare l'assertequals.
         *  */
    }
}