package com.forcat.forcat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.forcat.forcat.domain.Board;
import com.forcat.forcat.repository.search.BoardSearch;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {


}
