# restful-booker-rest-assured
Proyek API Testing untuk **Restful Booker API** menggunakan **Rest Assured** dan **TestNG**.

Link API contract: [Restful Booker API Docs](https://restful-booker.herokuapp.com/apidoc/index.html)

## 🏨 Restful Booker API Testing  

### 📌 Deskripsi  
Repositori ini berisi rangkaian pengujian API untuk **Restful Booker** menggunakan **Rest Assured** dan **TestNG**. Pengujian ini meliputi pembuatan token, pembuatan booking, pembaruan booking, pembaruan parsial booking, serta penghapusan booking. Tes dilakukan pada berbagai skenario validasi untuk memastikan fungsionalitas API berjalan dengan baik.

## 📂 Struktur Proyek  
Proyek ini memiliki tiga folder utama:

### 1️⃣ **apiTestRunner**  
- Berisi skrip utama yang menjalankan pengujian API menggunakan Rest Assured dan TestNG.
- Tes dilakukan pada endpoint-endpoint utama seperti `/auth` (untuk membuat token), `/booking` (untuk membuat, memperbarui, dan menghapus booking), dan beberapa skenario lainnya.

### 2️⃣ **data**  
- Folder ini berisi kelas **DataProvider** yang menyediakan data untuk pengujian API seperti login, pembuatan booking, pembaruan booking, dan lainnya.
- Data disediakan dalam bentuk array untuk digunakan di setiap pengujian.

### 3️⃣ **payload**  
- Berisi kelas-kelas yang menghasilkan payload JSON untuk request API, termasuk membuat token, membuat booking, memperbarui booking, dan memperbarui booking secara parsial.

---

## 🚀 Cara Menjalankan Pengujian API  

### 1️⃣ Persiapan  
Install **Java 8+** dan **Maven** di sistem.

### 2️⃣ Clone Repositori  
Clone repositori ke sistem lokal:
```sh
git clone https://github.com/username/restful-booker-rest-assured.git
cd restful-booker-rest-assured
```

### 3️⃣ Build dan Jalankan Pengujian  
Jalankan perintah berikut untuk membangun dan menjalankan pengujian menggunakan Maven:

```sh
mvn clean test
```

Perintah ini akan memulai eksekusi pengujian dan menampilkan hasil di konsol. Kamu juga bisa melihat laporan dari TestNG.

---

## 📌 Tes yang Dilakukan  
Beberapa tes yang terdapat dalam proyek ini antara lain:

### 🔹 **testCreateToken**  
Mengautentikasi dengan kredensial valid dan mendapatkan token otentikasi untuk digunakan pada permintaan berikutnya.

### 🔹 **testCreateBooking**  
Membuat booking baru dengan data acak dan memverifikasi detail booking yang dikembalikan oleh API.

### 🔹 **testUpdateBooking**  
Memperbarui booking yang sudah ada dan memverifikasi bahwa data baru telah diterapkan pada booking tersebut.

### 🔹 **testUpdatePartialBooking**  
Memperbarui sebagian data booking yang sudah ada (misalnya, hanya mengubah nama depan) dan memverifikasi perubahan tersebut.

### 🔹 **testGetBookingByParams**  
Mengambil booking berdasarkan parameter tertentu, seperti `firstname` dan `lastname`, dan memverifikasi apakah booking yang diinginkan dikembalikan oleh API.

### 🔹 **testDeleteBooking**  
Menghapus booking yang telah dibuat sebelumnya dan memverifikasi bahwa penghapusan berhasil.

---

## 📌 Teknologi yang Digunakan  
- **Rest Assured** → Untuk mengirimkan request HTTP dan memverifikasi respons API.
- **TestNG** → Untuk mengelola pengujian dan memberikan laporan hasil pengujian.
- **Java 8+** → Untuk bahasa pemrograman yang digunakan dalam menulis pengujian API.
- **Maven** → Untuk mengelola dependensi dan build proyek.
