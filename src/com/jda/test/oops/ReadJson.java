package com.jda.test.oops;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.test.logic.Utility;

/**Read a JSON file and print the valuation of a product.
 * @author 1022772
 *
 */
public class ReadJson {
	public static Utility utility = new Utility();
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		
		String fileLocation = "C:\\\\Users\\\\1022772\\\\git\\\\JavaTest\\\\jsonData.json";
		System.out.println("Enter Product : ");
		String product = new String();
		product = utility.inputString().toLowerCase();
		
		//Read JSON file and create JSON Object
		Object obj = new JSONParser().parse(new FileReader(fileLocation));
		JSONObject jsonObj =(JSONObject)obj;
		
		//Check if product exists, return if it doesn't
		if(!jsonObj.containsKey(product)) {
			System.out.println("Doesn't contain any such product");
			return ;
		}
		
	
		// If product contains varieties, cerate JSON Array
		if(jsonObj.get(product).getClass().getName()=="org.json.simple.JSONArray") {
			
			JSONArray productArray = (JSONArray)jsonObj.get(product);
			handleVariety(productArray, product);
			
		}
		else {
			JSONObject productObj = (JSONObject)jsonObj.get(product);
			Integer price = Integer.parseInt((String)productObj.get("price"));
			Integer quantity = Integer.parseInt((String)productObj.get("weight"));
			System.out.println("Valuation of " + product + " is : " + price*quantity );
		}
		//Check if product contains multiple varieties
		
		
		 
		
	}

	/**Searches whether a product variety exists in 
	 * a JSONArray or not.
	 * If present, print the valuation of product.
	 * @param productArray
	 * @param product
	 * 
	 */
	private static void handleVariety(JSONArray productArray, String product) {
		
		String variety = new String();
		System.out.println("Enter " + product + " Variety : ");
		variety = utility.inputString().toLowerCase();		
		
		//Check if Variety exists
		for(int i=0;i<productArray.size();i++) {
			JSONObject arrayObj = (JSONObject) productArray.get(i);
			if(arrayObj.get("name").equals(variety)) {
				Integer price = Integer.parseInt((String)arrayObj.get("price"));
				Integer quantity = Integer.parseInt((String)arrayObj.get("weight"));
				System.out.println("Valuation of " + variety + " is : " + price*quantity );
				return;
			}
		}
		System.out.println("Variety doesn't exist");
		return;
	}		
}	
