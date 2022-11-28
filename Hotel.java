// J'utilise une classe public pour suivre la convention 
public class Hotel { 

    /*  Dans les attributs, l'encapsulation que je leur ai donné est private pour suivre la convention. 
    La portée de ces variables ne se modifiront pas à l'extérieur de la classe mais seulement au sein de cette classe.     
    */
    private int number;
    private int capacityMax;
   
   /* le constructeur permet de retourner une new valeur avec différents objets. Il ne retourne aucune valeur. */
    public Hotel(int number, int capacityMax) {
        this.number = number;
        this.capacityMax = capacityMax;
    }

    /* Dans les méthodes, j'utilise des getter et des setter permettant de changer/retourner des valeurs.
     * Ces méthodes permettent de faire fonctionner les objets.
     */
     public int getNumber() {
        return number;
    }
    /* J'utilise void car je n'ai pas encore définie le type de retour que je souhaite. */
    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacityMax() {
        return capacityMax;
    }

    public void setCapacityMax(int capacityMax) {
        this.capacityMax = capacityMax;
    }
}
