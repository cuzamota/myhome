package com.godcoder.myhome.repository;

import com.godcoder.myhome.model.board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<board, Long> {
}
