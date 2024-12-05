package InterfaceDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("*************My teaching career journey****************");
        SchoolOfNation nations = new SchoolOfNation();
        nations.setLocation("Kenya");
        nations.setNameofSchool("School of the Nations");
        nations.setRole("Intern teachers of physics and mathematics.");
        nations.setSalary(0);
        nations.setTenure(8);
        nations.aboutSchool();
        System.out.println("#-----------------------------------------------------#");

        GitegaIntSchool gitega = new GitegaIntSchool();
        gitega.setLocation("Burundi");
        gitega.setRole("Teacher of physics and mathematics.");
        gitega.setSalary(37000);
        gitega.setTenure(20);
        gitega.setNameofSchool("Gitega International School");
        gitega.aboutSchool();
        System.out.println("#-----------------------------------------------------#");

        KitengelaIntSchool kitengela = new KitengelaIntSchool();
        kitengela.setNameofSchool("Kitengela International School");
        kitengela.setLocation("Kenya");
        kitengela.setRole("Teachers of physics and mathematics.");
        kitengela.setTenure(14);
        kitengela.setSalary(50000);
        kitengela.aboutSchool();
        System.out.println("#-----------------------------------------------------#");

        KinderworldIntSchool kinderworld = new KinderworldIntSchool();
        kinderworld.setLocation("Kenya");
        kinderworld.setNameofSchool("Kinderworld International School");
        kinderworld.setRole("Teacher of physics and mathematics.");
        kinderworld.setTenure(30);
        kinderworld.setSalary(106000);
        kinderworld.aboutSchool();
        System.out.println("#-----------------------------------------------------#");

        StChristopherIntSchool christopher = new StChristopherIntSchool();
        christopher.setNameofSchool("St.Christopher's International School");
        christopher.setLocation("kenya");
        christopher.setTenure(4);
        christopher.setSalary(116000);
        christopher.setRole("Teacher of physics and mathematics.");
        christopher.aboutSchool();
        System.out.println("#-----------------------------------------------------#");

        MooltripakdeeIntSchool mooltripakdee = new MooltripakdeeIntSchool();
        mooltripakdee.setNameofSchool("Mooltripakdee Internation School");
        mooltripakdee.setLocation("Thailand");
        mooltripakdee.setRole("Teacher of physics and mathematics.");
        mooltripakdee.setSalary(250000);
        mooltripakdee.setTenure(6);
        mooltripakdee.aboutSchool();
        System.out.println("#----------------------**END**--------------------------#");
    }
}
