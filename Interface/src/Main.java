import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<IInfo> a = new ArrayList<>();
        People person1 = new People();
        a.add(person1);
        Car car1 = new Car();
        a.add(car1);

        for (IInfo obj : a) {
            obj.input();
        }
        showInfo(a);
    }

    static void showInfo(ArrayList<IInfo> a) {
        for (IInfo obj : a) {
            obj.showInfo();
        }

    }

}
