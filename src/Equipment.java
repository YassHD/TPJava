public class Equipment {
    public Equipment(Armor.ArmorCategory category, Armor.ArmorPiece armorPiece) {
    }

    // enumération Rarity
    protected enum Rarity {
        Common,
        Uncommon,
        Rare,
        VeryRare,
        Legendary
    }
    // déclaration des attributs
    protected Rarity rarity;
    protected String name;
    protected int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//contructeur
    Equipment(String name, Rarity rarity,int price){
        this.name ="bouclier";
        this.rarity = Rarity.Common;
        this.price =50;
    }
}