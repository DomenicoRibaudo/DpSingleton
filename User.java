public class User {
    private String name;

    private Integer age;

    private static User instance;

    public User() {}


    // Metodo per ottenere l'unica istanza della classe User
    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void stampaInfo() {
        System.out.println("Nome : " + getName());
        System.out.println("Cognome : " + getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
