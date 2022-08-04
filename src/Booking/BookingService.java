package Booking;

public class BookingService {
    public void book(Hotel hotel, Client client, int numberOfPeople) {
        Room[] rooms = hotel.getRooms();
        boolean isFreeRoom = false;
        for (Room r : rooms) if (r.isFreeRoom()) isFreeRoom = true;
        if (!isFreeRoom) {
            System.out.println("Свободных номеров в отеле " + hotel.getNameHotel() + " нет.");
        }
        boolean success = false;
        for (Room room : rooms) {

            if (room.getNumberOfPeople() == numberOfPeople) {
                success = true;

                if (room.getPriceRoom() <= client.getBill().getAmount()) {
                    client.getBill().setAmount(client.getBill().getAmount() - room.getPriceRoom());
                    room.setFreeRoom(false);
                    System.out.println("Цена номера " + room.getPriceRoom());
                    System.out.println("Номер был успешно забронирован - " + client.getName() + " " + client.getSurName());
                } else {
                    System.out.println("Недостаточно денег на счете для бронирования номера " + client.getName());
                }
            }
        }
        if (!success) System.out.println("Подходящего номера нет " + client.getName());
    }
}
