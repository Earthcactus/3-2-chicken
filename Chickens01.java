public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here

        //Start value
        int eggsPerChicken = 4;
        int chickenCount = 8;

        //Monday
        int totalEggs = eggsPerChicken * chickenCount;

        //Tuesday
        chickenCount += 1;
        totalEggs += eggsPerChicken * chickenCount;

        //Wednesday
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;

        System.out.println(totalEggs);
    }   
}
