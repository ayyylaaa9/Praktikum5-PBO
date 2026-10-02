/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugaspraktikum.modul5;

/**
 *
 * @author Noer Afdila
 */
public class MainDiary {
    public static void main(String[] args) {

        BukuHarian diary = new BukuHarian("Ayla");

        // Menambahkan Catatan Pertama
        // diary.tulisCatatan(
        //     "01-10-2026",
        //     "Hari ini mengikuti kegiatan perkuliahan PBO dan mengerjakan beberapa tugas."
        // );

        // Menambahkan Catatan Kedua
        // diary.tulisCatatan(
        //     "02-10-2026",
        //     "Hari ini belajar DAA tentang Divide dan Conquere."
        // );

        // Membaca seluruh catatan
        diary.bacaCatatan();
    }
}