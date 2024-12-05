package ListInterface_LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// MyList interface declares various list operations
public interface MyList<E> {
    // Adding Elements
    boolean add(E e);
    void add(int index, E element);
    boolean addAll(Collection<? extends E> c);
    boolean addAll(int index, Collection<? extends E> c);
    void addFirst(E e);
    void addLast(E e);

    // Accessing Elements
    E get(int index);
    E getFirst();
    E getLast();

    // Removing Elements
    E remove();
    E remove(int index);
    boolean remove(Object o);
    boolean removeAll(Collection<?> c);
    E removeFirst();
    E removeLast();
    void clear();

    // Modifying Elements
    E set(int index, E element);

    // Querying the List
    boolean contains(Object o);
    int size();
    boolean isEmpty();
    int indexOf(Object o);
    int lastIndexOf(Object o);

    // Iterating over Elements
    Iterator<E> iterator();
    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int index);

    // Sublist
    List<E> subList(int fromIndex, int toIndex);
}