# 🏨 Restful Booker API Testing - Pytest  

Repositori ini berisi **pengujian otomatisasi API** untuk **Restful Booker API** menggunakan **Pytest** dan **Requests**.  

🔗 **Link API Contract:** [Restful Booker API Docs](https://restful-booker.herokuapp.com/apidoc/index.html)  

## 📌 **Deskripsi Proyek**  
Proyek ini bertujuan untuk menguji fungsionalitas **Restful Booker API** secara otomatis menggunakan **Pytest**. Pengujian mencakup:  
✅ Membuat token autentikasi  
✅ Membuat _booking_ baru  
✅ Mengupdate _booking_ (_full_ & partial)  
✅ Mengambil _booking_ berdasarkan ID & parameter tertentu  
✅ Menghapus _booking_  

Semua pengujian dilakukan dengan validasi respons untuk memastikan API berfungsi sesuai harapan.  
---

## 📂 **Struktur Proyek**  

```
restful-booker-pytest/
│── test_create_auth.py         # Tes pembuatan token autentikasi
│── test_create_booking.py      # Tes pembuatan booking
│── test_get_booking_id.py      # Tes mendapatkan booking berdasarkan ID
│── test_get_by_param.py        # Tes mendapatkan booking berdasarkan parameter
│── test_update_booking.py      # Tes pembaruan booking (PUT)
│── test_update_partial.py      # Tes pembaruan sebagian booking (PATCH)
│── test_delete_booking.py      # Tes penghapusan booking
│── conftest.py                 # Konfigurasi Pytest untuk fixture
│── pytest.ini                  # Konfigurasi Pytest
```

---

## 🚀 **Cara Menjalankan Pengujian**  

### 1️⃣ **Persiapan**  
Install **Python 3.8+** dan install dependensi:  
```sh
pip install -r requirements.txt
```

### 2️⃣ **Menjalankan Semua Tes**  
Gunakan perintah berikut untuk menjalankan semua tes:  
```sh
pytest -v
```

### 3️⃣ **Menjalankan Tes Tertentu**  
Misalnya, untuk hanya menjalankan tes pembuatan booking:  
```sh
pytest tests/test_create_booking.py -v
```

### 4️⃣ **Menjalankan Tes dengan Urutan (pytest-order)**  
```sh
pytest --order-scope=session
```

---

## 📌 **Jenis Pengujian**  

| **No** | **Nama Tes**                   | **Deskripsi** |
|--------|--------------------------------|--------------|
| 1️⃣    | `test_create_auth.py`         | Membuat token autentikasi |
| 2️⃣    | `test_create_booking.py`      | Membuat booking baru |
| 3️⃣    | `test_get_booking_id.py`      | Mengambil booking berdasarkan ID |
| 4️⃣    | `test_get_by_param.py`        | Mengambil booking berdasarkan parameter tertentu |
| 5️⃣    | `test_update_booking.py`      | Memperbarui booking secara penuh (PUT) |
| 6️⃣    | `test_update_partial.py`      | Memperbarui booking secara parsial (PATCH) |
| 7️⃣    | `test_delete_booking.py`      | Menghapus booking |

---

## 🛠 **Teknologi yang Digunakan**  
- **Python 3.8+** → Bahasa pemrograman utama  
- **Pytest** → Framework untuk menjalankan pengujian  
- **Requests** → Library untuk melakukan HTTP request  
- **pytest-order** → Mengatur urutan eksekusi tes  
