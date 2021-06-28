package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void passengers(int numbers) {
    }

    @Override
    public void ride() {

    }

    @Override
    public int fuel(int count) {
        int price = count * 35;
        return price;
    }
}
