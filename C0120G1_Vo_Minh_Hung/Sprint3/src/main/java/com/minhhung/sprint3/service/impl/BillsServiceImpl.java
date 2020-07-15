package com.minhhung.sprint3.service.impl;

import com.minhhung.sprint3.model.Bills;
import com.minhhung.sprint3.repository.BillsRepository;
import com.minhhung.sprint3.service.BillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillsServiceImpl implements BillsService {
    @Autowired
    private BillsRepository billsRepository;

    @Override
    public Page<Bills> findAllByDeleteFlagIsNull(Pageable pageable) {
        return billsRepository.findAllByDeleteFlagIsNull(pageable);
    }

    @Override
    public List<Bills> findAllByDeleteFlagIsNull() {
        return billsRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public Bills findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        return billsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
    }

    @Override
    public void save(Bills bills) {
        billsRepository.save(bills);
    }

    @Override
    public void remove(Integer id) {
        Bills bills = billsRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        bills.setDeleteFlag(1);
        billsRepository.save(bills);
    }
}
