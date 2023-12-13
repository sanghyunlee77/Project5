package com.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    PetDAO petDAO;
    public List<PetVO> getPetList(){
        return petDAO.getPetList();
    }
}
