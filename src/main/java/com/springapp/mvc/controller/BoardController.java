package com.springapp.mvc.controller;

import com.springapp.mvc.domain.Board;
import com.springapp.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
  public String view(@PathVariable Long id, Model model) {
    model.addAttribute("board", boardService.findById(id));
    return "board/view";
  }

  @RequestMapping("/board/edit/{id}")
  public String edit(@PathVariable Long id, Model model) {
    model.addAttribute("board", boardService.findById(id));
    return "board/edit";
  }

  @RequestMapping("/board/create")
  public String create(Model model) {
    return "board/create";
  }

  @RequestMapping(value = "/board/save", method = RequestMethod.POST)
  public String save(@Valid Board board, BindingResult bindingResult) {
    return "redirect:/board/list";
  }

}
