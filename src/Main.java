package src;

import src.User;

public class Main {
    public static void main(String[] args) {
        //Accesso alla Singleton istance
        User user1 = User.getInstance();

        //Settaggio e stampa user1
        user1.setName("Marco");
        user1.setAge(21);
        user1.stampaInfo();

        //Settaggio e stampa user2
        User user2 = User.getInstance();
        user2.setName("Paolo");
        user1.setAge(23);
        user2.stampaInfo();



    }

}
