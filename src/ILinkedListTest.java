import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ILinkedListTest {

    @org.junit.jupiter.api.Test
    void next()
    {
        ILinkedList<Integer> temp = new ILinkedList(10);
        temp.append(new ILinkedList<>(20));
        ILinkedList expected = null;
        ILinkedList result = temp.next().next();
        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void last()
    {
        ILinkedList<Integer> temp = new ILinkedList<>(10);
        temp.append(new ILinkedList<>(20));
        int expected = 20;
        ILinkedList result = temp.last();
        Assertions.assertEquals(expected,result.get());
    }

    @org.junit.jupiter.api.Test
    void after()
    {
        ILinkedList temp = new ILinkedList(10);
        ILinkedList next = new ILinkedList(20);
        temp.setNext(next);
        next = new ILinkedList(30);
        temp.append(next);
        int expected = 30;
        next = temp.after(2);
        Assertions.assertEquals(expected, next.get());

    }

    @org.junit.jupiter.api.Test
    void detach()
    {
        ILinkedList temp = new ILinkedList(10);
        ILinkedList next = new ILinkedList(20);
        temp.setNext(next);
        next = new ILinkedList(30);
        temp.setNext(next);
        int expected = 30;
        Assertions.assertEquals(expected, next.get());

    }

    @org.junit.jupiter.api.Test
    void get()
    {
        ILinkedList temp = new ILinkedList(10);
        int expected = 10;
        Assertions.assertEquals(expected, temp.get());
    }

    @org.junit.jupiter.api.Test
    void set()
    {
        ILinkedList temp = new ILinkedList();
        temp.set(10);
        int expected = 10;
        Assertions.assertEquals(expected, temp.get());
    }

    @org.junit.jupiter.api.Test
    void setNext()
    {
        ILinkedList temp = new ILinkedList(10);
        ILinkedList next = new ILinkedList(20);
        temp.setNext(next);
        int expected = 20;
        Assertions.assertEquals(expected, temp.next().get());
    }

    @org.junit.jupiter.api.Test
    void append()
    {
        ILinkedList temp = new ILinkedList(10);
        ILinkedList next = new ILinkedList(20);
        temp.append(next);
        next = new ILinkedList(30);
        temp.append(next);
        int expected = 30;
        ILinkedList result = temp.last();
        Assertions.assertEquals(expected,result.get());
    }

    @org.junit.jupiter.api.Test
    void insert()
    {
        ILinkedList temp = new ILinkedList(10);
        ILinkedList newNode = new ILinkedList(20);
        temp.insert(newNode);
        int expected = 10;
        Assertions.assertEquals(expected, temp.get());
    }
}