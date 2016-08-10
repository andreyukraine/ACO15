package week1.users;


public class Users {

    public String name;
    public int age;
    public double solary;
    public Company company;


    public Users(String name, int age, double solary, Company company) {
        this.name = name;
        this.age = age;
        this.solary = solary;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSolary() {
        return solary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSolary(double solary) {
        this.solary = solary;
    }
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
