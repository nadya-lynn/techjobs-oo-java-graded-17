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
        // Start with a blank line to separate from previous text (if any)

        String result = System.lineSeparator();
        // Append ID field label and value followed by a new line
        result += "ID: " + this.getId() + System.lineSeparator();
        // Append Name field label and value (or "Data not available" if empty) followed by a new line
        result += "Name: " + (this.getName().isEmpty() ? "Data not available" : this.getName()) + System.lineSeparator();
        // Append Employer field label and value (or "Data not available" if empty) followed by a new line
        result += "Employer: " + (this.getEmployer().getValue().isEmpty() ? "Data not available" : this.getEmployer().getValue()) + System.lineSeparator();
        // Append Location field label and value (or "Data not available" if empty) followed by a new line
        result += "Location: " + (this.getLocation().getValue().isEmpty() ? "Data not available" : this.getLocation().getValue()) + System.lineSeparator();
        // Append Position Type field label and value (or "Data not available" if empty) followed by a new line
        result += "Position Type: " + (this.getPositionType().getValue().isEmpty() ? "Data not available" : this.getPositionType().getValue()) + System.lineSeparator();
        // Append Core Competency field label and value (or "Data not available" if empty) followed by a new line
        result += "Core Competency: " + (this.getCoreCompetency().getValue().isEmpty() ? "Data not available" : this.getCoreCompetency().getValue()) + System.lineSeparator();
        // Add a blank line at the end to separate from following text (if any)
        // result += System.lineSeparator();
        return result;
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

