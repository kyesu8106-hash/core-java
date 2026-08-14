package com.basics;

class GarbageCollectorDemo {

    GarbageCollectorDemo() {
        System.out.println("Object Created");
    }

    protected void finalize() {
        System.out.println("Garbage Collector Destroyed the Object");
    }

    public static void main(String[] args) {
       
        GarbageCollectorDemo obj1 = new GarbageCollectorDemo();
        GarbageCollectorDemo obj2 = new GarbageCollectorDemo();
        GarbageCollectorDemo obj3 = new GarbageCollectorDemo();
        
        obj1 = null;
        obj2 = null;
        obj3 = null;
        
        System.gc();

        System.out.println("End of main method");
    }
}
