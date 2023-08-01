package kafka.restkafka.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/* ID : String (EX: 1234CSE2023) (No update allowed and this is the primary key)
Name: String (No update allowed)
DOB: LocalDateTime (No update allowed)
Branch: String
GPA: Float (Ex: 8.6) (Max should be 10 only)*/
@Document(collection = "students")
public class Student {
    @Id
    private String ID;
    private String Name;
    private LocalDateTime DOB;
    private String Branch;
    private Float GPA;

    public Student(String ID, String Name, LocalDateTime DOB, String Branch, Float GPA) {
        this.ID = ID;
        this.Name = Name;
        this.DOB = DOB;
        this.Branch = Branch;
        this.GPA = GPA;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public LocalDateTime getDOB() {
        return DOB;
    }

    public void setDOB(LocalDateTime DOB) {
        this.DOB = DOB;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        this.Branch = Branch;
    }

    public Float getGPA() {
        return GPA;
    }

    public void setGPA(Float GPA) {
        this.GPA = GPA;
    }
}