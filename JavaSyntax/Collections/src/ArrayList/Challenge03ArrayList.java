package ArrayList;

import java.util.ArrayList;

public class Challenge03ArrayList {
        public static ArrayList<String> waitingEmployees = new ArrayList<>();
        public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

        public static void initEmployees() {
            waitingEmployees.add("Doc");
            waitingEmployees.add("Grumpy");
            waitingEmployees.add("Happy");
            waitingEmployees.add("Sleepy");
            waitingEmployees.add("Bashful");
            waitingEmployees.add("Sneezy");
            waitingEmployees.add("Dopey");
        }

        public static void main(String[] args) {
            initEmployees();
        }

        public static void paySalary(String name) {
            if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
                alreadyGotSalaryEmployees.add(name);
                for (int i = 0; i < waitingEmployees.size(); i++) {
                    if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
                        waitingEmployees.set(i, null);
                        break;
                    }
                }
            }
        }
    }

