package string;

import org.apache.commons.io.FilenameUtils;

/**
 * Created by gargg on 24/11/16.
 */
public class SplitDemo {
    public static void main(String[] args) {
        prepareArchiveFilePath("/cobalt/dealerdataextract/archive/sample_gmit_file.csv");

    }
    public static String prepareArchiveFilePath(String filePath){
		String basefilePath = FilenameUtils.getBaseName(filePath);
		String fileExtension = FilenameUtils.getExtension(filePath);
		System.out.println(basefilePath);
		System.out.println(fileExtension);
		
		return filePath;
	}
}
