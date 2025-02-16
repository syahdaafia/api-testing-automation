# restful-booker-api-testing
Collection Postman untuk pengujian API Restful-Booker dengan Newman

# 🏨 Restful Booker API Testing  

## 📌 Deskripsi  
Repository ini berisi koleksi pengujian API untuk **Restful Booker**, menggunakan **Postman** dan dieksekusi dengan **Newman**. Pengujian mencakup validasi berbagai skenario termasuk request valid, validasi token, serta pengambilan booking ID dengan berbagai kombinasi parameter.  

## 📂 Struktur Koleksi  
Koleksi **Restful-Booker Automation** memiliki tiga folder utama:  

### 1️⃣ Valid Request  
- Menguji seluruh flow API dari **create token, get booking, update (PUT & PATCH), hingga delete booking** dengan data valid.  

### 2️⃣ Create Token  
- Menguji endpoint `/auth` untuk **membuat token**, dengan berbagai kombinasi input (valid & invalid).  

### 3️⃣ Get Booking ID  
- Menguji endpoint `/booking` untuk **mengambil Booking ID** berdasarkan kombinasi parameter seperti `firstname`, `lastname`, `checkin`, dan `checkout`.  

---

## 🚀 Cara Menjalankan dengan Newman  

### 1️⃣ Instalasi Newman  
Pastikan kamu telah menginstal **Newman** di perangkatmu:  
```sh
npm install -g newman
```

### 2️⃣ Menjalankan Koleksi  

#### 🔹 Jalankan Semua Test  
```sh
newman run Restful-booker-collection.json -e restful-booker-env.json
```

#### 🔹 Jalankan Hanya Folder "Create Token"  
```sh
newman run Restful-booker-collection.json --folder "Create token" -e restful-booker-env.json -d login-validation-data.csv
```

#### 🔹 Jalankan dengan Laporan HTML  
```sh
newman run Restful-booker-collection.json -e restful-booker-env.json -r html --reporter-html-export report.html
```

---

## 📑 Hasil Pengujian  
Setelah dijalankan, laporan hasil pengujian akan tersedia dalam format **CLI output atau HTML Report** sesuai dengan opsi yang digunakan.  

## 📌 Teknologi yang Digunakan  
- **Postman** → Membuat dan menjalankan koleksi API  
- **Newman** → Menjalankan pengujian secara otomatis  
- **CSV Data** → Menggunakan data-driven testing untuk berbagai skenario  

📌 **Cara Menggunakannya:**  
1. **Salin kode di atas**  
2. **Paste di file `README.md` pada repository GitHub-mu**  
3. **Commit dan push ke GitHub**  

README ini sudah lengkap, profesional, dan mudah dibaca! 🚀💡
