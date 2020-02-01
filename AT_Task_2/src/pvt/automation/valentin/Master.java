package pvt.automation.valentin;

public class Master extends Student {
    private int materialsScience;
    private int jewelryAlloys;
    private int laborPsychology;

    public void setMaterialsScience(int materialsScience) {
        this.materialsScience = materialsScience;
    }

    public void setJewelryAlloys(int jewelryAlloys) {
        this.jewelryAlloys = jewelryAlloys;
    }

    public void setLaborPsychology(int laborPsychology) {
        this.laborPsychology = laborPsychology;
    }

    public void printAllStudentInformation() {
        System.out.println("Master student marks: " + this.materialsScience + ", " + this.jewelryAlloys + ", " + this.laborPsychology);
    }

    public void print() {
        System.out.println("I'm master student in BNTU");
    }

    protected int getPhoneInformation() {
        return 8830452;
    }

    public void startStudy() {
        System.out.println("I'm start to learn Automation");
    }

    @Override
    public String toString() {
        return "Master: " + "MaterialsScience mark - " + materialsScience + ", JewelryAlloys mark - " + jewelryAlloys +
                ", LaborPsychology mark - " + laborPsychology + ", colorOfHair - " + colorOfHair + ", skinColor - " + getSkinColor();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Master)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        Master master = (Master) object;
        return materialsScience == master.materialsScience &&
                jewelryAlloys == master.jewelryAlloys &&
                laborPsychology == master.laborPsychology;
    }

    @Override
    public int hashCode() {
        return (31 * materialsScience + jewelryAlloys + laborPsychology);
    }
}
