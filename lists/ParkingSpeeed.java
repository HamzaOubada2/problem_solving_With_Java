public class ParkingSpeeed {
    public static void main(String[] args) {
        int[] speedCars = { 90, 130, 110, 145, 100, 125, 80, 200 };
        int limit = 120;

        int count = 0;
        for (int j = 0; j < speedCars.length; j++) {
            if (speedCars[j] > limit) {
                count++;
                System.out.println("Speed: " + speedCars[j]);
            }
        }
        System.out.println(count + " cars are speeding!");
    }
}

/*
 * Next problem! 🎯
 * 
 * You work at a parking 🚗
 * You have a list of car speeds
 * Find how many cars are speeding (speed > 120)
 * And print their speeds!
 * 
 * javaInput: [90, 130, 110, 145, 100, 125, 80]
 * limit = 120
 * Output:
 * 3 cars are speeding!
 * Speeds: 130, 145, 125
 */