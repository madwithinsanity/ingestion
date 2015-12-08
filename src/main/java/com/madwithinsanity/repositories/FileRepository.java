package com.madwithinsanity.repositories;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Repository;

import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSFile;

@Repository
public class FileRepository {

	@Autowired
	private GridFsTemplate template;

	public String storeFile(byte[] bytes, String filename) {
		InputStream input = new ByteArrayInputStream(bytes);
		GridFSFile response = template.store(input, filename);
		return response.getId().toString();
	}

	public InputStream getFile(String id) {
		GridFSDBFile response = template.findOne(new Query(Criteria.where("Id").is(id)));
		return response.getInputStream();
	}
}
