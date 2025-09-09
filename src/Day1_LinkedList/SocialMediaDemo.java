package Day1_LinkedList;
import java.util.*;

class User {
    int userId;
    String name;
    int age;
    List<Integer> friendIds = new ArrayList<>();
    User next;

    public User(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.next = null;
    }
}

class SocialMedia {
    User head;

    public void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        if (head == null) { head = newUser; return; }
        User temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newUser;
    }

    public User getUserById(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int userId1, int userId2) {
        User u1 = getUserById(userId1);
        User u2 = getUserById(userId2);
        if (u1 != null && u2 != null) {
            if (!u1.friendIds.contains(userId2)) u1.friendIds.add(userId2);
            if (!u2.friendIds.contains(userId1)) u2.friendIds.add(userId1);
        }
    }

    public void removeFriend(int userId1, int userId2) {
        User u1 = getUserById(userId1);
        User u2 = getUserById(userId2);
        if (u1 != null && u2 != null) {
            u1.friendIds.remove(Integer.valueOf(userId2));
            u2.friendIds.remove(Integer.valueOf(userId1));
        }
    }

    public List<Integer> mutualFriends(int userId1, int userId2) {
        User u1 = getUserById(userId1);
        User u2 = getUserById(userId2);
        if (u1 != null && u2 != null) {
            List<Integer> mutual = new ArrayList<>(u1.friendIds);
            mutual.retainAll(u2.friendIds);
            return mutual;
        }
        return new ArrayList<>();
    }

    public void displayFriends(int userId) {
        User u = getUserById(userId);
        if (u != null) System.out.println(u.name + "'s friends: " + u.friendIds);
    }
}

public class SocialMediaDemo {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 26);
        sm.addUser(3, "Charlie", 24);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);

        sm.displayFriends(1);
        sm.displayFriends(2);

        System.out.println("Mutual friends between Alice and Bob: " + sm.mutualFriends(1, 2));
    }
}

