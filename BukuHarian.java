/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugaspraktikum.modul5;

/**
 *
 * @author Noer Afdila
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
public class BukuHarian {
 // Atribut
    private String namaPemilik;
    private String namaFile;

    // Constructor
    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik + ".txt";
    }

    // Method untuk menulis catatan
    public void tulisCatatan(String tanggal, String isi) {
        try (FileWriter writer = new FileWriter(namaFile, true)) {

            writer.write("[" + tanggal + "] - " + isi);
            writer.write(System.lineSeparator());

            System.out.println("Catatan berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis catatan.");
        }
    }

    // Method untuk membaca catatan
    public void bacaCatatan() {
        File file = new File(namaFile);

        if (!file.exists() || file.length() == 0) {
            System.out.println("Belum ada catatan harian.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {

            String baris;

            System.out.println("\n=== CATATAN HARIAN " + namaPemilik.toUpperCase() + " ===");

            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca catatan.");
        }
    }
}