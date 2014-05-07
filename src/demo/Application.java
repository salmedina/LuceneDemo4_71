package demo;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String indexPath = "/home/zal/IndexTest/Index";
		String vwPath = "/home/zal/IndexTest/VW";
		Indexer mIndexer = new Indexer(indexPath);
		try {
			mIndexer.buildIndex(vwPath, ".vw");
			SearchEngine goog = new SearchEngine(indexPath);
			goog.performSearch("17 17 17");
		}
		catch(IOException e) {
			
		} catch (org.apache.lucene.queryparser.classic.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
