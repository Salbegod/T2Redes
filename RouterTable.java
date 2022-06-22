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

    public void addElement(RouterTableElement e) {
        this.elements.add(e);
    }

    public int getIndexByIp(String ip){
        for (RouterTableElement element : elements) {
            if (element.getDestination() == ip ) {
                return elements.indexOf(element);
            }
        }
        return -1;
    }

    public ArrayList<RouterTableElement> getAllElements(){
        return this.elements;
    }

    @Override
    public String toString() {
        return 
            " elements=" + getAllElements() + "";
    }


}