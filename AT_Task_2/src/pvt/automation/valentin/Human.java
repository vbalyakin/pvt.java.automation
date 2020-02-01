package pvt.automation.valentin;

public abstract class Human implements IHuman{
    public String colorOfHair;
    public abstract void startStudy();

    public void setColorOfHair(String colorOfHair) {
        this.colorOfHair = colorOfHair;
    }

    public String getColorOfHair() {
        return colorOfHair;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Good bye!");
    }
}
