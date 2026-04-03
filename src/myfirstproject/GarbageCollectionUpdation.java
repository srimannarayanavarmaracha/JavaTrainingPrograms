package myfirstproject;

import java.lang.ref.Cleaner;

public class GarbageCollectionUpdation implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();

    private final String name;
    private final Cleaner.Cleanable cleanable;

    // Static nested class (no reference to outer object)
    static class State implements Runnable {
        private final String name;

        State(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("Cleaning up: " + name);
        }
    }

    public GarbageCollectionUpdation(String name) {
        this.name = name;
        this.cleanable = cleaner.register(this, new State(name));
        System.out.println(name + " object created");
    }

    @Override
    public void close() {
        System.out.println("Manual cleanup: " + name);
        cleanable.clean(); // Explicit cleanup
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== 1. Try-with-resources (Best Practice) ===");
        try (GarbageCollectionUpdation obj = new GarbageCollectionUpdation("Resource Object")) {
            System.out.println("Using resource...");
        } 

        System.out.println("\n=== 2. Nullifying reference ===");
        GarbageCollectionUpdation obj1 = new GarbageCollectionUpdation("obj1");
        obj1 = null;

        System.out.println("\n=== 3. Reassigning reference ===");
        GarbageCollectionUpdation obj2 = new GarbageCollectionUpdation("obj2");
        obj2 = new GarbageCollectionUpdation("obj2 reassigned");

        System.out.println("\n=== 4. Anonymous object ===");
        new GarbageCollectionUpdation("Anonymous object");

        System.out.println("\n--- Suggesting Garbage Collection ---");
        System.gc();

        Thread.sleep(2000);

        System.out.println("=== End of main ===");
    }
}