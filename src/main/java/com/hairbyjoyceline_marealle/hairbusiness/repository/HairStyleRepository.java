package com.hairbyjoyceline_marealle.hairbusiness.repository;


import com.hairbyjoyceline_marealle.hairbusiness.entity.HairStyle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HairStyleRepository extends JpaRepository<HairStyle,Long> {
}
