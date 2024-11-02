package com.statemachinepattern;

public class HasCardState implements ATMState {
    private ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct PIN. Please request money.");
            atmMachine.setState(atmMachine.getAuthState());
        } else {
            System.out.println("Incorrect PIN. Card will be ejected.");
            atmMachine.setState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestMoney(int amount) {
        System.out.println("Please enter PIN first.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atmMachine.setState(atmMachine.getNoCardState());
    }
}
