package weather;

import org.junit.Test;
import java.io.File;
import java.util.ArrayList;
import javax.swing.plaf.nimbus.State;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import static org.junit.Assert.*;

public class DwmlTypeTest {

    @Test
    public void getLatLonList() {
        DwmlType result = new DwmlType();
        String actualResult = result.getLatLonList();
        assertEquals("I dont know", actualResult);
    }

    @Test
    public void getVersion() {
       /* try {

            // create JAXB context and initializing Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            DwmlType result = new DwmlType();
            String actualResult = result.getLatLonList();

            // this will create Java object - country from the XML file
            DwmlType object = (DwmlType) jaxbUnmarshaller.unmarshal(actualResult);

            System.out.println("Version: " + object.getVersion());


        } catch (JAXBException e) {
            // some exception occured
            e.printStackTrace();
        }*/

    }
}