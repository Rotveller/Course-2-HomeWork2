public abstract class Hogwarts {
    private String fullNameStudent;
    private int powerOfMagic;
    //сила магии
    private int distanceOfTheTransgression;
    //расстояние трансгресии

    public Hogwarts(String fullNameStudent, int powerOfMagic, int distanceOfTheTransgression) {
        this.fullNameStudent = fullNameStudent;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTheTransgression = distanceOfTheTransgression;
    }

    public String getFullNameStudent() {
        return fullNameStudent;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTheTransgression() {
        return distanceOfTheTransgression;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setDistanceOfTheTransgression(int distanceOfTheTransgression) {
        this.distanceOfTheTransgression = distanceOfTheTransgression;
    }

    private int ability() {
        return powerOfMagic + distanceOfTheTransgression;
    }

    public void compareTotalAbility(Hogwarts hogwarts) {
        int student1 = ability();
        int student2 = hogwarts.ability();
        if (student1 > student2) {
            System.out.println("Студент " + getFullNameStudent() + " лучше чем студент " + hogwarts.getFullNameStudent() + " " + student1 + " > " + student2);
        } else if (student1 < student2) {
            System.out.println("Студент" + hogwarts.getFullNameStudent() + " лучше, чем студент " + getFullNameStudent() + " " + student1 + " > " + student2);
        } else {
            System.out.println("Студент" + getFullNameStudent() + " имеет равное количество " + hogwarts.getFullNameStudent() + " " + student2 + " = " + student1);
        }
    }

    public void printAllInformationOfStudents() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Имя студента ='" + fullNameStudent + '\'' +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгресии = " + distanceOfTheTransgression;
    }
}
