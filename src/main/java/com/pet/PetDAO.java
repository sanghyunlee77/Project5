package com.pet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetDAO {
    @Autowired
    SqlSession sqlSession;

    public List<PetVO> getPetList(){
        List<PetVO> list = sqlSession.selectList("Pet.getPetList");
        return list;
    }
}
