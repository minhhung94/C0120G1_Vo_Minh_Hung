package com.minhhung.sprint3.repository;

import com.minhhung.sprint3.model.Goods;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods,Integer> {

    List<Goods> findAllByDeleteFlagIsNull();

    Page<Goods> findAllByDeleteFlagIsNull(Pageable pageable);

    Goods findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
