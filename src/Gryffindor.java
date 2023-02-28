public class Gryffindor {
    //Грифиндор
    private String fullNameStudent;
    private String characterProperties;
    //свойства характера
    private int powerOfMagic;
    //сила магии
    private int distanceOfTheTransgression;
    //расстояние трансгресии

    public Gryffindor(String fullNameStudent, String characterProperties, int powerOfMagic, int distanceOfTheTransgression) {
        this.fullNameStudent = fullNameStudent;
        this.characterProperties = characterProperties;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTheTransgression = distanceOfTheTransgression;
    }

    public String getFullNameStudent() {
        return fullNameStudent;
    }

    public String getCharacterProperties() {
        return characterProperties;
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
        return "Gryffindor{" +
                "Имя студента='" + fullNameStudent + '\'' +
                ", Свойства характера='" + characterProperties + '\'' +
                ", Сила магии=" + powerOfMagic +
                ", Расстояния трансгресии=" + distanceOfTheTransgression +
                '}';
    }
}
