package ru.job4j.poly;

public interface Transport {
    void ride();

    default void passengers(int numbers) {

    }

    int fuel( int count);
}
