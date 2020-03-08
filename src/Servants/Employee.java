package Servants;

public class Employee {
    private String surname;
    private String name;
    private int age;
    private String sex;
    private String education;
    private String post;
    private String division;

    public Employee(String surname, String name, int age, String sex, String education, String post, String division) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.education = education;
        this.post = post;
        this.division = division;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getEducation() {
        return education;
    }

    public String getPost() {
        return post;
    }

    public String getDivision() {
        return division;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return String.format(  "|%15s\t| %15s\t| %8d\t| %3s\t| %13s\t| %13s\t| %10s\t|", surname, name, age, sex, education, post, division);
    }

}