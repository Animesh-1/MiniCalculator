public class UnitTests {
    public static void main(String[] args) {
        // array list test
        addFiveTest();
        autoIncrementFiveTest();
        clearTest();
        trimTest();
        //calculator test
        multiplyBy3Test();
        divideBy3();
        divideBy0();
    }

    public static void multiplyBy3Test(){
        MiniCalculator calculator = new MiniCalculator();
        calculator.multiply(3);
        if(calculator.calculate() != 3){
            System.out.println("FAILED MULTIPLY BY 3");
        }
        else {
            System.out.println("SUCCESS MULTIPLY BY 3");
        }
    }
    public static void divideBy3(){
        MiniCalculator calculator = new MiniCalculator();
        calculator.divide(3);
        // 0 because we are working with ints
        if(calculator.calculate() != 0){
            System.out.println("FAILED DIVIDE BY 3");
        }
        else {
            System.out.println("SUCCESS DIVIDE BY 3");
        }
    }
    public static void divideBy0(){
        MiniCalculator calculator = new MiniCalculator();
        calculator.divide(0);
        // divide by 0 is handled as = 0 in calculator.java
        if(calculator.calculate() != 0){
            System.out.println("FAILED DIVIDE BY 0");
        }
        else {
            System.out.println("SUCCESS DIVIDE BY 0");
        }
    }

    public static void trimTest() {
        MyVector<Integer> bar = new MyVector(10);
        bar.add(2);
        bar.add(5);
        bar.trimToSize();
        if (bar.getCapacity() != 2) {
            System.out.println("FAILED TRIM");
        }
        else {
            System.out.println("SUCCESS TRIM");
        }
    }

    public static void clearTest() {
        MyVector<Integer> bar = new MyVector();
        bar.add(2);
        bar.add(5);
        bar.clear();
        if ((Integer)bar.get(0) != null) {
            System.out.println("FAILED CLEAR");
        }
        else {
            System.out.println("SUCCESS CLEAR");
        }
    }

    public static void addFiveTest() {
        MyVector<Integer> bar = new MyVector(5);
        for (int i = 0; i < 5; i++) {
            bar.add(i);
        }
        if ((Integer)bar.get(4) != 4) {
            System.out.println("FAILED ADD FIVE");
        }
        else {
            System.out.println("SUCCESS ADD FIVE");
        }
    }
    public static void autoIncrementFiveTest(){
        MyVector<Integer> bar = new MyVector(5);
        for (int i = 0; i < 10; i++) {
            bar.add(i);
        }
        if ((Integer)bar.get(9) != 9) {
            System.out.println("FAILED AUTO INCREMENT FIVE");
        }
        else {
            System.out.println("SUCCESS AUTO INCREMENT FIVE");
        }
    }

}
