import com.statemachinepattern.ATMMachine;

public class Main {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine(1000);

        atm.insertCard();
        atm.enterPin(1234);
        atm.requestMoney(200);
        atm.ejectCard();
    }
}