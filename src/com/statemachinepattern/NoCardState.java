package com.statemachinepattern;

public class NoCardState implements ATMState {
    private ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted. Please enter PIN.");
        atmMachine.setState(atmMachine.getHasCardState());
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Please insert your card first.");
    }

    @Override
    public void requestMoney(int amount) {
        System.out.println("Please insert your card first.");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card to eject.");
    }
}
