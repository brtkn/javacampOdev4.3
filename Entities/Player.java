package Entities;

import java.time.LocalDate;

public class Player {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private LocalDate birthOfDate;

    public Player(int i, String i̇rem, String coşkun, LocalDate of, String s){

    }

    public Player(int id, String firstName, String lastName,String nationalityId, LocalDate birthOfDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.birthOfDate = birthOfDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public LocalDate getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(LocalDate birthOfDate) {
        this.birthOfDate = birthOfDate;
    }
}
