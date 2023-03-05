package abstract_class_and_interface.home5;

public class Main {
    public static void main(String[] args) {
        abstract_class_and_interface.home5.ChildOne child = new ChildOne();
        abstract_class_and_interface.home5.ChildTwo childTwo = new ChildTwo();
        child.enable();
        childTwo.enable();
        child.disable();
        System.out.println("------------");
        child.enable();
        childTwo.enable();

    }
}
