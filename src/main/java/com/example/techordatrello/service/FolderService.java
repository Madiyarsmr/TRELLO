package com.example.techordatrello.service;

import com.example.techordatrello.model.Folders;
import com.example.techordatrello.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class FolderService {

    @Autowired
    private FolderRepository folderRepository;
    public void addFolder(Folders folder){
        folderRepository.save(folder);
    }

    public List<Folders> getAllFolders(){
        return folderRepository.findAll();
    }
     public Folders getFolderById(Long id){
        return folderRepository.findById(id).orElse(null);
     }
}
