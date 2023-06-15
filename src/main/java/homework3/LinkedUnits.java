package homework3;

import java.util.Iterator;

// Создаем лист с каким то наполнением заранее нам не известным Е, говорим, что этот лист итеритуемый
public class LinkedUnits<E> implements Iterable<E> {
    // Задаем поля - в нашем листе будет первый элемент, последний элемент и размер листа
    private int size = 0;
    private Unit<E> first;
    private Unit<E> last;

    // Тут мы пишем методы, которые позволяют взаимодействовать с нашим Листом


    public void add(E e) {
        Unit<E> newUnit = new Unit<>(null, e, null); // Тут создаем новый элемент списка.
        if (first == null) {                // Проверяем есть ли первый элемент и добавляем его
            first = newUnit;
        } else {
            newUnit.previous = last;        // Если первый элемент есть, то новый элемент становится последним
            last.next = newUnit;
        }
        last = newUnit;
        size++;
    }

    public void clear() {       // Тут все чистим и новорим, что элементов нет, а размер листа 0
        first = null;
        last = null;
        size = 0;
    }

    private Unit<E> getUnit(int index) {        // Получаем элемент
        int lastIndex = size - 1;
        if (index == 0) {           // Если индекс равен 0, то вернем первый элемент
            return first;
        }
        if (index == lastIndex) {       // Если индекс равен последнему индексу, то вернем последний элемент
            return last;
        }
        boolean backwardSearch = index > size / 2;  // Тут какая то конструкция, которая возвращает элемент,
                                                        // если это ни первый и ни последний индекс.
                                                    // У меня сложности с тернарными операциями(
        Unit<E> unit = backwardSearch ? last : first;
        int countStep = backwardSearch ? lastIndex - index : index;
        for (int i = 0; i < countStep; i++) {
            unit = backwardSearch ? unit.previous : unit.next;
        }
        return unit;
    }

    public E get(int index) {       // Тут вроде мы получаем индекс элемента
        isIndexExist(index);
        Unit<E> unit = getUnit(index);
        return unit.element;
    }

    public E remove(int index) {
        isIndexExist(index);
        Unit<E> unit = getUnit(index);
        if (unit == first) {
            first = unit.next;
            first.previous = null;
        } else if (unit == last) {
            last = unit.previous;
            last.next = null;
        } else {
            Unit<E> previousUnit = unit.previous;
            Unit<E> nextUnit = unit.next;
            previousUnit.next = nextUnit;
            nextUnit.previous = previousUnit;
        }
        size--;
        return unit.element;
    }

    public void isIndexExist(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void set(E value, int index) {
        isIndexExist(index);
        Unit<E> unit = getUnit(index);
        unit.element = value;
    }

    public int size() {
        return size;
    }
// переопределяем логику итератора
    @Override
    public Iterator<E> iterator() { // Возвращает нам новый итератор, в котором следующий элемент равен первому
        return new Iterator<>() {
            Unit<E> current = first;

            @Override
            public boolean hasNext() { // метод hasNext() возвращает нам элемент, если он не равен null.
                                        // То есть проверяет, есть ли следующий элемент
                return current != null;
            }

            @Override
            public E next() { //  возвращает следующий элемент
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }

    private static class Unit<E> { // Создаем класс Unit, задаем ему поля и делаем конструктор
        Unit<E> previous;
        E element;
        Unit<E> next;

        public Unit(Unit<E> previous, E element, Unit<E> next) {
            this.previous = previous;
            this.element = element;
            this.next = next;
        }
    }


}

