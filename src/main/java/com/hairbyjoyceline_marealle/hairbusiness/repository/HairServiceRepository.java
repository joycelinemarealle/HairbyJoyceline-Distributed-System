package com.hairbyjoyceline_marealle.hairbusiness.repository;


import com.hairbyjoyceline_marealle.hairbusiness.entity.HairService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HairServiceRepository extends JpaRepository<HairService,Long> {
}
