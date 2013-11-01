package com.springapp.mvc.mapper

import com.springapp.mvc.domain.Board
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update

/**
 * Created with IntelliJ IDEA.
 * User: yoyojyv
 * Date: 2013. 11. 1.
 * Time: 오전 1:24
 * To change this template use File | Settings | File Templates.
 */
public interface BoardMapper {

  @Select("SELECT * FROM Board WHERE id = #{id}")
  Board findById(@Param("id") Long id)

  @Select("SELECT * FROM Board")
  List<Board> findAll()

  @Insert("""
    INSERT INTO Board
      SET
    subject = #{subject}, contents = #{contents}
  """)
  @Options(useGeneratedKeys = true, keyProperty = "id", flushCache = true)
  void insert(Board board);

  @Update("""
    UPDATE Board
      SET
    subject = #{subject}, contents = #{contents}
  """)
  @Options(flushCache = true)
  void update(Board board);

}