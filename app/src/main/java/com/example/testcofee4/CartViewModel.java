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
    // The number of hot choco
    private MutableLiveData<Integer> numberOfHotChoco;
    // The number of mixed black
    private MutableLiveData<Integer> numberOfMixedBlack;
    // The number of espresso2
    private MutableLiveData<Integer> numberOfEspresso2;
    // The price of espresso
    private int priceOfEspresso = 120;
    // The price of caramel
    private int priceOfCaramel = 450;
    //price of ice coffee
    private int priceOfIceCoffee = 240;
    // The price of hot choco
    private int priceOfHotChoco = 300;
    // The price of mixed black
    private int priceOfMixedBlack= 350;
    // The price of espresso2
    private int priceOfEspresso2 = 200;
    // The total amount
    private MutableLiveData<Integer> totalAmount;

    // Initialize the data
    public CartViewModel() {
        numberOfEspresso = new MutableLiveData<>(0);
        numberOfCaramel = new MutableLiveData<>(0);
        numberOfIceCoffee = new MutableLiveData<>(0);
        numberOfHotChoco = new MutableLiveData<>(0);
        numberOfMixedBlack = new MutableLiveData<>(0);
        numberOfEspresso2 = new MutableLiveData<>(0);
        totalAmount = new MutableLiveData<>(0);
    }

    //////////////////////// Getters for the data/////////////////////////////////////////////////
    public MutableLiveData<Integer> getNumberOfEspresso() {
        return numberOfEspresso;
    }
    public MutableLiveData<Integer> getNumberOfCaramel() {
        return numberOfCaramel;
    }
    public MutableLiveData<Integer> getNumberOfIceCoffee(){return numberOfIceCoffee;}
    public MutableLiveData<Integer> getNumberOfHotChoco(){return numberOfHotChoco;}
    public MutableLiveData<Integer> getNumberOfMixedBlack(){return numberOfMixedBlack;}
    public MutableLiveData<Integer> getNumberOfEspresso2(){return numberOfEspresso2;}
    public int getPriceOfEspresso() {
        return priceOfEspresso;
    }
    public int getPriceOfCaramel() {
        return priceOfCaramel;
    }
    public int getPriceOfIceCoffee(){ return priceOfIceCoffee;}
    public int getPriceOfHotChoco(){return priceOfHotChoco;}
    public int getPriceOfMixedBlack(){return priceOfMixedBlack;}
    public int getPriceOfEspresso2(){return priceOfEspresso2;}
    public MutableLiveData<Integer> getTotalAmount() {
        return totalAmount;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////// Methods to update the data///////////////////////////////////
    ////////////Increase the number of espresso by one and update the total amount/////////////////
    public void addEspresso() {
        numberOfEspresso.setValue(numberOfEspresso.getValue() + 1);
        totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
    }
    /////////Decrease the number of espresso by one and update the total amount/////////////////////
    public void removeEspresso() {
        if (numberOfEspresso.getValue() > 0) {
            numberOfEspresso.setValue(numberOfEspresso.getValue() - 1);
            totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                    (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                    (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
        }
    }

    //////////////Increase the number of ice coffee by one and update the total amount////////////////
    public void addCaramel() {
        numberOfCaramel.setValue(numberOfCaramel.getValue() + 1);
        totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
    }
    ///////////Decrease the number of ice coffee by one and update the total amount/////////////////
    public void removeCaramel() {
        if (numberOfCaramel.getValue() > 0) {
            numberOfCaramel.setValue(numberOfCaramel.getValue() - 1);
            totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                    (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                    (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
        }
    }


    /////////// Increase the number of ice coffee by one and update the total amount////////////////////
    public void addIceCoffee() {
        numberOfIceCoffee.setValue(numberOfIceCoffee.getValue() + 1);
        totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
    }
    ///////////Decrease the number of ice coffee by one and update the total amount//////////////////////
    public void removeIceCoffee() {
        if (numberOfIceCoffee.getValue() > 0) {
            numberOfIceCoffee.setValue(numberOfIceCoffee.getValue() - 1);
            totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                    (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                    (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
        }
    }

    ////////////Increase the number of hotchoco by one and update the total amount/////////////////
    public void addHotChoco() {
        numberOfHotChoco.setValue(numberOfHotChoco.getValue() + 1);
        totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
    }
    /////////Decrease the number of espresso by one and update the total amount/////////////////////
    public void removeHotChoco() {
        if (numberOfHotChoco.getValue() > 0) {
            numberOfHotChoco.setValue(numberOfHotChoco.getValue() - 1);
            totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                    (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                    (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
        }
    }

    ////////////Increase the number of mixed black by one and update the total amount/////////////////
    public void addMixedBlack() {
        numberOfMixedBlack.setValue(numberOfMixedBlack.getValue() + 1);
        totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
    }
    /////////Decrease the number of mixed black by one and update the total amount/////////////////////
    public void removeMixedBlack() {
        if (numberOfMixedBlack.getValue() > 0) {
            numberOfMixedBlack.setValue(numberOfMixedBlack.getValue() - 1);
            totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                    (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                    (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
        }
    }

    ////////////Increase the number of espresso2 by one and update the total amount/////////////////
    public void addEspresso2() {
        numberOfEspresso2.setValue(numberOfEspresso2.getValue() + 1);
        totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
    }
    /////////Decrease the number of espresso2 by one and update the total amount/////////////////////
    public void removeEspresso2() {
        if (numberOfEspresso2.getValue() > 0) {
            numberOfEspresso2.setValue(numberOfEspresso2.getValue() - 1);
            totalAmount.setValue( (numberOfEspresso.getValue() * priceOfEspresso) + (numberOfCaramel.getValue() * priceOfCaramel) +
                    (numberOfIceCoffee.getValue() * priceOfIceCoffee) + (numberOfHotChoco.getValue() * priceOfHotChoco)+
                    (numberOfMixedBlack.getValue()*priceOfMixedBlack)+(numberOfEspresso2.getValue()*priceOfEspresso2));
        }
    }
}