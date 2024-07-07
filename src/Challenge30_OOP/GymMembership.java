package Challenge30_OOP;
/*
Write a Java program to create a class called "GymMembership"
with attributes for member name, membership type, and duration.
Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access.
Implement methods to calculate membership fees and check for special offers based on membership type.
 */

public class GymMembership {
    //Instances of the class
    private String name;
    private String membershipType;
    private int duration;

    //Constructor
    public GymMembership() {

    }
    //Getter
    public String getName() {
        return name;
    }
    //Setter
    public void setName(String name) {
        this.name = name;
    }
    //Getter
    public String getMembershipType() {
        return membershipType;
    }
    //Setter
    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
    //Getter
    public int getDuration() {
        return duration;
    }
    //Setter
    public void setDuration(int duration) {
        this.duration = duration;
    }
    //Methods to calculate membership fee
    public void CalculateMembershipFee(String trainee, int membershipFee, int time){
        this.name = trainee;
        this.duration = time;
        int fee = membershipFee * time;
        System.out.println(String.format("Name: %s; \nTraining duration: %d hour(s) a week; \nMembership fee: $%d.", trainee, time, fee));
        membershipType = (fee > 50)? "bronze": "silver category.";
        System.out.println(String.format("%s belongs to %s category.", trainee, membershipType));
    }

    //Subclass
        public static class PremiumMembership{
        String available;
        String accessible;
        public String isPremiumMember(String day){
            this.available = day;
            String present = accessible;
            if(day.equals("Monday")){
                present = "Tom";
                System.out.println(String.format("Your trainer will be %s.", present));
            } else if (day.equals("Tuesday")) {
                present = "John";
                System.out.println(String.format("Your trainer will be %s.", present));
            } else if (day.equals("Wednesday")) {
                present = "George";
                System.out.println(String.format("Your trainer will be %s.", present));
            } else if (day.equals("Thursday")) {
                present = "Benedict";
                System.out.println(String.format("Your trainer will be %s.", present));
            } else if (day.equals("Friday")) {
                present = "Cyril";
                System.out.println(String.format("Your trainer will be %s.", present));
            }else{
                System.out.println("We do not work on weekends. Choose a week day.");
            }
            return null;
        }
    }
    //Main method
    public static void main(String[] args) {
        GymMembership member = new GymMembership();
        member.CalculateMembershipFee("Godfrey", 10, 10);

        PremiumMembership trainer = new PremiumMembership();
        trainer.isPremiumMember("Wednesday");
    }

}
