package com.madwithinsanity.repositories;

import java.io.File;
import java.io.IOException;

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
	FileRepositoryImpl fileRepository;

	@Test
	public void fileSaveTest() throws IOException {
		File file = new File("src/test/resources/testFile.txt");
		String id = fileRepository.save(file);
		TestCase.assertNotNull(id);
	}

	@Test
	public void testAddFindAndDelete() throws IOException {
		File testFile = new File("src/test/resources/testFile.txt");
		String id = fileRepository.save(testFile);
		TestCase.assertNotNull(fileRepository.findOne(id));
		fileRepository.delete(id);
		TestCase.assertNull(fileRepository.findOne(id));
	}
}
