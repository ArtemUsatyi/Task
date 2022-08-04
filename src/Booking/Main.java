package Booking;

public class Main {
    public static void main(String[] args) {
        Bill billKent = new Bill(1000);
        Client clientKent = new Client("Kent", "Barby", "+911", "@mail.ru", billKent);

        Bill bigBoss = new Bill(10);
        Client clientBoss = new Client("Boos", "Big", "+777", "777@mail.ru", bigBoss);

        Room[] moscowHotelRoom = new Room[]{
                new Room(1, 300, true),
                new Room(2, 500, true),
                new Room(3, 900, true)
        };
        Hotel moscowHotel = new Hotel("Moscow", moscowHotelRoom);

        Room[] saintPetersburgHotelRoom = new Room[]{
                new Room(1, 550, true),
                new Room(2, 650, true),
                new Room(3, 990, true)
        };
        Hotel saintPetersburgHotel = new Hotel("Saint Petersburg", saintPetersburgHotelRoom);

        BookingService bookingService = new BookingService();
        bookingService.book(moscowHotel, clientBoss, 2);
    }
}
