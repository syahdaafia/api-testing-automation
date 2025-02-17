# restful-booker-api-testing
_Collection_ Postman untuk pengujian API Restful-Booker dengan Newman
link API contract: https://restful-booker.herokuapp.com/apidoc/index.html 

# 🏨 Restful Booker API Testing  

## 📌 Deskripsi  
_Repository_ ini berisi koleksi pengujian API untuk **Restful Booker**, menggunakan **Postman** dan dieksekusi dengan **Newman**. Pengujian mencakup validasi berbagai skenario termasuk request valid, validasi input login (_create_ token) , serta pengambilan booking ID dengan berbagai kombinasi parameter.  

## 📂 Struktur Koleksi  
Koleksi **Restful-Booker Automation** memiliki tiga folder utama:  

### 1️⃣ Valid request  
- Menguji seluruh _flow_ API dari **create token, get booking, update (PUT & PATCH), hingga delete booking** dengan data valid.  

### 2️⃣ Create roken  
- Menguji _endpoint_ `/auth` untuk **membuat token** dengan berbagai kombinasi input (valid & invalid).  

### 3️⃣ Get booking id
- Menguji _endpoint_ `/booking` untuk **mengambil Booking ID** berdasarkan kombinasi parameter seperti `firstname`, `lastname`, `checkin`, dan `checkout` dengan berbagai kombinasi input (valid & invalid).  

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

## 📌 Teknologi yang Digunakan  
- **Postman** → Membuat dan menjalankan koleksi API  
- **Newman** → Menjalankan pengujian secara otomatis  
- **CSV Data** → Menggunakan _data-driven testing_ untuk berbagai skenario  
