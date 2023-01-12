package transport;

public class Automobile {
    public static class Key {
        private final boolean keylessAccess;
        private final boolean remoteEngineStart;

        public Key(boolean keylessAccess, boolean remoteEngineStart) {
                this.keylessAccess = keylessAccess;
                this.remoteEngineStart = remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        @Override
        public String toString() {
            return "Key{" +
                    "keylessAccess=" + keylessAccess +
                    ", remoteEngineStart=" + remoteEngineStart +
                    '}';
        }
    }

    private final String BRAND;
    private final String MODEL;
    private double engineVolume;
    private String color;
    private final int YEAR;
    private final String COUNTRY;
    private String transmission;
    private final String BODY_TYPE;
    private String registrationNumber;
    private final int SEATS_COUNT;
    private boolean summerTires;
    private Key key;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_SEATS = 5;

    public Automobile(String BRAND, String MODEL, double engineVolume, String color, int YEAR, String COUNTRY,
                      String transmission, String BODY_TYPE, String registrationNumber, int SEATS_COUNT,
                      int month, Key key) {
        if (BRAND == null || BRAND.isBlank()) {
            this.BRAND = DEFAULT_VALUE;
        } else {
            this.BRAND = BRAND;
        }
        if (MODEL == null || MODEL.isBlank()) {
            this.MODEL = DEFAULT_VALUE;
        } else {
            this.MODEL = MODEL;
        }
        if (YEAR <= 0) {
            this.YEAR = DEFAULT_YEAR;
        } else {
            this.YEAR = YEAR;
        }
        if (COUNTRY == null || COUNTRY.isBlank()) {
            this.COUNTRY = DEFAULT_VALUE;
        } else {
            this.COUNTRY = COUNTRY;
        }
        if (BODY_TYPE == null || BODY_TYPE.isBlank()) {
            this.BODY_TYPE = DEFAULT_VALUE;
        } else {
            this.BODY_TYPE = BODY_TYPE;
        }
        if (SEATS_COUNT <= 0) {
            this.SEATS_COUNT = DEFAULT_SEATS;
        } else {
            this.SEATS_COUNT = SEATS_COUNT;
        }
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setSummerTires(summerTires);
        this.key = key;
        changeSummerTires(month);
    }

    public String getBRAND() {
        return BRAND;
    }
    public String getMODEL() {
        return MODEL;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public int getYEAR() {
        return YEAR;
    }
    public String getCOUNTRY() {
        return COUNTRY;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getBODY_TYPE() {
        return BODY_TYPE;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getSEATS_COUNT() {
        return SEATS_COUNT;
    }
    public boolean isSummerTires() {
        return summerTires;
    }
    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }
    public void setTransmission(String transmission) {
            if (transmission == null || transmission.isBlank()) {
                this.transmission = DEFAULT_VALUE;
            } else {
                this.transmission = transmission;
            }
        }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }
    public void changeSummerTires(int month) {
        setSummerTires(month >= 4 && month <= 10);
    }

    public Key getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "BRAND='" + BRAND + '\'' +
                ", MODEL='" + MODEL + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", YEAR=" + YEAR +
                ", COUNTRY='" + COUNTRY + '\'' + '\n' +
                ", transmission='" + transmission + '\'' +
                ", BODY_TYPE='" + BODY_TYPE + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", SEATS_COUNT=" + SEATS_COUNT +
                ", summerTires=" + summerTires + '\n' +
                ", key=" + key +
                '}';
    }
}

