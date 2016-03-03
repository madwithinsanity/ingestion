package com.madwithinsanity.utilities;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ResourceUtilsImpl implements ResourceUtils {

	private static final Logger logger = Logger.getLogger(ResourceUtilsImpl.class);

	private String resourceDir;

	public String getDirectory() {
		if (resourceDir == null) {
			resourceDir = "C:/testDirectory/";
			logger.debug("resourceDir is set to : " + resourceDir);
		}
		return resourceDir;
	}
}