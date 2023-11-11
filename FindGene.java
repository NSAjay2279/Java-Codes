import edu.duke.*;
import java.io.*;

public class FindGene {
	public static String gene(String dna) {
		int start = dna.indexOf("atg");
		int stop = dna.indexOf("taa", start+3);
		String result = dna.substring(start,stop+3);
		return result;
	}

	
public static void main(String[] args) {
	String dna = "cccatggggtttaaataataataggagagagagagagagttt";
	System.out.println(gene(dna));	
	}
}
