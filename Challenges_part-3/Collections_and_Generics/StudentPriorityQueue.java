package Collections_and_Generics;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade()-o2.getGrade();
            }
        });
        queue.offer(new Student("prashant",'A'));
        queue.offer(new Student("Sudhanshu",'B'));
        queue.offer(new Student("Samarth",'D'));
        queue.offer(new Student("Aditya",'C'));
//        System.out.printf("Queue is %s",queue);
        System.out.println();
        System.out.printf("Got %s",queue.poll());
        System.out.printf("Got %s",queue.poll());
        System.out.printf("Got %s",queue.poll());
        System.out.printf("Got %s",queue.poll());

    }
    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Student{");
            sb.append("name='").append(name).append('\'');
            sb.append(", grade=").append(grade);
            sb.append('}');
            return sb.toString();
        }
    }
}
