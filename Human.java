public class Human {
    private String Race = "black";
    private String Weight = "64 kg";
    private int Age = 21;

    public void Race(){
        System.out.println("The user is black");
    }
    public void Weight(){
        System.out.println("The user weighs 64 kg");
    }
    public void Age(){
        System.out.println("The user is 21 years old");
    }
    public static void main(String[] args) {
        Human myHuman = new Human();
        myHuman.Race();
        myHuman.Weight();
        myHuman.Age();

    }
}
