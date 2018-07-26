package com.jda.test.logic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ManageInventory {
	Utility utility = new Utility();
	public JSONObject insertProduct(JSONObject jsonObject, String inputProduct) {
		
		//If product exists, enter variety
		if(jsonObject.containsKey(inputProduct)){
			return insertInJsonArray(jsonObject, inputProduct);
		}
		
		//If product doesn't exist
		InventoryType2 newProduct = new InventoryType2();
		newProduct = createNewProductType2();
		jsonObject.put(inputProduct, newProduct);
		return jsonObject;
		// TODO Auto-generated method stub
		
	}

	private InventoryType2 createNewProductType2() {
		
		InventoryType2 newProduct = new InventoryType2();
		System.out.println("Enter price : ");
		int price = utility.inputPositiveInteger();
		newProduct.setPrice(price);
		
		System.out.println("Enter Quantity : ");
		int quantity = utility.inputPositiveInteger();
		newProduct.setQuantity(quantity);
		return newProduct;
	}

	private JSONObject insertInJsonArray(JSONObject jsonObject, String inputProduct) {
		
		Inventory newProduct = new Inventory();
		JsonUtil  jsonUtil = new JsonUtil();
		System.out.println("Enter name of variety : ");
		String name = utility.inputString();
		newProduct.setName( name);
		
		System.out.println("Enter price : ");
		int price = utility.inputPositiveInteger();
		newProduct.setPrice(price);
		
		System.out.println("Enter Quantity : ");
		int quantity = utility.inputPositiveInteger();
		newProduct.setQuantity(quantity);
		
		//String resultJson = jsonUtil.convertJavaToJson(newProduct);
		//System.out.println(resultJson);
		//Add variety to jsonArray
		JSONArray updatedArray = new JSONArray();
		updatedArray.add(newProduct);
		//System.out.println(updatedArray);
		JSONArray jsonArray = (JSONArray) jsonObject.get(inputProduct);
		
		//add elements to updatedJSONArray
		for(int i=0;i<jsonArray.size();i++) {
			JSONObject tempObj = new JSONObject();
			tempObj = (JSONObject) jsonArray.get(i);
			updatedArray.add(tempObj);
		}
		
		
		//Update jsonObject
		jsonObject.remove(inputProduct);
		
		//System.out.println("After removing rice : " + jsonObject);
		jsonObject.put(inputProduct, updatedArray);
		//System.out.println("Final jsonObject" + jsonObject);
		return jsonObject;
		
	}

	public JSONObject deleteProduct(JSONObject jsonObject, String productName) {
		
		//If product doesn't exist.
		if(!jsonObject.containsKey(productName)){
			System.out.println("Product does't exist.");
			return jsonObject;
		}
		
		//If product exists and contains varieties.
		if(jsonObject.get(productName).getClass().getName()=="org.json.simple.JSONArray"){
			return deleteInJsonArray(jsonObject, productName);
		}
		
		//If product exists and doesn't contain varieties
		jsonObject.remove(productName);
		return jsonObject;
	}

	private JSONObject deleteInJsonArray(JSONObject jsonObject, String productName) {
		
		System.out.println("Enter variety name :");
		String variety = utility.inputString();
		JSONArray jsonArray = (JSONArray) jsonObject.get(productName);
		
		//Iterate over varieties
		for(int i=0;i<jsonArray.size();i++){
			JSONObject obj = (JSONObject) jsonArray.get(i);
			
			//If variety exists in the product.
			if(obj.get("name").equals(variety)){
				jsonArray.remove(i);
				System.out.println("Product removed.");
				jsonObject.put(productName, jsonArray);
				System.out.println(jsonObject);
				return jsonObject;
			}
		}
		//variety doesn't exist in the product.
		System.out.println("Variety doesn't exist.");
		return jsonObject;
		
	}
}
