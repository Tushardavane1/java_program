// The base class for Continents
class Continent {
    private String name;

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// The subclass for Countries, inheriting from Continent
class Country extends Continent {
    private String countryName;

    public Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}

// The subclass for States, inheriting from Country
class State extends Country {
    private String stateName;

    public State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }
}

// The subclass for Places, inheriting from State
class Place extends State {
    private String placeName;

    public Place(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName, stateName);
        this.placeName = placeName;
    }

    public String getPlaceName() {
        return placeName;
    }
}

public class Main {
    public static void main(String[] args) {
        Place place = new Place("Asia","India","Maharastra","Ahemadnagar");
        
        System.out.println("Continent: " + place.getName());
        System.out.println("Country: " + place.getCountryName());
        System.out.println("State: " + place.getStateName());
        System.out.println("Place: " + place.getPlaceName());
    }
}
