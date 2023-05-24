package police.model.pojo;

public class User {
    private String id;
    private String name;
    private String tel;
    private String password;
    private String role;

    public User() {
    }

    public User(String id, String name, String tel, String password) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.password = password;
    }

    public User(String id, String name, String tel, String password, String role) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.password = password;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
