package lesson3;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;
    private Personal subordinate;


    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    public Personal getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(Personal subordinate) {
        this.subordinate = subordinate;
    }



    @Override
    public String toString() {
        return String.format("\nИмя: %s, Фамилия: %s, Возраст: %d", firstName, lastName, age);
    }

    @Override

    // сортировка по возрасту


//    public int compareTo(User o) {
//        // вариант проще написание
//        return this.age-o.age;
//
//        // вариант развернутого написания
//
////        if(this.age < o.age){
////            return -1;
////        } else if (this.age > o.age) {
////            return 1;
////        }
////        else
////        return 0;
//      }

    // сортировка по имени, потом по фамилии, потом по возрасту
    public int compareTo(User o){
        int compareNames = this.firstName.compareTo(o.firstName);
        if (compareNames != 0){
            return compareNames;
        }

        int compareLastNames = this.lastName.compareTo(o.lastName);
        if (compareLastNames != 0){
            return compareLastNames;
        }

        return this.age-o.age;

    }











}
