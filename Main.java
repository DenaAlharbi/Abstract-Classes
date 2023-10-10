public class Main {
    public static void main(String[] args) {
        Student[] mystudents = new Student[5];
        for (int i = 0; i < mystudents.length; i++) {
            String id = String.valueOf((long) (Math.random() * 9_000_000_000L) + 1_000_000_000L);// this makes the digits for the id random
            if (i % 2 == 0) { //just a way to make the objects randomly chosen but could be done in a more random way with Math.random
                mystudents[i] = new Undergraduate(id, Math.random() * 4.0);
            } else {
                mystudents[i] = new Graduate(id, Math.random() * 4.0);
            }
            System.out.println(mystudents[i]);
        }
    }
}
