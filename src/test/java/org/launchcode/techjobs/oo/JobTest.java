package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.yaml.snakeyaml.events.Event;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {
        Job job = new Job();
        assertEquals(job.getId(), job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testJobsForEquality() {

    }

}





