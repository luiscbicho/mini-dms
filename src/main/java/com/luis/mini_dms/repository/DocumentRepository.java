package com.luis.mini_dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luis.mini_dms.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Long>{

}
