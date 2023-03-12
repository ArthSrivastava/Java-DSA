package Heap.Pepcoding;



import java.io.*;
import java.util.*;

public class CustomPriorityQueue {

    public static class PriorityQueue<T> {
        ArrayList<T> data;
        Comparator comp;
        public PriorityQueue() {
            data = new ArrayList<>();
            comp = null;
        }

        public PriorityQueue(Comparator comp) {
            this.comp = comp;
            data = new ArrayList<>();
        }
        public void add(T val) {
            // write your code here
            data.add(val);
            upHeapify(data.size() - 1);
        }

        public boolean isSmaller(int i, int j) {
            if(comp == null) {
                Comparable iTh = (Comparable) data.get(i);
                Comparable jTh = (Comparable) data.get(j);
                if (iTh.compareTo(jTh) < 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                T iTh = data.get(i);
                T jTh = data.get(j);
                if(comp.compare(iTh, jTh) < 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        private void upHeapify(int i) {
            if(i == 0) return;
            int pi = (i - 1) / 2;
            if(isSmaller(i, pi)) {
                swap(pi, i);
                upHeapify(pi);
            }
        }

        private void swap(int i, int j) {
            T iVal = data.get(i);
            T jVal = data.get(j);
            data.set(i, jVal);
            data.set(j, iVal);
        }

        public T remove() {
            // write your code here
            if(this.size() == 0) {
                System.out.println("Underflow");
                return null;
            }

            swap(0, data.size() - 1);
            T val = data.remove(data.size() - 1);
            downHeapify(0);
            return val;
        }

        private void downHeapify(int pi) {

            int min = pi;
            int li = 2 * pi + 1;
            if(li < data.size() && isSmaller(li, min)) {
                min = li;
            }

            int ri = 2 * pi + 2;
            if(ri < data.size() && isSmaller(ri, min)) {
                min = ri;
            }

            if(min != pi) {
                swap(min, pi);
                downHeapify(min);
            }
        }

        public T peek() {
            // write your code here
            if(data.size() == 0) {
                System.out.println("Underflow");
                return null;
            }
            return data.get(0);
        }

        public int size() {
            // write your code here
            return this.data.size();
        }
    }

    static class Student implements Comparable<Student>{
        int rNo;
        int wt;
        int ht;

        public Student(int rNo, int wt, int ht) {
            this.rNo = rNo;
            this.ht = ht;
            this.wt = wt;
        }

        @Override
        public int compareTo(Student o) {
            return this.rNo - o.rNo;
        }

        @Override
        public String toString() {
            return "Roll No.:" + this.rNo + " Height:" + this.ht + " Weight:" + this.wt;
        }
    }

    static class StudentHtComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.ht - s2.ht;
        }
    }

    static class StudentWtComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.wt - s2.wt;
        }
    }

    public static void main(String[] args) throws Exception {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student(25, 80, 180));
        pq.add(new Student(14, 89, 185));
        pq.add(new Student(5, 70, 173));
        pq.add(new Student(27, 67, 179));
        pq.add(new Student(36, 92, 192));
        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }
}

