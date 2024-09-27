package Enum;


enum Membership {

    Free( 8),
    Basic (7),
    Pro(2);

    private final int monthsValidity;

    // Constructor to initialize the field
    Membership(int tier,int monthsValidity) {
        this.monthsValidity = monthsValidity;
        this.tier= tier;
    }
}

public class Main {

    // Defining an enum with fields, methods, and constructor
    enum Level {
        LOW(1), MEDIUM(2), HIGH(3);

        private int levelCode;

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
        // Accessing enum constants and methods
        Level currentLevel = Level.MEDIUM;

        System.out.println("Current Level: " + currentLevel);
        System.out.println("Level Code: " + currentLevel.getLevelCode());

        // Iterate through the enum values
        for (Level level : Level.values()) {
            System.out.println("Level: " + level + ", Code: " + level.getLevelCode());
        }
    }
}

