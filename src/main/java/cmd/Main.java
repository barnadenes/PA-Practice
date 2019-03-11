package cmd;

import api.XmlLoader;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       /* XmlLoader xml = new XMLparser();
        System.out.println(xml.kaja("Food.xml"));*/

       XmlLoader xml = new XmlLoader();
        System.out.println(xml.getMeat());
        System.out.println(xml.getVegetable());
    }
}
