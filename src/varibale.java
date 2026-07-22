public class varibale {

        // Static variable (stored in Method Area)
        static int staticVar = 100;

        // Instance variable (stored in Heap as part of object)
        String instanceVar = "Instance Variable";

        public void showStorage() {
            // Local variable (stored in Stack)
            int localVar = 50;

            // Reference variable (stack holds reference, object in heap)
            String localString = new String("Hello Heap");

            System.out.println("=== Memory Storage Demo ===");

            // Local primitive
            System.out.println("Local primitive (stack): " + localVar);

            // Local reference
            System.out.println("Local reference (stack) -> Object in heap: " + localString);
            System.out.println("Heap object identity hash: " + System.identityHashCode(localString));

            // Instance variable
            System.out.println("Instance variable (heap): " + instanceVar);
            System.out.println("Heap object identity hash: " + System.identityHashCode(instanceVar));

            // Static variable
            System.out.println("Static variable (method area): " + staticVar);
        }

        public static void main(String[] args) {

            varibale obj = new varibale();

            System.out.println("Object reference (stack) -> Object in heap: " + obj);
            System.out.println("Heap object identity hash: " + System.identityHashCode(obj));

            obj.showStorage();
        }

}
