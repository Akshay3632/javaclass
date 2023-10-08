//import java.util.PriorityQueue;
//import java.util.Arrays;
//import java.util.Spliterator;
//import java.util.Iterator;
//import java.util.ArrayList;
import java.util.*;

public class priorityqueue {

public static void main(String[] args){

//create priority queue
PriorityQueue<Integer> pq=new priorityQueue<>();
PriorityQueue<Integer> pq1=new priorityQueue<>(3);


//Add element
	pq.add(5);
	pq.add(3);
	pq.add(7);
	pq.add(1);

  sop("element of priorityqueue");
  sop(pq);

//clear method
	pq.clear();
  sop("After clearing:"+pq);

//contains method	
	int target =3;
	boolean containsTarget = false;

     for(Integer element :pq){
       if (element == target){
	containsTarget = true;
	break;
}
}
  sop("contains:" + target + ":"  + containsTarget );

//create iterator
Iterator<Integer> iterator = new Iterator<>();

  sop("enter element in priorityqueue:");

   while(iterator.hasNext()){
    Integer element = iterator.next();
  sop(element);


//offer method
  sop("offer 5:" + pq1.offer(5));  //return true  
  sop("offer 3:" + pq1.offer(3));  //return true
  sop("offer 7:" + pq1.offer(7));  //return true

  sop(offer 1:" + pq1.offer(1));   // return false

  sop("priorityqueue elements:"+pq1);

//peek method
	Integer highestPriorityElement = pq.peek();
  sop("eneter with highest priority(peek):"+ highestPriorityElement);
  sop("prorityqueue after peek :"+pq);

//poll method
	Integer highestPriorityElement = pq.poll();
  sop("eneter with highest priority(poll):"+ highestPriorityElement);
  sop("prorityqueue after poll :"+pq);

//remove method
	boolean removed = pq.remove(3);
  sop("removed:" + removed);
  sop("priorityqueue after removed:" + pq);

//size method
	int size = pq.size();
  sop("size of the priorityqueue :" + size);

//spliterator method
Spliterator<Integer> spliterator = pq.spliterator();
spliterator.forEachRemaining(System.out::printLn);

//toarray method
	Integer[] array = pq.toArray(new Integer[pq.size()]);
  sop("Array from priorityqueue:" + Arrays.toString(array)); 
}
}