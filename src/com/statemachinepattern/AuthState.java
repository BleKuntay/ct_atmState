package com.statemachinepattern;

public class AuthState implements ATMState {
    private ATMMachine atmMachine;

    public AuthState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card has been entered");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("PIN has been entered");
    }

    @Override
    public void requestMoney(int amount) {
        if (amount <= atmMachine.getMoney()) {
            System.out.println("Dispense money $" + amount);
            atmMachine.setMoney(atmMachine.getMoney() - amount);
            atmMachine.setState(atmMachine.getNoCardState());
        } else {
            System.out.println("Insufficient balance");
            atmMachine.setState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void ejectCard() {
        System.out.println("Card is removed");
        atmMachine.setState(atmMachine.getNoCardState());
    }
}
