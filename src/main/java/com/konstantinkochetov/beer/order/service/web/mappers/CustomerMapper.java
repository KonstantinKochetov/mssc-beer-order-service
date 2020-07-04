package com.konstantinkochetov.beer.order.service.web.mappers;

import com.konstantinkochetov.beer.order.service.domain.Customer;
import com.konstantinkochetov.brewery.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}
