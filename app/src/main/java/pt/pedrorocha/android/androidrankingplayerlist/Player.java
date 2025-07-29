package pt.pedrorocha.android.androidrankingplayerlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

    private long id;
    private String name;
    private int points;
    private String email;
    private int age;
    private String photoUrl;

    private static List<Player> playerList = new ArrayList<>();

    public Player(String name, int points, String email, int age, String photoUrl) {
        this.id = getNextId();
        this.name = name;
        this.points = points;
        this.email = email;
        this.age = age;
        this.photoUrl = photoUrl;
    }

    //Getters

    public int getNextId() {
        return playerList.size() + 1;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

//    public static List<Player> getPlayers() {
//
//        return playerList;
//    }
//
//    public static void addPlayer(Player player) {
//        playerList.add(player);
//    }

    public void setId(long id){
        this.id = id;
    }

//   public static List<Player> list(){
//        Player P0 = new Player( "Alice", 543, "alice0@example.com", 25, "https://randomuser.me/api/portraits/women/1.jpg");
//        Player P1 = new Player("Bob", 830, "bob1@example.com", 22, "https://randomuser.me/api/portraits/men/2.jpg");
//       Player P2 = new Player("Charlie", 150, "charlie2@example.com", 30, "https://randomuser.me/api/portraits/men/3.jpg");
//        Player P3 = new Player("Diana", 710, "diana3@example.com", 27, "https://randomuser.me/api/portraits/women/4.jpg");
//        Player P4 = new Player(4, "Ethan", 420, "ethan4@example.com", 21, "https://randomuser.me/api/portraits/men/5.jpg");
//        Player P5 = new Player(5, "Fiona", 690, "fiona5@example.com", 24, "https://randomuser.me/api/portraits/women/6.jpg");
//        Player P6 = new Player(6, "George", 300, "george6@example.com", 28, "https://randomuser.me/api/portraits/men/7.jpg");
//        Player P7 = new Player(7, "Hannah", 950, "hannah7@example.com", 20, "https://randomuser.me/api/portraits/women/8.jpg");
//        Player P8 = new Player(8, "Ian", 780, "ian8@example.com", 26, "https://randomuser.me/api/portraits/men/9.jpg");
//        Player P9 = new Player(9, "Julia", 610, "julia9@example.com", 23, "https://randomuser.me/api/portraits/women/10.jpg");
//       return new ArrayList<>(Arrays.asList(P0, P1, P2, P3));
//   }
}

