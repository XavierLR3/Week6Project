
public class Card {

	private int value; // 2-14, where 11-14 represent Jack, Queen, King, Ace
    private String name; // e.g. "Ace of Diamonds"

    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void describe() {
        System.out.println(name + " (value: " + value + ")");
    }
}