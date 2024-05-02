package Lesson_18;

import java.util.concurrent.atomic.AtomicInteger;

public class StringBuilderBuffer {
    public static void main(String[] args) {

        AtomicInteger atomicInt = new AtomicInteger(0);

        atomicInt.incrementAndGet();

        boolean updated = atomicInt.compareAndSet(1, 1234);

        System.out.println("Atomic Integer Value: " + atomicInt.get());
        System.out.println("Update successful: " + updated);


    }
}
