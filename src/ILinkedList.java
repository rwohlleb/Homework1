public class ILinkedList<T> implements ILinkedListInterface<T>
{
    private ILinkedList<T> head;
    private T nodeData;

    public ILinkedList(){}

    public ILinkedList (T data) {
        head = null;
        this.nodeData = data;
    }

    @Override
    public ILinkedList<T> next() {
        return this.head;
    }

    @Override
    public ILinkedList<T> last() {
        ILinkedList<T> temp = this;

        while(temp.head != null){
            temp = temp.head;
        }
        return temp;
    }

    @Override
    public ILinkedList<T> after(int n) {
        ILinkedList temp = this;

        int count = 0;
        while(count < n){
            temp = temp.head;
            count++;
        }
        return temp;
    }

    public ILinkedList<T> detach() {
        ILinkedList temp2 = this.head;
        this.head = null;
        return temp2;
    }

    public T get() {
        return this.nodeData;
    }

    public void set(T data) {
        this.nodeData = data;
    }

    @Override
    public void setNext(ILinkedList<T> next) {
        this.head = next;
    }

    @Override
    public void append(ILinkedList<T> next) {
        ILinkedList temp = this;
        temp = temp.last();
        temp.head = next;
    }

    @Override
    public void insert(ILinkedList<T> newFirst) {
        newFirst.head = this;
    }
}
