package com.madwithinsanity.repositories;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.madwithinsanity.IngestionApplication;
import com.madwithinsanity.entities.JobEntity;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = IngestionApplication.class)
public class JobRepositoryTest {

	@Autowired
	JobEntityRepository jobEntityRepository;

	@Test
	public void jobSaveTest() throws IOException {
		JobEntity job = new JobEntity();
		String id = jobEntityRepository.save(job).getId();
		TestCase.assertNotNull(id);
	}

	@Test
	public void testAddFindAndDelete() throws IOException {
		JobEntity job = new JobEntity();
		String id = jobEntityRepository.save(job).getId();
		TestCase.assertNotNull(jobEntityRepository.findOne(id));
		jobEntityRepository.delete(id);
		TestCase.assertNull(jobEntityRepository.findOne(id));
	}
}