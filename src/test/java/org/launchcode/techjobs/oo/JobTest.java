package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.yaml.snakeyaml.events.Event;

import java.lang.reflect.InvocationTargetException;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job jobOne = new Job();
        Job jobTwo = new Job();
        assertNotEquals(jobOne.getId(), jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job instanceof Job);

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(jobOne, jobTwo);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected = System.lineSeparator() +
                "ID: " + jobOne.getId() + "\n"+
                "Name: " + jobOne.getName() + "\n" +
                "Employer: " + jobOne.getEmployer().getValue() + "\n" +
                "Location: " + jobOne.getLocation().getValue() + "\n" +
                "Position Type: " + jobOne.getPositionType().getValue() + "\n"+
                "Core Competency: " + jobOne.getCoreCompetency().getValue() +
                System.lineSeparator();

        System.out.println(jobOne.toString());

        assertEquals(jobOne.toString(), expected);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String actual = jobOne.toString();

        assertTrue(actual.contains("ID: " + jobOne.getId()));
        assertTrue(actual.contains("Name: Product tester"));
        assertTrue(actual.contains("Employer: ACME"));
        assertTrue(actual.contains("Location: Desert"));
        assertTrue(actual.contains("Position Type: Quality control"));
        assertTrue(actual.contains("Core Competency: Persistence"));

        System.out.println(jobOne.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {

     Job jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
               new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String expected = System.lineSeparator() +
                "ID: " + jobOne.getId() + "\n"+
                "Name: " + jobOne.getName() + "\n" +
                "Employer: " + jobOne.getEmployer().getValue() + "\n" +
                "Location: " + jobOne.getLocation().getValue() + "\n" +
                "Position Type: " + jobOne.getPositionType().getValue() + "\n"+
                "Core Competency: " + jobOne.getCoreCompetency().getValue() +
                System.lineSeparator();
        assertEquals(jobOne.toString(), expected);

        System.out.println(jobOne.toString());
    }

}





