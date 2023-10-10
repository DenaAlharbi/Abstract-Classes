public class Undergraduate extends Student{
    String status;

    public Undergraduate(String num1, double num2) {
        super(num1, num2);
    }
    @Override
    public String getStatus() {
        if (getGPA() >= 3.0) {
            status = "honor";
            return status;
        } else if (getGPA() >= 2.0) {
            status = "good";
            return status;
        } else {
            status = "probation";
            return status;
        }
    }



}
