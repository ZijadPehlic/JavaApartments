public class Apartment {
    private int apartID;
    private String owner;
    private int streetNum;
    private String state;
    private String city;
    private String address;
    private int sizeSqM;
    private int numOfRooms;
    private double avgRoomSize;
    private int numOfBedrooms;
    private int numOfLivingroooms;
    private int numOfToilets;
    private boolean hasCourtyard;
    private int courtyardSize;
    private boolean hasBalcony;
    private int balconySize;
    private boolean hasGarage;
    private int garageSize;
    private int sellPrice;

    public Apartment(int apartID, String owner, int streetNum, String state, String city, String address, int sizeSqM, int numOfRooms, double avgRoomSize, int numOfBedrooms, int numOfLivingroooms, int numOfToilets, boolean hasCourtyard, int courtyardSize, boolean hasBalcony, int balconySize, boolean hasGarage, int garageSize, int sellPrice) {
        this.apartID = apartID;
        this.owner = owner;
        this.streetNum = streetNum;
        this.state = state;
        this.city = city;
        this.address = address;
        this.sizeSqM = sizeSqM;
        this.numOfRooms = numOfRooms;
        this.avgRoomSize = (sizeSqM/numOfRooms);
        this.numOfBedrooms = numOfBedrooms;
        this.numOfLivingroooms = numOfLivingroooms;
        this.numOfToilets = numOfToilets;
        this.hasCourtyard = hasCourtyard;
        this.courtyardSize = courtyardSize;
        this.hasBalcony = hasBalcony;
        this.balconySize = balconySize;
        this.hasGarage = hasGarage;
        this.garageSize = garageSize;
        this.sellPrice = sellPrice;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartID=" + apartID +
                ", owner='" + owner + '\'' +
                ", streetNum=" + streetNum +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", sizeSqM=" + sizeSqM +
                ", numOfRooms=" + numOfRooms +
                ", avgRoomSize=" + avgRoomSize +
                ", numOfBedrooms=" + numOfBedrooms +
                ", numOfLivingroooms=" + numOfLivingroooms +
                ", numOfToilets=" + numOfToilets +
                ", hasCourtyard=" + hasCourtyard +
                ", courtyardSize=" + courtyardSize +
                ", hasBalcony=" + hasBalcony +
                ", balconySize=" + balconySize +
                ", hasGarage=" + hasGarage +
                ", garageSize=" + garageSize +
                ", sellPrice=" + sellPrice +
                '}';
    }
    // methods

    public void addBalcony(int sizeN){
        balconySize=sizeN;
        hasBalcony=true;
    }
    public void removeBalcony(){
        balconySize=0;
        hasBalcony=false;
    }
    public void addCourtyard(int sizeN){
        courtyardSize=sizeN;
        hasCourtyard=true;
    }
    public void removeCourtyard() {
        courtyardSize = 0;
        hasCourtyard = false;
    }
    public void addGarage(int sizeG) {
        garageSize=sizeG;
        hasGarage=true;
    }

    public void removeGarage() {
        garageSize = 0;
        hasGarage = false;
    }
    //getters and setters
    public boolean isHasCourtyard() {
        return hasCourtyard;
    }

    public void setHasCourtyard(boolean hasCourtyard) {
        this.hasCourtyard = hasCourtyard;
    }

    public int getCourtyardSize() {
        return courtyardSize;
    }

    public void setCourtyardSize(int courtyardSize) {
        this.courtyardSize = courtyardSize;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public int getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(int garageSize) {
        this.garageSize = garageSize;
    }

    public int getApartID() {
        return apartID;
    }

    public void setApartID(int apartID) {
        this.apartID = apartID;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSizeSqM() {
        return sizeSqM;
    }

    public void setSizeSqM(int sizeSqM) {
        this.sizeSqM = sizeSqM;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfLivingroooms() {
        return numOfLivingroooms;
    }

    public void setNumOfLivingroooms(int numOfLivingroooms) {
        this.numOfLivingroooms = numOfLivingroooms;
    }

    public int getNumOfToilets() {
        return numOfToilets;
    }

    public void setNumOfToilets(int numOfToilets) {
        this.numOfToilets = numOfToilets;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public int getBalconySize() {
        return balconySize;
    }

    public void setBalconySize(int balconySize) {
        this.balconySize = balconySize;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

}
