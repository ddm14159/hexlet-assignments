package exercise;

import java.util.List;

// BEGIN
public class App {
    public static Long getCountOfFreeEmails(List<String> emails) {
        var freeDomains = List.of("gmail.com", "yandex.ru", "hotmail.com");
        return emails.stream()
                .map(email -> {
                    var splitted = email.split("@");
                    return splitted[1];
                })
                .filter(freeDomains::contains)
                .count();
    }
}
// END
