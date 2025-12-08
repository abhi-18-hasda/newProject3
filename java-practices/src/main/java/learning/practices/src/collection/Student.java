package learning.practices.src.collection;

public class Student implements Comparable<Student>{
    private String name;
    private float score;
    
    public Student(String name, float score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
    
}
