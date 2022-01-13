package com.sample.persistence;

import java.util.List;

import com.sample.domain.BoardVO;

/*
DAO (Data Access Object) : 데이터 접근 객체
서비스 <-> DAO <-> Mapper
*/


public interface BoardDAO {

	public void create(BoardVO vo) throws Exception;

	public BoardVO read(Integer bno) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(Integer bno) throws Exception;

	public List<BoardVO> listAll() throws Exception;
}