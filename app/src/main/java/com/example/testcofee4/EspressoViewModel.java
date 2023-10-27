package com.example.testcofee4;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class EspressoViewModel extends ViewModel {
    // The number of espresso
    private MutableLiveData<Integer> numberOfEspresso;
    // The price of espresso
    private int priceOfEspresso = 120;
    // The total amount
    private MutableLiveData<Integer> totalAmount;

    // Initialize the data
    public EspressoViewModel() {
        numberOfEspresso = new MutableLiveData<>(0);
        totalAmount = new MutableLiveData<>(0);
    }

    // Getters for the data
    public MutableLiveData<Integer> getNumberOfEspresso() {
        return numberOfEspresso;
    }

    public int getPriceOfEspresso() {
        return priceOfEspresso;
    }

    public MutableLiveData<Integer> getTotalAmount() {
        return totalAmount;
    }

    // Methods to update the data
    // Increase the number of espresso by one and update the total amount
    public void addEspresso() {
        numberOfEspresso.setValue(numberOfEspresso.getValue() + 1);
        totalAmount.setValue(numberOfEspresso.getValue() * priceOfEspresso);
    }

    // Decrease the number of espresso by one and update the total amount
    public void removeEspresso() {
        if (numberOfEspresso.getValue() > 0) {
            numberOfEspresso.setValue(numberOfEspresso.getValue() - 1);
            totalAmount.setValue(numberOfEspresso.getValue() * priceOfEspresso);
        }
    }
}

