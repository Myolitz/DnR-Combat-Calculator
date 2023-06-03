package Characters;
import java.util.Scanner;

public class Players {
    private String name;
    private int health;
    private int defense;
    private int mana;
    private int physDamage;
    private int magicDamage;
    private int magicDefense;
    private int strength;
    private int perception;
    private int constitution;
    private int charisma;
    private int intelligence;
    private int agility;
    private int luck;

    public Players(String userName) {
        name = userName;
        health = 20;
        defense = 10;
        mana = 15;
        physDamage = 0;
        magicDamage = 12;
        magicDefense = 0;
        strength = 0;
        perception = 0;
        constitution = 0;
        charisma = 0;
        intelligence = 0;
        agility = 0;
        luck = 0;
    }

    public void setStrength (int str) {
        this.strength = str;
        this.physDamage += (4 * str);
    }

    public void setPerception (int perc) {
        this.perception = perc;
    }

    public void setConstitution (int constitute) {
        this.constitution = constitute;
        this.health +=  (4 * constitute);
        this.defense += (2 * constitute);
    }

    public void setCharisma (int chr) {
        this.charisma = chr;
    }

    public void setIntelligence (int intel) {
        this.intelligence = intel;
        this.magicDamage += (2 * intel);
        this.magicDefense += (5 * intel);
        this.mana += (3 * intel);
    }

    public void setAgility (int agil){
        this.agility = agil;
    }

    public void setLuck (int userluck) {
        this.luck = userluck;
    }

    public void printCharacterInfo() {
        System.out.println("Name " + name);
        System.out.println("""
                Strength: """ + strength + """
                \nPerception: """ + perception + """
                \nConstitution: """ + constitution + """
                \nCharisma: """ + charisma + """
                \nIntelligence: """ + intelligence + """
                \nAgility: """ + agility + """
                \nLuck: """ + luck);
    }

    public void setStats(Scanner in) {
        System.out.println("Enter character's Strength:");
        int str = in.nextInt();
        setStrength(str);
        System.out.println("Enter character's Perception:");
        int perc = in.nextInt();
        setPerception(perc);
        System.out.println("Enter character's Consitution");
        int constitute = in.nextInt();
        setConstitution(constitute);
        System.out.println("Enter character's Charisma");
        int chr = in.nextInt();
        setCharisma(chr);
        System.out.println("Enter character's Intelligence");
        int intel = in.nextInt();
        setIntelligence(intel);
        System.out.println("Enter character's Agility");
        int agil = in.nextInt();
        setAgility(agil);
        System.out.println("Enter character's Luck");
        int luck = in.nextInt();
        setLuck(luck);
    }

    public String getName() {
        return this.name;
    }
}
