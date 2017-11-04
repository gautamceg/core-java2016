package fileProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileProcessor {

	public static void main(String[] args) {
		String fileName = "/cobalt/groupservice_fpoc_dittest.json";
		List<JsonVo> jsonVoList = readJsonFile(fileName);
		for(JsonVo jsonVo : jsonVoList){
			System.out.println(jsonVo);
		}
		
		//
		String targetFileName = "/cobalt/target.json";
		writeToJson(jsonVoList, targetFileName);
	}
	
	public static List<JsonVo> readJsonFile(String fileName){
		List<JsonVo> jsonVoList = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		try {
		/*** read from file ***/
		JsonParser jParser = mapper.getFactory().createParser(new File(fileName));
		jParser.nextToken();
		// loop until token equal to "}"
		while(jParser.nextToken()!= JsonToken.END_ARRAY){
			JsonVo jsonVo = mapper.readValue(jParser, JsonVo.class);
			jsonVoList.add(jsonVo);
		}
		
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonVoList;
	}
	
	public static void writeToJson(List<JsonVo> jsonVoList, String targetFileName){
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(targetFileName), jsonVoList);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Map<String,String> readCsv(String csvFile){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        Map<String,String> CsvDataMap = new HashMap<>();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] column = line.split(cvsSplitBy);
                
                System.out.println("Country [code= " + column[0] + " , name=" + column[1] + "]");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

		return null;
	}
}
