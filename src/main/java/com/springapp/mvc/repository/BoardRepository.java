package com.springapp.mvc.repository;

import com.springapp.mvc.domain.Board;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yoyojyv
 * Date: 2013. 11. 1.
 * Time: 오전 11:43
 * To change this template use File | Settings | File Templates.
 */
public interface BoardRepository extends CrudRepository<Board, Long> {

  Board findById(Long id);

  List<Board> findAll();

}
