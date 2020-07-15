package com.minhhung.sprint3.repository;

import com.minhhung.sprint3.model.Bills;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillsRepository extends JpaRepository<Bills,Integer> {
    List<Bills> findAllByDeleteFlagIsNull();

    Page<Bills> findAllByDeleteFlagIsNull(Pageable pageable);

    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
