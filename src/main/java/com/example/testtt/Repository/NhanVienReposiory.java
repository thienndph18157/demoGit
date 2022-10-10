package com.example.testtt.Repository;


import com.example.testtt.Model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhanVienReposiory extends JpaRepository<NhanVien,Integer> {

}
