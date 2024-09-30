package Enum;


enum Membership {

    Free(5, 8),
    Basic (12,7),
    Pro(24,2);

    private final int tier;
    private  final int monthsValidity;


    // Constructor to initialize the field
    Membership(int tier,int monthsValidity) {
        this.tier = tier;
        this.monthsValidity = monthsValidity;
    }

    public int getTier() {
        return tier;
    }

    public int getMonthsValidity() {
        return monthsValidity;
    }



}

public class Main {

    // Defining an enum with fields, methods, and constructor
    enum Level {
        LOW(1), MEDIUM(2), HIGH(3);

        private final int levelCode;

        // Constructor
        Level(int levelCode) {
            this.levelCode = levelCode;
        }

        // Getter method
        public int getLevelCode() {
            return this.levelCode;
        }
    }

    public static void main(String[] args) {
//        // Accessing enum constants and methods
//        Level currentLevel = Level.MEDIUM;
//
//        System.out.println("Current Level: " + currentLevel);
//        System.out.println("Level Code: " + currentLevel.getLevelCode());
//
//        // Iterate through the enum values
//        for (Level level : Level.values()) {
//            System.out.println("Level: " + level + ", Code: " + level.getLevelCode());
//        }


        Membership m = Membership.Basic;
       System.out.println(m.getMonthsValidity());


    }
}

