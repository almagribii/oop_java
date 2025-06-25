package Enums;

public class User {
    private String username;
    private Enum1 role;

    public User(String username, Enum1 role){
        this.username = username;
        this.role = role;
    }

    public Enum1 getUsername(){
        return getUsername();
    }
    public Enum1 getRole() {
        return getRole();
    }

    public static void main(String[] args) {
        User userAdmin = new User("Budi", Enum1.ADMIN);
        User userEditor = new User("Ani", Enum1.EDITOR);

        System.out.println(userAdmin.getUsername() + "adalah" + userAdmin.getRole().getDescription());
        if (userAdmin.getRole().canDeleteData()) {
            System.out.println("Budi Bisa Menghapus Data.");
        } else {
            System.out.println("Budi Tidak Bisa Menghapus Data.");
        }

        System.out.println("\n" + userEditor.getUsername() + "adalah" + userEditor.getRole().getDescription());
        if (userEditor.getRole().canDeleteData()) {
            System.out.println("Ani Bisa Menghapus Data.");
        } else {
            System.out.println("Ani Tidak Bisa Menghapus Data");
        }
    }
}

