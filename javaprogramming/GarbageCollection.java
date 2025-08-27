package stringClass_MemoryModel;

/* GC automatically clears unreachable objects (no active references).
System.gc() is just a request — JVM decides whether to honor it.

*Lifecycle Phases:

1. Object creation (new)

2. Use (method call, access)

3. Dereference (obj = null)

4. Finalization (optional)

5. GC (reclaim memory)
*/

class Test {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }
}
public class GarbageCollection {
	    public static void main(String[] args) {
	        Test t = new Test();
	        t = null;
                          // Finalization
	        System.gc(); // Suggests JVM to run garbage collector
	    }
}