package naveenautomation.SessionNotes;

public class StaticFileConcept {

    static  String fileName;
    int fileSize;

    public static void readFile(){
        System.out.println("Read file");

    }

    public void writeFile(){
        System.out.println("Write file");
    }



    public static void main(String[] args) {
        readFile();
        StaticFileConcept.readFile();

        StaticFileConcept fc = new StaticFileConcept();
        fc.writeFile();
        fc.readFile(); // not recommended
        System.out.println(fc.fileSize = 10);
        fileName = "TestDate";
        System.out.println(fileName);

    }
}
