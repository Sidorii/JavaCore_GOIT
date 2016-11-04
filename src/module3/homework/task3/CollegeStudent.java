package module3.homework.task3;


public class CollegeStudent extends Student{
    private String collegeName;
    private int rating;
    private long id;

    public CollegeStudent(String firstName) {
        super(firstName);
    }

    public CollegeStudent(String lastName, String firstName) {
        super(lastName, firstName);
    }

    public CollegeStudent(String lastName, String firstName, String collegeName, long id, int rating) {
        super(lastName, firstName);
        this.collegeName = collegeName;
        this.id = id;
        this.rating = rating;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
