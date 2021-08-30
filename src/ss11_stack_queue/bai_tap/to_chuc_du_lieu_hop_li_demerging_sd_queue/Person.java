package ss11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li_demerging_sd_queue;

import java.time.LocalDate;

public class Person {
    private String name;
    private String gender;
    private LocalDate birthday;

    public Person(String name, String gender, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Person() {
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String toString(){
        return "Tên :" +name +" , giới tính :" + gender + ", ngày tháng năm sinh :" +birthday;
    }
}
