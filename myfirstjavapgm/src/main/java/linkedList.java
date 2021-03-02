
import java.util.LinkedList;


public class linkedList 
{
    public static void main(String[] args) 
    {
    LinkedList ls=new LinkedList();
    ls.add(ls);  //append the elemnt at the end of the list
    ls.add(0, ls); //insert the specified element at specified position
    ls.addAll(ls); //append all the elements in the specified collection to the end of this list,in the order that they are returned by the spedified collection's iterator;
    ls.addAll(0, ls);//Inserts all of the elements in the specified collection into this list, starting at the specified position.
    ls.addFirst(ls);//Inserts the specified element at the beginning of this list.
    ls.addLast(ls); //Appends the specified element to the end of this list.
    ls.clear();// remove all the elements from a list
    ls.clone();//Returns a shallow copy of this LinkedList. (The elements themselves are not cloned.)
    ls.contains(ls);//Returns true if this list contains the specified elements;
    ls.descendingIterator();//Returns an iterator over the elements in this deque in reverse sequential order. The elements will be returned in order from last (tail) to first (head).
    ls.getFirst();//Returns the first element in this list.
    ls.getLast();//Returns the last element in this list.
    ls.get(0);//Returns the element at the specified position in this list.
    ls.getFirst();//Returns the first element in this list.
    ls.getLast();//Returns the last element in this list.
    ls.indexOf(ls);//Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
    ls.lastIndexOf(ls);//Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
    ls.iterator();//Returns an iterator over the elements in this list (in proper sequence).
    ls.addLast(ls);//Appends the specified element to the end of this list.
    ls.addFirst(ls);//Inserts the specified element at the beginning of this list.
    ls.add(ls);//Appends the specified element to the end of this list.
    ls.offerLast(ls);//Inserts the specified element at the end of this list.
    ls.peekFirst();//Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
    ls.peekLast();//Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
    ls.poll();//Retrieves and removes the head (first element) of this list.
    ls.pollFirst();//Retrieves and removes the first element of this list, or returns null if this list is empty.
    ls.pollLast();//Retrieves and removes the last element of this list, or returns null if this list is empty.
    ls.pop();//Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
    ls.push(ls);//Pushes an element onto the stack represented by this list. In other words, inserts the element at the front of this list.
    ls.removeFirst();//Removes and returns the first element from this list.
    
    ls.remove(0);//Removes the element at the specified position in this list.
    ls.removeFirst();//Removes and returns the first element from this list.
    ls.removeFirstOccurrence(ls);//Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
    ls.removeLast();//Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
    ls.removeLastOccurrence(ls);//Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
    ls.set(0, ls);//Replaces the element at the specified position in this list with the specified element.
    ls.toArray();//Returns an array containing all of the elements in this list in proper sequence (from first to last element).
    ls.size();//Returns the number of elements in this list.

    
    }
    
}
