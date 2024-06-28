package com.kodilla.patterns.strategy;

public class AggressivePredictor implements BuyPredictor{

    @Override
    public String predictWhatToBuy(){
        return "[Aggressive Predictor] Buy stock of XYZ";
    }
}
