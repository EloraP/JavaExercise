package defaultPac;

public class ArrayEx {

	
	private static final String[] tensNames = {
			"",
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };

	private static final String[] numNames = {
			"",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };

	
	
	public static String parseToString(int input) {
		String temp;
		
		if(input <= 19) {
			return (numNames[input]);
		}
		else {
			
				int units = input % 10;
				int tenVal = (input % 100 - units)/10; 
				int hundreds = (input % 1000 - units - tenVal)/100;
				int thousands = (input % 10000 - units - tenVal - hundreds)/1000;
				
				int[] intArray = {thousands, hundreds, tenVal, units};
				String thouString = "", hundString = "", tenString = "", unitString = "";
				
				if(intArray[0] != 0) {
					thouString = numNames[intArray[0]].concat(" thousand");
				}
				
				if(intArray[1] != 0) {
					hundString = numNames[intArray[1]].concat(" hundred");
				}
				
				if(intArray[2] != 0 && intArray[2] >= 2) {
					
					tenString = tensNames[intArray[2]];
					unitString = numNames[intArray[3]];
				}
				else if(intArray[2] != 0 && intArray[2]< 2) {
					int num = intArray[2] * 10 + intArray[3];
					tenString = numNames[num];
					
				}else if(intArray[3] != 0) {
					unitString = numNames[intArray[3]];
				}
				
				System.out.println(unitString == "");
				
				if(unitString == "") {
					if(tenString == "") {
						if(hundString == "") {
							
							//just thousands
							return thouString;
						}else if(thouString == "") {
							
							//just hundreds
							return hundString;
						}
						else{
							
							//thousands and hundreds
							temp = thouString.concat(" and " + hundString);
							return temp;
						}
					}
					else if(hundString == "") {
						
						//just tens
						if(thouString == "") {
							return tenString;
						}
						else {
							//thousands and tens
							temp = thouString.concat(" and " + tenString);
							return temp;
						}
					}
					else{
						
						if(thouString == "") {
							
							//hundreds and tens
							temp = hundString.concat(" and " + tenString);
							return temp;
							
						}
						else {
							//thousands, hundreds and tens
							temp = thouString.concat(", " + hundString + " and " + tenString);
							return temp;
						}
					}
					
				}
				else if(thouString == "") {
					
				
					if(hundString == "") {
						if(tenString == "") {
							
							//just units
							return unitString; 
						}
						else {
							
							//tens and units
							temp = tenString.concat(unitString);
							return temp;
						}
					}
					else if (tenString == ""){


						
						//hundreds and units
						temp = hundString.concat(" and " + unitString);
						return temp;
					}
					
					else {
						
						//hundreds and tens and units
						temp = hundString.concat(" and " + tenString + " " + unitString);
						return temp;
					}
				}
				else if(tenString == "") {
					if(hundString == "") {
						
						//thousands and units
						temp = thouString.concat(" and " + unitString);
						return temp;
					}
					else {
						
						//thousands, hundreds and units
						temp = thouString.concat(", " + hundString + " and " + unitString);
						return temp;
					}
				}
				else {
					//thousands, hundreds, tens and units
					temp = thouString.concat(", " + hundString + " and " + tenString + " " + unitString);
					return temp;
				}
				
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		String output = parseToString(110).substring(1);
		
		System.out.println(output);
	}
}
