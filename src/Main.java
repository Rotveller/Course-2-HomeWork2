import java.util.Random;

public class Main {
   private static final Random RANDOM = new Random();
    public static void main(String[] args) {

        GryffindorStudents garryPotter =  generateGryffindorStudent("Гарри Поттер");
        GryffindorStudents germionaGrandger = generateGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudents ronYizly = generateGryffindorStudent("Рон Уизли");
        //
        HufflepuffStudents zachariahSmith = HufflepuffStudents("Захария Смит", 6, 5, 75, 50, 59);
        HufflepuffStudents cedricDiggory = HufflepuffStudents(" Седрик Диггори", 6, 5, 75, 50, 59);
        HufflepuffStudents justinFinchFletchley = HufflepuffStudents("Джастин Финч-Флетчли", 6, 5, 75, 50, 59);
        //
        RavenclawStudents zhouChang = RavenclawStudents("Чжоу Чанг", 6, 5, 75, 50, 59, 45);
        RavenclawStudents padmaPatil = RavenclawStudents("Падма Патил", 6, 5, 75, 50, 75, 50);
        RavenclawStudents marcusBelby = RavenclawStudents("Маркус Белби", 6, 5, 75, 50, 94, 51);
        //
        SlytherinStudents dracoMalfoy = SlytherinStudents("Драко Малфой", 6, 5, 75, 50, 59, 45, 12);
        SlytherinStudents grahamMontague = SlytherinStudents("Грэхэм Монтегю", 6, 5, 75, 50, 75, 50, 41);
        SlytherinStudents gregoryGoyle = SlytherinStudents("Грегори Гойл", 6, 5, 75, 50, 94, 51, 15);

        garryPotter.printAllInformationOfStudents();
        germionaGrandger.printAllInformationOfStudents();
        garryPotter.compareTotalAbility(germionaGrandger);
        garryPotter.compareGryffindorStudents(germionaGrandger);
    }

    private static GryffindorStudents generateGryffindorStudent(String fullNameStudent) {
        return new GryffindorStudents(
                fullNameStudent,
                RANDOM.nextInt(10),
                RANDOM.nextInt(10),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static HufflepuffStudents generateHufflepuffStudents(String fullNameStudent) {
return new HufflepuffStudents(
        fullNameStudent,
