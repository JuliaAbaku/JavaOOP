package lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{

    private User user;
    public Company(User user) {
        this.user = user;
    }

    private List<User> deepTree(User user){
        List<User> subordinates = new ArrayList<>();
        subordinates.add(user);
        if (user.getSubordinate() == null || user.getSubordinate().size() == 0){
            return subordinates;
        }
        for (User item:user.getSubordinate()) {
            subordinates.addAll(deepTree(item));
        }
        return subordinates;
    }



    @Override
    public Iterator iterator() {
        return new Iterator() {
            List<User> iterUser = deepTree(user);
            Iterator<User> iterator = iterUser.iterator();

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Object next() {
                return iterator.next();
            }
        };
    }


}