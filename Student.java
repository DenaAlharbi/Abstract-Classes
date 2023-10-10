public abstract class Student {
    private String id;
    private double GPA;
    public Student(String num1,double num2){
        this.id=num1;
        this.GPA=num2;

    }
    public double getGPA(){
        return GPA;
    }

    public abstract String getStatus();
    @Override
    public final String toString() {
        return "ID: " + id + ", GPA: " + String.format("%.1f", GPA) + ", Status: " + getStatus();
    }

    //public abstract String getStatus(double GPA);
}