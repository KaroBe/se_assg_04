// Beleg 04 - Software Engineering
// Aufgabe 1
// Karoline Brehm - 117190
// Elisabeth Scholz - 117xxx

// compile and run by:
// javac QueueTest.java 
// java -Xmx128M -Xms16M QueueTest

//Dienst, bzw. adaptierte Klasse
import java.util.ArrayList;

//Ziel bzw. Interface, das der Adapter implementieren soll
interface QueueInterface<T>{
    
    //vorne einfügen/ausgeben und entfernen
    public void push(T t);
    public T pop ();
    
    //hinten einfügen/ausgeben und entfernen
    public void put(T t);
    public T get();
    
    //erstes/letzes Element lesen ohne entfernen
    public T first();
    public T last();
}

//Adapter-Klasse
class QueueAdapter<T> implements QueueInterface<T>{
    
    //Datenstruktur, die adaptiert wird -> notwendig, damit ausschließlich die im QueueInterface deklarierten Methoden auf der Datenstruktur aufgerufen werden können, wie es bei einem extend der ArrayList der Fall wäre, da QueueAdapter von ArrayList ERBEN würde
    private ArrayList<T> m_list;
    
    //Konstruktor
    public QueueAdapter(){
        this.m_list = new ArrayList<T>();
    }
    
    //vorne einfügen/ausgeben und entfernen
    public void push(T t){
        this.m_list.add(0,t);
    }
    
    public T pop ()
    {
        // WILL THROW IndexOutOfBoundsException on empty list/queue
        T firstElement = this.m_list.get(0); // at this position
        this.m_list.remove(0);
        return firstElement;
    }
    
    //hinten einfügen/ausgeben und entfernen
    public T get(){
        // WILL THROW IndexOutOfBoundsException on empty list/queue
        int lastPos = this.m_list.size() - 1;
        T lastElement = this.m_list.get(lastPos);
        this.m_list.remove(lastPos);
        return lastElement;
    }
    
    public void put(T t){
        int lastPos = m_list.size();
        m_list.add(lastPos,t);
    }
    
    //erstes/letzes auslesen ohne zu entfernen
    public T first(){
        // WILL THROW IndexOutOfBoundsException on empty list/queue
        return this.m_list.get(0);
    }
    
    public T last(){
        int lastPos = this.m_list.size() - 1;
        return this.m_list.get(lastPos);
    }
}

//Client, eine Testklasse in diesem Fall
public class QueueTest{
    public static void main(String []args){
        System.out.println("Queue Test");
        
        QueueAdapter<Integer> intQueue = new QueueAdapter<Integer>();
        
        System.out.println("content: 0, inserted by push");
        intQueue.push(0);
        System.out.println("first: " + intQueue.first());
        System.out.println("last: " + intQueue.last());
        intQueue.push(1);
        System.out.println("content: 10, inserted by push");
        System.out.println("first: " + intQueue.first());
        System.out.println("last: " + intQueue.last());
        intQueue.push(2);
        intQueue.push(3);
        
        System.out.println("content: 3210, inserted by push");
        System.out.println("pop all elements:");
        System.out.println(intQueue.pop());
        System.out.println(intQueue.pop());
        System.out.println(intQueue.pop());
        System.out.println(intQueue.pop());
        
        System.out.println("content: 123, inserted by put");
        intQueue.put(0);
        intQueue.pop(); // pop bei size == 1
        intQueue.put(1);
        intQueue.put(2);
        intQueue.put(3);
        System.out.println("first: " + intQueue.first());
        System.out.println("last: " + intQueue.last());
        System.out.println("pop all elements");
        System.out.println(intQueue.pop());
        System.out.println(intQueue.pop());
        System.out.println(intQueue.pop());
        
        System.out.println("content: 123");
        intQueue.put(0);
        intQueue.get(); //get bei size==1
        intQueue.put(1);
        intQueue.put(2);
        intQueue.put(3);
        System.out.println("first: " + intQueue.first());
        System.out.println("last: " + intQueue.last());
        System.out.println("get all elements");
        System.out.println(intQueue.get());
        System.out.println(intQueue.get());
        System.out.println(intQueue.get());
    }
}
