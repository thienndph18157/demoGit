package com.example.testtt.Controllers;

import com.example.testtt.Model.NhanVien;
import com.example.testtt.Repository.NhanVienReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class NhanVienController {
    @Autowired
    public NhanVienReposiory nhanVienReposiory;


    @GetMapping("/listnv")
    public String  list(Model model){
        List<NhanVien> list = nhanVienReposiory.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "nhanvien/list";
    }
    @GetMapping("/createnv")
    public String create(@ModelAttribute("nhanVien")NhanVien NhanVien, Model model){
        model.addAttribute("ACTION","/store");
        return "nhanvien/create";
    }

    @PostMapping("/store")
    public String store(@ModelAttribute("nhanVien") NhanVien nhanVien, Model model){
        nhanVienReposiory.save(nhanVien);
        return "redirect:/listnv";
    }
    @GetMapping("/edit/{Id}")
    public String edit (@PathVariable(name = "Id") int id, @ModelAttribute("nhanVien")NhanVien nhanvien, Model model){
        model.addAttribute("ACTION","/store");
        System.out.println(id);
        NhanVien nhanVien = nhanVienReposiory.getById(id);
        model.addAttribute("nhanVien",nhanVien);
        return "nhanvien/create";
    }
    @GetMapping("/delete/{Id}")
    public String delete (@PathVariable(name = "Id") int Id){
        nhanVienReposiory.deleteById(Id);
        return "redirect:/listnv";
    }

}
