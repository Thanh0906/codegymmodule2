package ss11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_demerging_sd_queue;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    private String name;
    private String gender;
    private LocalDate dateOfBirth;

    public Person() {

    }

    public Person(String name, String gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.getDateOfBirth().compareTo(o.getDateOfBirth());
    }


}
