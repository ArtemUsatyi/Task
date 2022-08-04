package Booking;

public class Room {
    private int numberOfPeople;
    private int priceRoom;
    private boolean freeRoom;

    public Room(int numberOfPeople, int priceRoom, boolean freeRoom) {
        this.numberOfPeople = numberOfPeople;
        this.priceRoom = priceRoom;
        this.freeRoom = freeRoom;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(int priceRoom) {
        this.priceRoom = priceRoom;
    }

    public boolean isFreeRoom() {
        return freeRoom;
    }

    public void setFreeRoom(boolean freeRoom) {
        this.freeRoom = freeRoom;
    }
}
