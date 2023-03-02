package com.example.springboot.back.customer.controller;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@CrossOrigin
@RestController
public class CustomerController {
    
    // private final BoardService boardService;

    // @GetMapping("/board/list")
    // public List<BoardDto> boardList() { return boardService.getBoardList(); }

    // @GetMapping("/board/{id}")
    // public BoardDto getBoard(@PathVariable Long id) {
    //     return boardService.getBoard(id);
    // }

    // @PostMapping("/board")
    // public Board create(@RequestBody BoardDto boardDto) {
    //     return boardService.create(boardDto);
    // }

    // // @PatchMapping("/board")
    // // public Board update(@RequestBody BoardDto boardDto) {
    // //     return boardService.update(boardDto);
    // // }

    // // @DeleteMapping("/board/{id}")
    // // public void delete(@PathVariable Long id) {
    // //     boardService.delete(id);
    // // }
}
