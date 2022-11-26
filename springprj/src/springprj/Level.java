package springprj;

public enum Level {
	BASIC(1), SILVER(2), GOLD(3); // ENUM 클래스의 인스턴스라 생각하기.

    private final int value;

    Level(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public static Level valueOf(int value) {
        switch (value) {
            case 1: return BASIC;
            case 2: return SILVER;
            case 3: return GOLD;
            default: throw new AssertionError("Unknown value" + value);
        }
    }
}


