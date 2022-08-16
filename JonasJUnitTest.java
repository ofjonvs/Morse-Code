package abc;

/*
 *Jonas JUnit class
 * 
 * @author Jonas da Silva
 *
 */

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JonasJUnitTest {
	
	File inputFile;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	   public void tearDown() throws Exception {
	   }
	
	@Test
	public void testConvertToEnglishString() {	
		String converter1 = MorseCodeConverter.convertToEnglish​("-.. .- .-.. . / .... .. --. --. .. -. ...");
		assertEquals("dale higgins",converter1);
	}
	
	@Test
	public void testConvertToEnglishFile() throws FileNotFoundException {   
		getFile("JonasTest.txt");
		String converter1 = MorseCodeConverter.convertToEnglish​(inputFile);
	    assertEquals("jonas da silva",converter1);
	}
	
	public void getFile(String in) throws FileNotFoundException {		
		JFileChooser chooser = new JFileChooser();
		int status;

		chooser.setDialogTitle("Select Input File - " + in);
		status = chooser.showOpenDialog(null);

		if(status == JFileChooser.APPROVE_OPTION)
		{
			try
			{
				inputFile = chooser.getSelectedFile();
				// readFile();
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				JOptionPane.showMessageDialog(null, "There is a problem with this file", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	@Test
	public void testMorseCodeTree() {
		MorseCodeTree testTree = new MorseCodeTree();
		ArrayList<String> testArrayList = new ArrayList<String>();
		testArrayList.add("h");
		testArrayList.add("s");
		testArrayList.add("v");
		testArrayList.add("i");
		testArrayList.add("f");
		testArrayList.add("u");
		testArrayList.add("e");
		testArrayList.add("l");
		testArrayList.add("r");
		testArrayList.add("a");
		testArrayList.add("p");
		testArrayList.add("w");
		testArrayList.add("j");
		testArrayList.add("");
		testArrayList.add("b");
		testArrayList.add("d");
		testArrayList.add("x");
		testArrayList.add("n");
		testArrayList.add("c");
		testArrayList.add("k");
		testArrayList.add("y");
		testArrayList.add("t");
		testArrayList.add("z");
		testArrayList.add("g");
		testArrayList.add("q");
		testArrayList.add("m");
		testArrayList.add("o");
		assertEquals(testTree.toArrayList(), testArrayList);
	}
	

}
