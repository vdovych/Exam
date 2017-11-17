public class Client {
    private String name;
    private int age;
    private boolean sex;
    private String gender;
    private String email;

    public Client(String name, int age, boolean sex, String gender, String email){
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.sex = sex;
        this.email = email;
    }
    public boolean isReal(){
        if(age<1 ||age>150)
            return false;
        if(!email.matches(("^[A-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$")))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
