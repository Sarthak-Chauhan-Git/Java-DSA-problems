package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    String name;
    int rank;
    Student(String name, int rank){
        this.name = name;
        this.rank = rank;
    }
    @Override
    public int compareTo(Student s2) {
        return this.rank - s2.rank;  
    }
}
public class PQinJCF {
    public static void main(String[] args){
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());  //This is an integer pq and will prioritize elements with smaller values no matter order of adding them 
        //we can use comparator.reverseorder() to reverse its comparison functionality and make it desc instead of asc
        // pq.add(1);  // O(logn)
        // pq.add(3);
        // pq.add(5);
        // pq.add(2);
        // pq.add(4);
        pq.add(new Student("A", 12));
        pq.add(new Student("B", 10));
        pq.add(new Student("C", 8));
        pq.add(new Student("D", 9));
        pq.add(new Student("E", 4));
        
        while(!pq.isEmpty()){
            Student ele = pq.peek();    //O(1)
            System.out.print(ele.name + " : "+ele.rank + " \n ");
            pq.remove();    // O(logn)
        }
        System.out.println("NULL");
    }
}
