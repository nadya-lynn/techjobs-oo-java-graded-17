package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;


    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

             // Need to add the 1st Constructor to initialize a unique id.
    public Job() {
        id = nextId;
        nextId++;          // Need to check if it's makes a difference if I leave a space between nextID  and ++;
        name = "";
        employer = new Employer("");
        location = new Location("");
        positionType = new PositionType("");
        coreCompetency = new CoreCompetency("");

    }

             // Adding a 2nd Constructor to initialize the other five fields.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

        if(getName().isEmpty()){
            name = "Data not available";
        };
        if(getEmployer().toString().isEmpty()){
            employer.setValue("Data not available");
        };
        if(getLocation().toString().isEmpty()){
            location.setValue("Data not available");
        };
        if(getPositionType().toString().isEmpty()){
            positionType.setValue("Data not available");
        }
        if(getCoreCompetency().toString().isEmpty()){
            coreCompetency.setValue("Data not available");
        }

        return System.lineSeparator() +
                "ID: " + id + "\n"+
                "Name: " + name + "\n" +
                "Employer: " + employer + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + positionType + "\n"+
                "Core Competency: " + coreCompetency +
                System.lineSeparator();
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        // Checking if the objects being compared are the same object
        if (this == o) return true;
        // Checking if the object that we compare is null or completely from a different class
        if (o == null || getClass() != o.getClass()) return false;
        // Converting an object of one type to another and comparing two objects
        Job job = (Job) o;
        // Compare the id of the current object with the id of the object being compared
        return id == job.id;
    }
                 // Added custom hashCode method.
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

