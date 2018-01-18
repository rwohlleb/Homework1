public class ILinkedList<T>  implements ILinkedListInterface<T>
{
    private ILinkedList<T> head;
    private T nodeData;

    public ILinkedList() {
    }

    public ILinkedList(T nodeData)
    {
        head = null;
        this.nodeData = nodeData;
    }

    @Override
    public ILinkedListInterface<T> next()
    {
        return this.head;
    }

    @Override
    public ILinkedListInterface<T> last()
    {
        ILinkedList<T> temp = this;
        while(temp.head != null)
        {
            temp =temp.head;
        }
        return temp;
    }

    @Override
    public ILinkedListInterface<T> after(int n)
    {
        ILinkedList<T> temp = this;
        int count = 0;
        while(count < n)
        {
            temp = temp.head;
            count++;
        }
        return temp;
    }

    @Override
    public ILinkedListInterface<T> detach()
    {
        ILinkedList<T> temp = this.head;
        this.head = null;
        return temp;
    }

    @Override
    public T get()
    {
        return this.nodeData;
    }

    @Override
    public void set(T nodeData)
    {
        this.nodeData = nodeData;
    }

    @Override
    public void setNext(ILinkedList<T> next)
    {
        this.head = next;
    }

    @Override
    public void append(ILinkedList<T> next)
    {
        ILinkedList<T> temp = this;
        temp = (ILinkedList<T>) temp.last();
        temp.head = next;
    }

    @Override
    public void insert(ILinkedList<T> newFirst)
    {
        newFirst.head = this;
    }
}
