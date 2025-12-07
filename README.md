# PAMDus (Perusahaan Air Minum Dusun)

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.0-green?style=for-the-badge&logo=spring-boot)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Templating-green?style=for-the-badge&logo=thymeleaf)

[![Java CI with Maven](https://github.com/hendrapaiton/pamdus/actions/workflows/maven.yml/badge.svg)](https://github.com/hendrapaiton/pamdus/actions/workflows/maven.yml)

**PAMDus** adalah sistem manajemen modern untuk Perusahaan Air Minum tingkat Dusun/Desa. Aplikasi ini dirancang untuk mendigitalisasi proses operasional PDAM skala kecil, mulai dari pencatatan meter hingga penanganan keluhan pelanggan, guna meningkatkan efisiensi dan transparansi layanan air bersih.

## 🌟 Fitur Utama

Sistem ini mencakup modul-modul esensial untuk operasional air minum:

- **📏 Pencatatan Meter**

  - Digitalisasi pencatatan meteran air pelanggan pengguna.
  - Akurasi data konsumsi air real-time.

- **💳 Tagihan Online**

  - Pembuatan dan pengecekan tagihan secara otomatis.
  - Memudahkan pelanggan melihat riwayat dan status pembayaran.

- **📢 Keluhan Pelanggan**

  - Saluran khusus untuk pelaporan gangguan atau kerusakan.
  - Tiket pelacakan status penanganan keluhan.

- **🗣️ Masukan Masyarakat**

  - Wadah aspirasi dan saran dari masyarakat untuk pengembangan layanan.

- **ℹ️ Informasi Layanan**
  - Portal berita dan pembaruan terkait layanan air minum (misal: jadwal pemeliharaan).

## 🛠️ Teknologi

Project ini dibangun menggunakan stack teknologi modern yang **robust** dan **scalable**:

- **Core Framework**: [Spring Boot 4.0.0](https://spring.io/projects/spring-boot)
- **Language**: Java 21 LTS
- **Template Engine**: [Thymeleaf](https://www.thymeleaf.org/)
- **Database**: H2 Database (In-Memory/File based untuk MVP)
- **Tools**:
  - [Lombok](https://projectlombok.org/) untuk mengurangi boilerplate code.
  - Spring Boot DevTools untuk pengalaman pengembangan yang cepat.
  - Maven untuk manajemen dependensi dan build.

## 🚀 Memulai (Getting Started)

Ikuti langkah-langkah berikut untuk menjalankan aplikasi di lingkungan lokal Anda.

### Prasyarat

- JDK 21 terinstals.
- Maven terinstal (atau gunakan `mvnw` bawaan).

### Instalasi & Menjalankan Aplikasi

1.  **Clone Repository**

    ```bash
    git clone https://github.com/hendrapaiton/pamdus.git
    cd pamdus
    ```

2.  **Jalankan Aplikasi**
    Menggunakan Maven Wrapper (Windows):

    ```powershell
    ./mvnw spring-boot:run
    ```

    Atau menggunakan Terminal (Linux/Mac):

    ```bash
    ./mvnw spring-boot:run
    ```

3.  **Akses Aplikasi**
    Buka browser dan kunjungi:
    `http://localhost:8080`

## 📂 Struktur Project

Struktur direktori utama project:

```
pamdus/
├── src/
│   ├── main/
│   │   ├── java/com/garugi/pamdus/  # Source code Java (Controller, Service, Repository)
│   │   └── resources/
│   │       ├── templates/           # File HTML Thymeleaf
│   │       ├── static/              # Aset Statis (CSS, JS, Images)
│   │       └── application.properties # Konfigurasi Spring Boot
├── analyze/                         # Dokumentasi Analisis Fitur & Bisnis
├── pom.xml                          # Konfigurasi Maven Dependensi
└── README.md                        # Dokumentasi Project
```

## 🤝 Kontribusi

Kontribusi sangat diterima! Silakan buat _Pull Request_ atau laporkan _Issue_ jika Anda menemukan bug atau memiliki ide fitur baru.

## 📄 Lisensi

Project ini dilisensikan di bawah [MIT License](LICENSE).

---

_Dibuat dengan ❤️ untuk kemajuan air bersih pedesaan._
