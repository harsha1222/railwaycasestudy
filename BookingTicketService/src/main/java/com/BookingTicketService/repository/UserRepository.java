package com.BookingTicketService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.BookingTicketService.entity.UserDetails;

public interface UserRepository extends MongoRepository<UserDetails, Integer>
{

}
