package weather;

import org.junit.Test;

import static org.junit.Assert.*;

public class NdfdXMLBindingStubTest {

    @Test
    public void latLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub)new NdfdXMLLocator().getndfdXMLPort();

        String result = binding.latLonListZipCode("53711");

        assertEquals("Result did not match expected value", "???", result);
    }
}