# restful-booker-api-testing
_Collection_ Postman untuk pengujian API Restful-Booker dengan Newman
link API contract: _ https://restful-booker.herokuapp.com/apidoc/index.html _

# 🏨 Restful Booker API Testing  

## 📌 Deskripsi  
_Repository_ ini berisi koleksi pengujian API untuk **Restful Booker**, menggunakan **Postman** dan dieksekusi dengan **Newman**. Pengujian mencakup validasi berbagai skenario termasuk request valid, validasi input login (create token) , serta pengambilan booking ID dengan berbagai kombinasi parameter.  

## 📂 Struktur Koleksi  
Koleksi **Restful-Booker Automation** memiliki tiga folder utama:  

### 1️⃣ Valid request  
- Menguji seluruh flow API dari **create token, get booking, update (PUT & PATCH), hingga delete booking** dengan data valid.  

### 2️⃣ Create roken  
- Menguji _endpoint_ `/auth` untuk **membuat token** dengan berbagai kombinasi input (valid & invalid).  

### 3️⃣ Get booking id
- Menguji endpoint `/booking` untuk **mengambil Booking ID** berdasarkan kombinasi parameter seperti `firstname`, `lastname`, `checkin`, dan `checkout`.  

---

## 🚀 Cara Menjalankan dengan Newman  

### 1️⃣ Instalasi Newman  
Install **Newman** di perangkat:  
```sh
npm install -g newman
```

### 2️⃣ Menjalankan Koleksi  

#### 🔹 Jalankan Folder "Valid request"  
```sh
newman run Restful-booker-collection.json --folder "Valid request" -e restful-booker-env.json -d restful-booker-data.csv
```

#### 🔹 Jalankan Folder "Create token"  
```sh
newman run Restful-booker-collection.json --folder "Create token" -e restful-booker-env.json -d login-validation-data.csv
```

#### 🔹 Jalankan Folder "Get booking id"  
```sh
newman run Restful-booker-collection.json --folder "Get booking id" -e restful-booker-env.json -d get-booking-id-validation-data.csv
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
