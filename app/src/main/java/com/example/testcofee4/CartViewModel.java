package com.example.testcofee4;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class CartViewModel extends ViewModel {
    // The number of espresso
    private MutableLiveData<Integer> numberOfEspresso;
    // The number of caramel
    private MutableLiveData<Integer> numberOfCaramel;
    // The number of ice coffee
    private MutableLiveData<Integer> numberOfIceCoffee;
    // The price of espresso
    private int priceOfEspresso = 120;
    // The price of caramel
    private int priceOfCaramel = 450;
    //price of ice coffee
    private int priceOfIceCoffee = 240;
    // The total amount
    private MutableLiveData<Integer> totalAmount;

    // Initialize the data
    public CartViewModel() {
        numberOfEspresso = new MutableLiveData<>(0);
        numberOfCaramel = new MutableLiveData<>(0);
        numberOfIceCoffee = new MutableLiveData<>(0);
        totalAmount = new MutableLiveData<>(0);
    }

    // Getters for the data
    public MutableLiveData<Integer> getNumberOfEspresso() {
        return numberOfEspresso;
    }
    public MutableLiveData<Integer> getNumberOfCaramel() {
        return numberOfCaramel;
    }
    public MutableLiveData<Integer> getNumberOfIceCoffee(){return numberOfIceCoffee;}
    public int getPriceOfEspresso() {
        return priceOfEspresso;
    }
    public int getPriceOfCaramel() {
        return priceOfCaramel;
    }
    public int getPriceOfIceCoffee(){ return priceOfIceCoffee;}
    public MutableLiveData<Integer> getTotalAmount() {
        return totalAmount;
    }
    // Methods to update the data
    // Increase the number of espresso by one and update the total amount
    public void addEspresso() {
        numberOfEspresso.setValue(numberOfEspresso.getValue() + 1);
        totalAmount.setValue(numberOfEspresso.getValue() * priceOfEspresso + numberOfCaramel.getValue() * priceOfCaramel +
                numberOfIceCoffee.getValue() * priceOfIceCoffee);
    }
    // Decrease the number of espresso by one and update the total amount
    public void removeEspresso() {
        if (numberOfEspresso.getValue() > 0) {
            numberOfEspresso.setValue(numberOfEspresso.getValue() - 1);
            totalAmount.setValue(numberOfEspresso.getValue() * priceOfEspresso + numberOfCaramel.getValue() * priceOfCaramel +
                    numberOfIceCoffee.getValue() * priceOfIceCoffee);
        }
    }

    // Increase the number of ice coffee by one and update the total amount
    public void addCaramel() {
        numberOfCaramel.setValue(numberOfCaramel.getValue() + 1);
        totalAmount.setValue(numberOfEspresso.getValue() * priceOfEspresso + numberOfCaramel.getValue() * priceOfCaramel +
                numberOfIceCoffee.getValue() * priceOfIceCoffee);
    }
    // Decrease the number of ice coffee by one and update the total amount
    public void removeCaramel() {
        if (numberOfCaramel.getValue() > 0) {
            numberOfCaramel.setValue(numberOfCaramel.getValue() - 1);
            totalAmount.setValue(numberOfEspresso.getValue() * priceOfEspresso + numberOfCaramel.getValue() * priceOfCaramel +
                    numberOfIceCoffee.getValue() * priceOfIceCoffee);
        }
    }


    // Increase the number of ice coffee by one and update the total amount
    public void addIceCoffee() {
        numberOfIceCoffee.setValue(numberOfIceCoffee.getValue() + 1);
        totalAmount.setValue(numberOfEspresso.getValue() * priceOfEspresso + numberOfCaramel.getValue() * priceOfCaramel +
                             numberOfIceCoffee.getValue() * priceOfIceCoffee);
    }
    // Decrease the number of ice coffee by one and update the total amount
    public void removeIceCoffee() {
        if (numberOfIceCoffee.getValue() > 0) {
            numberOfIceCoffee.setValue(numberOfIceCoffee.getValue() - 1);
            totalAmount.setValue(numberOfEspresso.getValue() * priceOfEspresso + numberOfCaramel.getValue() * priceOfCaramel +
                    numberOfIceCoffee.getValue() * priceOfIceCoffee);
        }
    }
}