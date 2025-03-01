package com.test.service;

import com.test.model.FaceBook;
import com.test.repository.FaceBookRepository;

public class FaceBookService {

	public void faceBookRegistation(FaceBook fb) {
		FaceBookRepository fbr=new FaceBookRepository();
		fbr.saveDataToDB(fb);
		
		
	}
	

}
