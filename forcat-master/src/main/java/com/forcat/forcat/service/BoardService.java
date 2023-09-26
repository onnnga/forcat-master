package com.forcat.forcat.service;

import com.forcat.forcat.dto.BoardDTO;
import com.forcat.forcat.dto.PageRequestDTO;
import com.forcat.forcat.dto.PageResponseDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
