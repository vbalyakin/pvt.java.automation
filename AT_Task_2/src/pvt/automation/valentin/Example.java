package pvt.automation.valentin;

public class Example {
    public static void main(String[] args) {
        Person person1 = createPerson("white", "black");
        Person person2 = createPerson("Black", "white");
        System.out.println(person1);
        Student student1 = createStudent("Valentin");
        Student student2 = createStudent("Valentin");
        System.out.println(student1);
        System.out.println(createMaster());
        printStudentInfo(createStudent("Alexandr"));
        printMasterInfo(createMaster());
        System.out.println(person1.equals(person2));
        System.out.println(student1.equals(student2));
    }

    private static Person createPerson(String skinColor, String colorOfHair) {
        Person person = new Person();
        person.setSkinColor(skinColor);
        person.setColorOfHair(colorOfHair);
        return person;
    }

    private static Student createStudent(String name) {
        Student student = new Student();
        student.setSkinColor("black");
        student.setColorOfHair("Brown");
        student.setMathematics(6);
        student.setPhysics(6);
        student.setFemale("Male");
        student.setUniversity("BSU");
        student.setName(name);
        return student;
    }

    private static Master createMaster() {
        Master master = new Master();
        master.setColorOfHair("Purple");
        master.setSkinColor("Yellow");
        master.setMaterialsScience(8);
        master.setJewelryAlloys(8);
        master.setLaborPsychology(9);
        return master;
    }

    private static void printStudentInfo(Student student) {
        student.sayHello();  // IHuman + Human
        student.startStudy();
        System.out.println("Average mark - " + Student.averageMark(student.getMathematics(), student.getPhysics()));
        student.print();
        student.printAllStudentInformation();
        System.out.println("Phone: " + student.getPhoneInformation());
        student.sayGoodBye(); // IHuman + Human
    }

    private static void printMasterInfo(Master master) {
        master.sayHello(); // IHuman + Human
        master.startStudy(); // IHuman + Human
        master.print();
        System.out.println("My phone number: " + master.getPhoneInformation());
        master.printAllStudentInformation();
        master.sayGoodBye(); // IHuman + Human
    }
}
