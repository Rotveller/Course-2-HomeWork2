public class hogwarts {
    private String fullNameStudent;
    private int powerOfMagic;
    //сила магии
    private int distanceOfTheTransgression;
    //расстояние трансгресии

    public hogwarts(String fullNameStudent, int powerOfMagic, int distanceOfTheTransgression) {
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

    @Override
    public String toString() {
        return "hogwarts{" +
                "fullNameStudent='" + fullNameStudent + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", distanceOfTheTransgression=" + distanceOfTheTransgression +
                '}';
    }
}
