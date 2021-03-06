import java.util.ArrayList;

/**
 * Define uma tabela de roteamento
 */
public class RouterTable {

    private ArrayList<RouterTableElement> elements;


    public RouterTable() {
        this.elements = new ArrayList<RouterTableElement>();
    }


    public RouterTableElement getElement(int index) {
        return this.elements.get(index);
    }

    public void setElement(RouterTableElement e) {
        this.elements.add(e);
    }

}