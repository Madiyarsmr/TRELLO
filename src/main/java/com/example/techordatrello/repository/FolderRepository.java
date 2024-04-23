package com.example.techordatrello.repository;

import com.example.techordatrello.model.Folders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folders,Long> {

}
