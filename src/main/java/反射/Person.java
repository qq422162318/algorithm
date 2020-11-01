package 反射;

public class Person {
    private String username;
    private String sex;
    private int age;
    public Person(){}
    public Person(String username, String sex, int age) {
        this.username = username;
        this.sex = sex;
        this.age = age;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [username=" + username + ", sex=" + sex + ", age=" + age + "]";
    }

}

