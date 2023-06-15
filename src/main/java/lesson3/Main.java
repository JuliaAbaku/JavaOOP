package lesson3;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Personal personal = new Personal();
        personal.addUser(new User("Иван", "Петров", 30))
                .addUser(new User("Иван", "Петров", 21))
                .addUser(new User("Иван", "Васильев", 31))
                .addUser(new User("Аркадий", "Яблоков", 50));

//        for (User user : personal) {
//            System.out.println(user);
//        }
//        Можно не итерировать для for each, а воспользоваться простым циклом for i:
//        for (int i = 0; i < personal.users.size(); i++) {
//            System.out.println(personal.users.get(i));
//        }

//        List<User> users = personal.toList();
//        System.out.println("-----------");
//        System.out.println(users);
//        Collections.sort(users);
//
//        System.out.println("-----------");
//        System.out.println(users);

        Personal personal2 = new Personal();
        personal.addUser(new User("Юлия", "Абакумова", 25))
                .addUser(new User("Ирина", "Николаева", 23))
                .addUser(new User("Алёна", "Белова", 54))
                .addUser(new User("Анастасия", "Грушева", 36));

        User user = new User("Тамара", "Тараканова", 60);
        // Добавили Тамаре подчиненных из personal
        user.setSubordinate(personal);

        // в personal2 добавили user Тамара
        personal2.addUser(user);

        User bigBoss = new User("Витя", "Пупка", 59);
        bigBoss.setSubordinate(personal2);


        Company company = new Company(bigBoss);
        for (User subordinates:company) {
            System.out.println(subordinates);
        }

    }










}
