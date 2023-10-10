public class Graduate extends Student {
    public Graduate(String num1, double num2) {
        super(num1, num2);
    }




    @Override
    public String getStatus() {
        if (getGPA() >= 3.0) {
            return "good";
        } else {
            return "probation";
        }
    }


}
