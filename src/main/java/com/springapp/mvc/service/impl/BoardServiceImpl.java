package com.springapp.mvc.service.impl;

import com.springapp.mvc.domain.Board;
import com.springapp.mvc.mapper.BoardMapper;
import com.springapp.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yoyojyv
 * Date: 2013. 11. 1.
 * Time: 오전 1:27
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BoardServiceImpl implements BoardService {

  @Autowired
  private BoardMapper boardMapper;

  @Override
  @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
  public Board findById(Long id) {
    return boardMapper.findById(id);
  }

  @Override
  @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
  public List<Board> findAll() {
    return boardMapper.findAll();
  }

  @Override
  @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
  public void save(Board board) {

    if (board.getId() != null && board.getId() > 0) {
      boardMapper.update(board);
//      Board origin = boardMapper.findById(board.getId());
//      if (origin != null) {
//        origin.setSubject(board.getSubject());
//        origin.setContents(board.getContents());
//
//        boardMapper.update(board);
//      }

    } else {
      boardMapper.insert(board);
    }

  }

  @Override
  @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
  public void delete(Long id) {
    boardMapper.deleteById(id);
  }
}
