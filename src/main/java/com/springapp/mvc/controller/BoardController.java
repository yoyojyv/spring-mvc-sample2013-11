package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Board;
import com.springapp.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * User: yoyojyv
 * Date: 2013. 11. 1.
 * Time: 오전 1:29
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class BoardController {

  @Autowired
  private BoardService boardService;

  @RequestMapping("/board/list")
  public String list(Model model) {
    model.addAttribute("boardList", boardService.findAll());
    return "board/list";
  }

  @RequestMapping("/board/show/{id}")
  public String show(@PathVariable Long id, Model model) {
    model.addAttribute("board", boardService.findById(id));
    return "board/show";
  }

  @RequestMapping("/board/edit/{id}")
  public String edit(@PathVariable Long id, Model model) {
    model.addAttribute("board", boardService.findById(id));
    return "board/edit";
  }

  @RequestMapping("/board/create")
  public String create(@ModelAttribute Board board) {
    return "board/create";
  }

  @RequestMapping(value = "/board/save", method = RequestMethod.POST)
  public String save(@Valid Board board, BindingResult bindingResult) {
    boardService.save(board);
    return "redirect:/board/list";
  }

  @RequestMapping(value = "/board/delete", method = RequestMethod.POST)
  public String delete(@RequestParam Long id) {
    boardService.delete(id);
    return "redirect:/board/list";
  }

}
