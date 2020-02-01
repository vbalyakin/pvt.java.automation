package pvt.automation.valentin;

public class Person extends Human {
    private String skinColor;

    public void print() {
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    @Override
    public void startStudy() {
        System.out.println("I'm start to learn Java");
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Person person = (Person) object;
        return skinColor.equals(person.skinColor);
    }

    @Override
    public int hashCode() {
        return 17 * ((null == skinColor) ? 0 : skinColor.hashCode()) + ((null == colorOfHair) ? 0 : colorOfHair.hashCode());
    }

    @Override
    public String toString() {
        return "Person: " +
                "skinColor - " + skinColor + "; colorOfHair - " + getColorOfHair();
    }
}
