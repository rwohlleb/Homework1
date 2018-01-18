import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ILinkedListTest {

    @org.junit.jupiter.api.Test
    void next()
    {
        ILinkedList<Integer> test = new ILinkedList(12);
        test.append(new ILinkedList<>(20));
        ILinkedList expected = null;
        ILinkedList result = (ILinkedList) test.next().next();
        Assertions.assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void last()
    {
        ILinkedList<Integer> test = new ILinkedList<>(12);
        test.append(new ILinkedList<>(20));
        int expected = 20;
        ILinkedList result = (ILinkedList) test.last();
        Assertions.assertEquals(expected,result.get());

    }

    @org.junit.jupiter.api.Test
    void after()
    {
        ILinkedList test = new ILinkedList(12);
        ILinkedList node = new ILinkedList(24);
        test.setNext(node);
        node = new ILinkedList(36);
        test.append(node);
        int expected = 36;
        node = (ILinkedList) test.after(2);
        Assertions.assertEquals(expected, node.get());

    }

    @org.junit.jupiter.api.Test
    void detach()
    {
        ILinkedList test = new ILinkedList(12);
        ILinkedList node = new ILinkedList(24);
        test.setNext(node);
        node = new ILinkedList(36);
        test.setNext(node);
        node = (ILinkedList) test.detach();
        int expected = 36;
        Assertions.assertEquals(expected, node.get());

    }

    @org.junit.jupiter.api.Test
    void get()
    {
        ILinkedList test = new ILinkedList(12);
        int expected = 12;
        int result = (int) test.get();
        Assertions.assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void set()
    {
        ILinkedList test = new ILinkedList();
        test.set(12);
        int expected = 12;
        int result = (int) test.get();
        Assertions.assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void setNext()
    {
        ILinkedList test = new ILinkedList(12);
        ILinkedList node = new ILinkedList(24);
        test.setNext(node);
        int expected = 24;
        int result = (int) test.next().get();
        Assertions.assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void append()
    {
        ILinkedList test = new ILinkedList(12);
        ILinkedList node = new ILinkedList(24);
        test.append(node);
        int expected = 24;
        int result = (int) test.next().get();
        Assertions.assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void insert()
    {
        ILinkedList test = new ILinkedList(12);
        ILinkedList node = new ILinkedList(24);
        test.insert(node);
        int expected = 12;
        int result = (int) test.get();
        assertEquals(expected,result);
    }
}