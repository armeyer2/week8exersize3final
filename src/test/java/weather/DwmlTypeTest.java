package weather;

import org.junit.Test;
import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.plaf.nimbus.State;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import static org.junit.Assert.*;

public class DwmlTypeTest {


    @Test
    public void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();

        String result = binding.latLonListZipCode("53711");
        //assertEquals("Result did not match expected value", "???", result);

        // create JAXB context and initializing Marshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);

                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();


                // this will create Java object - country from the XML file
                DwmlType object = (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(result));

                assertEquals("43.0798,-89.3875", object.getLatLonList());
    }

}