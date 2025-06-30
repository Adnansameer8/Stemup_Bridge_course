public class B2_3 {

    String name;
    String idNumber;
    String major;

    public B2_3(String name, String idNumber, String major) {
        this.name = name;
        this.idNumber = idNumber;
        this.major = major;
    }

    public String getInfo() {
        return name + ", ID: " + idNumber + ", Major: " + major;
    }

    public static void main(String[] args) {
        B2_3 s1 = new B2_3("sameer", "c1", "Cse");
       B2_3 s2 = new B2_3("Sahana", "m1", "Mechanical Engineering");
        B2_3 s3 = new B2_3("rahan", "e1", "Electronics");
        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());
        System.out.println(s3.getInfo());
    }
}
