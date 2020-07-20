public class User implements Cloneable{
    private int id;
    private String name;
    private String city;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void viewDetails(){
        System.out.println(id+" - "+ name+" - "+city);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Test{
    public static void main(String[] args) {
        User user = new User(1,"Eshan","Nugegoda");
        user.viewDetails();

        try {
            User u1 = (User) user.clone();
            u1.viewDetails();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
