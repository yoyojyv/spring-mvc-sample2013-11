package com.springapp.mvc.controller;

import com.springapp.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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



}
