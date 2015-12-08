package com.madwithinsanity.repositories;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.madwithinsanity.IngestionApplication;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = IngestionApplication.class)
public class FileRepositoryTest {

	@Autowired
	FileRepository fileRepository;

	@Test
	public void fileSaveTest() throws IOException {
		File file = new File("src/test/resources/testFile.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		String id = fileRepository.storeFile(IOUtils.toByteArray(fileInputStream), "testFile.txt");
		TestCase.assertNotNull(id);
		
		fileRepository.getFile(id);
	}
}
