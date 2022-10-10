package com.example.testtt.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "nhanvien")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class NhanVien {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;

    @Column(name = "tendem")
    private String tendem;

    @Column(name = "Ho")
    private String Ho;

    @Column(name = "gioitinh")
    private String gioitinh;

    @Column(name = "ngaysinh")
    private Date ngaysinh;

    @Column(name = "diachi")
    private String diachi;

    @Column(name = "Sdt")
    private String Sdt;

    @Column(name = "matkhau")
    private String matkhau;
//
//    @Column(name = "IdCH")
//    private int IdCH;
//
//    @Column(name = "IdCV")
//    private int IdCV;
//
//    @Column(name = "idguibc")
//    private int idguibc;

    @Column(name = "trangthai")
    private int trangthai;
}
