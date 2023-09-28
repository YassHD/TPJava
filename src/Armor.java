public class Armor extends Equipment {
    // les attribut
    private ArmorCategory category;

    private ArmorPiece armorPiece;

    enum ArmorCategory {
        LIGHT,
        MEDIUM,
        HEAVY
    }

    enum ArmorPiece {
        HELMET,
        CHESTPLATE,
        GAUNTLETS,
        LEGGINGS
    }


    //getter and setter generer automatiquement
    public ArmorCategory getCategory() {
        return category;
    }

    public void setCategory(ArmorCategory category) {
        this.category = category;
    }

    public ArmorPiece getArmorPiece() {
        return armorPiece;
    }

    public void setArmorPiece(ArmorPiece armorPiece) {
        this.armorPiece = armorPiece;
    }

    //constructeur
    public Armor(ArmorCategory category, ArmorPiece armorPiece) {
        super(category, armorPiece);
        this.category = category;
        this.armorPiece = armorPiece;
    }
}

