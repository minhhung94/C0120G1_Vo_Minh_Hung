package com.minhhung.sprint3.service;

import com.minhhung.sprint3.model.Bills;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BillsService {
    Page<Bills> findAllByDeleteFlagIsNull(Pageable pageable);
    List<Bills> findAllByDeleteFlagIsNull();
    Bills findAllByDeleteFlagIsNullAndIdIs(Integer id);

    void save(Bills bills);

    void remove(Integer id);
}
