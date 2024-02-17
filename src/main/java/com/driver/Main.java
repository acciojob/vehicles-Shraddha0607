//package com.driver;

//public class Main {
//    public static void main(String[] args) {
//        F1 mercedes = new F1("mercedes", false);
//        mercedes.move(40, 0);
//        mercedes.accelerate(20);
//        mercedes.accelerate(-60);
//    }
//}

package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", 4, 4, 6, false, "Race Car", 1, false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
}