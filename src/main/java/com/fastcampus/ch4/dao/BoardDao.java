package com.fastcampus.ch4.dao;

import com.fastcampus.ch4.domain.BoardDto;

import java.util.List;
import java.util.Map;

public interface BoardDao {
    BoardDto select(Integer bno) throws Exception;

    int delete(Integer bno, String writer) throws Exception // int delete(String statement, Object parameter)
    ;

    int insert(BoardDto dto) throws Exception;
    int update(BoardDto dto) throws Exception;

    List<BoardDto> selectPage(Map map) throws Exception;
    List<BoardDto> selectAll() throws Exception;
    int deleteAll() throws Exception;
    int count() throws Exception;

    int increaseViewCnt(Integer bno) throws Exception // int update(String statement, Object parameter)
    ;
}
