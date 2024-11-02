package com.statemachinepattern;

public class ATMMachine {
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState authState;
    private ATMState currentState;
    private int money;

    public ATMMachine(int money) {
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        authState = new AuthState(this);
        currentState = noCardState;
        this.money = money;
    }

    public void setState(ATMState state) {
        currentState = state;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getAuthState() {
        return authState;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void requestMoney(int amount) {
        currentState.requestMoney(amount);
    }

    public void ejectCard() {
        currentState.ejectCard();
    }
}
