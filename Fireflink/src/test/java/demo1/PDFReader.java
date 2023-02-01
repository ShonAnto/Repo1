package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

public class PDFReader {
    @Test
	public void test() throws IOException, SAXException, TikaException {
       BodyContentHandler contentHandler= new BodyContentHandler();
       
       FileInputStream fis = new FileInputStream("./src/test/resources/TestData/0_SHON ANTONY.pdf");
       
       Metadata metadata= new Metadata();
       
       ParseContext parseContext=new ParseContext();
       
       PDFParser pdfparser= new PDFParser();
       
       pdfparser.parse(fis, contentHandler, metadata, parseContext);
       
       System.out.println(contentHandler.toString());
       
       
	}

}
