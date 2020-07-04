package com.konstantinkochetov.beer.order.service.services;

import com.konstantinkochetov.brewery.model.CustomerPagedList;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

    CustomerPagedList listCustomers(Pageable pageable);

}
