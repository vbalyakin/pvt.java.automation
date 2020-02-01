package pvt.automation.valentin;

public class Student extends Person {
    private String university;
    private String female;
    private int mathematics;
    private int physics;
    private String name;

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getMathematics() {
        return mathematics;
    }

    public int getPhysics() {
        return physics;
    }

    public void printAllStudentInformation() {
        System.out.println(this.university + ", " + this.name + ", " + this.female + ", " + this.mathematics + ", " + this.physics);
    }

    static int averageMark(int Mathematics, int Physics) {
        return (Mathematics + Physics) / 2;
    }

    private double getHeightInformation() { // private доступ, вызов невозможен
        return 1.80;
    }

    @Override
    public void print() { // полиморфизм
        System.out.println("Sex: " + this.female);
    }

    protected int getPhoneInformation() {
        return 7758441;
    }

    @Override
    public String toString() {
        return "Student: " + "name - " + name + "; university - " + university + "; female - " + female
                + "; skin color - " + getSkinColor() + "; colorOfHair - " + getColorOfHair()
                + "; Mathematics mark - " + mathematics + "; Physics mark - " + physics;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Student)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Student student = (Student) object;
        return mathematics == student.mathematics &&
                physics == student.physics &&
                university.equals(student.university) &&
                female.equals(student.female) &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return (17 * mathematics + physics + ((null == university) ? 0 : university.hashCode())
                + ((null == female) ? 0 : female.hashCode()) +
                ((null == name) ? 0 : name.hashCode()));
    }
}
