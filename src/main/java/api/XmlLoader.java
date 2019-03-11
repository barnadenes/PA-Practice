package api;

import api.Enums.Portion;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XmlLoader {

    private Element components;

    public XmlLoader() {
        try {
            File inputFile = new File("Food.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            components = (Element) doc.getElementsByTagName("Food").item(0);


        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public List<Meat> getMeat() {
        Element casesElement = (Element) components.getElementsByTagName("Meats").item(0);
        NodeList cases = casesElement.getElementsByTagName("Meat");
        List<Meat> result = new ArrayList<Meat>();
        Element current;
        for (int i = 0; i < cases.getLength(); i++) {
            current = (Element) cases.item(i);
            result.add(new Meat(current.getAttribute("name"),
                    current.getAttribute("foodType"),
                    Portion.valueOf(current.getAttribute("calories")),
                    Integer.parseInt(current.getAttribute("amount"))));
        }
        return result;
    }

    public List<Vegetable> getVegetable() {
        Element casesElement = (Element) components.getElementsByTagName("Vegetables").item(0);
        NodeList cases = casesElement.getElementsByTagName("Vegetable");
        List<Vegetable> result = new ArrayList<Vegetable>();
        Element current;
        for (int i = 0; i < cases.getLength(); i++) {
            current = (Element) cases.item(i);
            result.add(new Vegetable(current.getAttribute("name"),
                    current.getAttribute("foodType"),
                    Portion.valueOf(current.getAttribute("calories")),
                    Integer.parseInt(current.getAttribute("amount"))));
        }
        return result;
    }

    /*List<PowerSupply> getPsus() {
        Element psusElement = (Element) components.getElementsByTagName("PowerSupplies").item(0);
        NodeList psus = psusElement.getElementsByTagName("PowerSupply");
        List<PowerSupply> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < psus.getLength(); i++) {
            current = (Element) psus.item(i);
            result.add(new PowerSupply(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Integer.parseInt(current.getAttribute("powerConsumption")),
                    Integer.parseInt(current.getAttribute("performance"))));
        }
        return result;
    }

    List<Motherboard> getMotherboards() {
        Element motherboardsElement = (Element) components.getElementsByTagName("Motherboards").item(0);
        NodeList motherboards = motherboardsElement.getElementsByTagName("Motherboard");
        List<Motherboard> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < motherboards.getLength(); i++) {
            current = (Element) motherboards.item(i);
            result.add(new Motherboard(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Integer.parseInt(current.getAttribute("powerConsumption")),
                    Size.valueOf(current.getAttribute("size")),
                    current.getAttribute("socket"),
                    Integer.parseInt(current.getAttribute("amountOfSockets")),
                    current.getAttribute("memoryType"),
                    Integer.parseInt(current.getAttribute("amountOfMemorySlots")),
                    Integer.parseInt(current.getAttribute("amountOfPCIESlots")),
                    Integer.parseInt(current.getAttribute("amountOfSata"))));
        }
        return result;
    }

    List<CPU> getCpus() {
        Element cpusElement = (Element) components.getElementsByTagName("Processors").item(0);
        NodeList cpus = cpusElement.getElementsByTagName("Processor");
        List<CPU> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < cpus.getLength(); i++) {
            current = (Element) cpus.item(i);
            result.add(new CPU(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Integer.parseInt(current.getAttribute("powerConsumption")),
                    current.getAttribute("memoryType"),
                    Integer.parseInt(current.getAttribute("coreClock")),
                    Boolean.parseBoolean(current.getAttribute("overclockable")),
                    current.getAttribute("socket"),
                    Integer.parseInt(current.getAttribute("threads")),
                    Integer.parseInt(current.getAttribute("cores"))));
        }
        return result;
    }

    List<Heatsink> getHeatsinks() {
        Element heatsinksElement = (Element) components.getElementsByTagName("Heatsinks").item(0);
        NodeList heatsinks = heatsinksElement.getElementsByTagName("Heatsink");
        List<Heatsink> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < heatsinks.getLength(); i++) {
            current = (Element) heatsinks.item(i);
            result.add(new Heatsink(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Size.valueOf(current.getAttribute("size"))));
        }
        return result;
    }

    List<Fan> getFans() {
        Element fansElement = (Element) components.getElementsByTagName("Fans").item(0);
        NodeList fans = fansElement.getElementsByTagName("Fan");
        List<Fan> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < fans.getLength(); i++) {
            current = (Element) fans.item(i);
            result.add(new Fan(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Integer.parseInt(current.getAttribute("powerConsumption")),
                    Integer.parseInt(current.getAttribute("rpm")),
                    Integer.parseInt(current.getAttribute("airflow"))));
        }
        return result;
    }

    List<Memory> getMemories() {
        Element memoriesElement = (Element) components.getElementsByTagName("Memories").item(0);
        NodeList memories = memoriesElement.getElementsByTagName("Memory");
        List<Memory> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < memories.getLength(); i++) {
            current = (Element) memories.item(i);
            result.add(new Memory(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Integer.parseInt(current.getAttribute("powerConsumption")),
                    Integer.parseInt(current.getAttribute("speed")),
                    Integer.parseInt(current.getAttribute("capacity")),
                    current.getAttribute("type"),
                    Integer.parseInt(current.getAttribute("amountOfSticks"))));
        }
        return result;
    }

    List<GraphicsCard> getGpus() {
        Element gpusElement = (Element) components.getElementsByTagName("GraphicsCards").item(0);
        NodeList gpus = gpusElement.getElementsByTagName("GraphicsCard");
        List<GraphicsCard> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < gpus.getLength(); i++) {
            current = (Element) gpus.item(i);
            result.add(new GraphicsCard(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Integer.parseInt(current.getAttribute("powerConsumption")),
                    current.getAttribute("memoryType"),
                    Integer.parseInt(current.getAttribute("coreClock")),
                    Boolean.parseBoolean(current.getAttribute("overclockable")),
                    Integer.parseInt(current.getAttribute("vram")),
                    Size.valueOf(current.getAttribute("size"))));
        }
        return result;
    }

    List<SolidStateDrive> getSsds() {
        Element ssdsElement = (Element) components.getElementsByTagName("SolidStateDrives").item(0);
        NodeList ssds = ssdsElement.getElementsByTagName("SolidStateDrive");
        List<SolidStateDrive> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < ssds.getLength(); i++) {
            current = (Element) ssds.item(i);
            result.add(new SolidStateDrive(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Integer.parseInt(current.getAttribute("powerConsumption")),
                    Integer.parseInt(current.getAttribute("capacity")),
                    Integer.parseInt(current.getAttribute("transferSpeed"))));
        }
        return result;
    }

    List<HardDiskDrive> getHdds() {
        Element hddsElement = (Element) components.getElementsByTagName("HardDiskDrives").item(0);
        NodeList hdds = hddsElement.getElementsByTagName("HardDiskDrive");
        List<HardDiskDrive> result = new ArrayList<>();
        Element current;
        for (int i = 0; i < hdds.getLength(); i++) {
            current = (Element) hdds.item(i);
            result.add(new HardDiskDrive(current.getAttribute("name"),
                    current.getAttribute("manufacturer"),
                    Integer.parseInt(current.getAttribute("value")),
                    Tier.valueOf(current.getAttribute("tier")),
                    Integer.parseInt(current.getAttribute("powerConsumption")),
                    Integer.parseInt(current.getAttribute("capacity")),
                    Integer.parseInt(current.getAttribute("transferSpeed")),
                    Integer.parseInt(current.getAttribute("rpm"))));
        }
        return result;
    }*/

}