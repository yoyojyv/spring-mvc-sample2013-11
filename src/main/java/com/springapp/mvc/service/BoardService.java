package com.springapp.mvc.service;

import com.springapp.mvc.domain.Board;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yoyojyv
 * Date: 2013. 11. 1.
 * Time: 오전 1:26
 * To change this template use File | Settings | File Templates.
 */
public interface BoardService {

  public Board findById(Long id);

  public List<Board> findAll();

  public void save(Board board);

}
