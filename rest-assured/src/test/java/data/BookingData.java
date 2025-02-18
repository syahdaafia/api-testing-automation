package data;

import org.testng.annotations.DataProvider;

public class BookingData {
    @DataProvider(name = "createTokenData")
    public static Object [][] createTokenData() {
        return new Object[][]{
                {"admin", "password123"}
        };
    }

    @DataProvider(name = "createBookingData")
    public static Object[][] createBookingData() {
        return new Object[][]{
                {"Jim", "Brown", 111, true, "2018-01-01", "2019-01-01", "Breakfast"},
                {"Sarah", "Smith", 222, false, "2023-05-01", "2023-05-10", "Dinner"},
                {"Michael", "Johnson", 333, true, "2024-12-01", "2024-12-05", "Lunch"}
        };
    }

    @DataProvider(name = "updateBookingData")
    public static Object[][] updateBookingData() {
        return new Object[][]{
                {"Syahda", "Afia", 777, false, "2025-01-01", "2025-01-01", "Blanket"},
                {"Zacky", "Abror", 555, false, "2025-02-01", "2025-02-02", "Pillow"}
        };
    }

    @DataProvider(name = "updatePartialBookingData")
    public static Object[][] updatePartialBookingData() {
        return new Object[][]{
                {"Ulhaq", null, null, null, null, null, null},
                {"Faishal", null, null, null, null, null, null}
        };
    }

    @DataProvider(name = "getBookingByParams")
    public static Object[][] getBookingByParams() {
        return new Object[][]{
                {"Faishal", "Abror"},
        };
    }
}
