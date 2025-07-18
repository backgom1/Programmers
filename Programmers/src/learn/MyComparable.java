package learn;

public class MyComparable implements Comparable<MyComparable> {

    private String id;
    private int age;

    public MyComparable(int age, String id) {
        this.age = age;
        this.id = id;
    }

    @Override
    public int compareTo(MyComparable o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public String toString() {
        return "MyComparable{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
