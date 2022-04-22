import java.util.ArrayList;
import java.util.List;

/**
 * Az üres mezőket megvalósító osztály, valamint ősosztálya az összes többi mezőnek.
 * Nyilvántartja a rajta álló virológusokat, valamint felelős a virológusok mozgásáért.
 * A mezőre lépő virológusok interaktálhatnak a mezővel.
 * Ez üres mező esetén nem jár semmilyen hatással, az osztály leszármazottai viszont felülírhatják ezt.
 */
public class Field {
	protected List<Virologist> virologists;
	protected List<Field> neighbors;

	public Field() {
		virologists = new ArrayList<>();
		neighbors = new ArrayList<>();
	}

	public List<Virologist> getVirologists() {
		return virologists;
	}

	public List<Field> getNeighbors() {
		return neighbors;
	}

	/**
	 * Felvesz egy virológust a mezőre.
	 * @param v - lépő virológus
	 */
	public void accept(Virologist v) {
		virologists.add(v);
	}

	/**
	 * Levesz egy virológust a mezőről.
	 * @param v - ellépő virológus
	 */
	public void remove(Virologist v) {
		virologists.remove(v);
	}

	/**
	 * A paraméterül kapott virológus interaktál a mezővel - üres mező esetén nincs hatása.
	 * @param v - mezővel interaktáló virológus
	 */
	public void interactWithField(Virologist v) {
		//do nothing
	}

	/**
	 * Beállítja a kapott mezőt a jelenlegi mező  megfelelő indexű szomszédjának.
	 * @param idx - szomszéd indexe
	 * @param f - a szomszéd
	 */
	public void setNeighbor(int idx, Field f) {
		neighbors.add(idx, f);
	}

	/**
	 * A paraméterként kapott virológus megfertőzi mezőn lévő összes virológust medvevírussal.
	 * @param v - a fertőző virológus
	 */
	public void smearAllVirologists(Virologist v){
		//TODO:
	}

	/**
	 * Elpusztítja az összes a mezőn található anyagot. Csak raktárak esetében van hatása.
	 */
	public void destroyResources(){
		//do nothing
	}

	/**
	 * Ez a metódus megadja, hogy a paraméterként megadott mező szomszédja-e ennek a mezőnek.
	 */
	public boolean isNeighbor(Field f) { return neighbors.contains(f); }
}
