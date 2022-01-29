package com.sample.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.sample.domain.BoardVO;
import com.sample.persistence.BoardDAO;

//Service : 유지보수와 로직프로세스를 유연하게 처리하기 위한 중간 단계.

@Repository
public class BoardServiceImpl implements BoardService {
	
	
	@Inject
	  private BoardDAO dao;
	
	@Override
	public void regist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
		//return null;
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
		//return null;
	}
}