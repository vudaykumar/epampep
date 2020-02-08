package com.epam.GiftAnalysis;

public class GulabJamun extends Sweets{
	public GulabJamun(Integer weight, Integer price) {
        super("GulabJamun", weight, price);
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.name;
    }

    @Override
    public Integer getPrice() {
        // TODO Auto-generated method stub
        return super.price;
    }

    @Override
    public Integer getWeight() {
        // TODO Auto-generated method stub
        return super.weight;
    }

    @Override
    public void addWeight(Integer weight) {
        super.weight += weight;
    }

    @Override
    public void addPrice(Integer price) {
        super.price += price;
    }
}
