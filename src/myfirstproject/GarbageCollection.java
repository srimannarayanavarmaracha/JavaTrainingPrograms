package myfirstproject;

public class GarbageCollection {
	
	 public GarbageCollection(String name) {
	        System.out.println(name + " object created");
	    }

	    @Override
	    protected void finalize() {
	        System.out.println("Object is garbage collected");
	    }

	    public static void main(String[] args) {
	        GarbageCollection obj1 = new GarbageCollection("obj1");
	        obj1 = null;
	        GarbageCollection obj2 = new GarbageCollection("obj2");
	        obj2 = new GarbageCollection("obj2 reassigned");

	        new GarbageCollection("Anonymous object");

	        System.gc();

	}

}


