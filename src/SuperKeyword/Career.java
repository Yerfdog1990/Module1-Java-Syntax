package SuperKeyword;

public class Career {
    public void profession(){
        System.out.println("My first career was teaching.");
    }
}
class SwitchCareer extends Career{
    @Override
    public void profession() {
        System.out.println("My second career was software development.");
    }
    //Method to call super class and child class profession method
    public void careerJourney(){
        // The super keyword calls the
        // profession() method of the parent
        super.profession();
        profession();
    }
    //Main method
    public static void main(String[] args) {
        SwitchCareer switchCareer = new SwitchCareer();
        switchCareer.careerJourney();
    }
}