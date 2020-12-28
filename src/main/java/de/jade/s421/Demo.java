package de.jade.s421;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import iho.s421.gml.DatasetType;

public class Demo {

    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance("iho.s421.gml");

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File file = new File("S-421_Ver05/TestData/RTE-TEST-GFULL.s421.gml"); 
        JAXBElement<?> jaxbElement = (JAXBElement<?>) unmarshaller.unmarshal(file);
        
        DatasetType s421DataSet = (DatasetType)jaxbElement.getValue();

        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(s421DataSet, System.out);
    }

}