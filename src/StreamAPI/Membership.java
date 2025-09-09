package StreamAPI;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.*;

class Member {
    private String name;
    private LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return name + " (Expires: " + expiryDate + ")";
    }
}

public class Membership {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        List<Member> members = Arrays.asList(
            new Member("Alice", now.plusDays(10)),
            new Member("Bob", now.plusDays(40)),
            new Member("Charlie", now.plusDays(25))
        );

        List<Member> expiringSoon = members.stream()
            .filter(m -> ChronoUnit.DAYS.between(now, m.getExpiryDate()) <= 30)
            .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
