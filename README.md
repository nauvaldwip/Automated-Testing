# Penting!
* Project ini dibuat untuk memenuhi test teknis PT Fatiha Sakti.
* Automation Testing menggunakan Katalon Studio.
* Test Script bisa dilihat pada folder Scripts
* Test Case yang dibuat bisa dilihat pada folder Test Case. Rekaman dapat dilihat menggunakan Katalon Studio.
* Jika ada sedikit kesalahan pada rekaman pengujian Test Case Sign Up di bagian email telah terdaftar, menandakan bahwa email tersebut sudah berhasil dibuat dan sistem tidak mengizinkan masuk menggunakan email tersebut.

# Automated Testing
Terdiri dari :
1. Sign Up
2. Sign In Valid
3. Sign In Invalid
4. Forgot Password

# Sign Up
Test Automation ini mengetest ketika tester membuat akun baru. <br />
Data yang diinput diantaranya :
* Email : testing@yahoo.co.id
* Password : testing
* First Name : Nauval
* Last Name : Muhammad Dwiputra
* Option Tanggal Lahir : 21
* Option Bulan Lahir : July
* Option Tahun Lahir : 1999
* Company Name : PT. Testing
* Addres 1 : JL. Suka
* Address 2 : RT 10 / RW 99
* Postcode : 17121
* Additional Information : Ini hanya testing
* Home Phone : 02199568302
* Phone Mobile : 085123456789

# Sign In Valid
Test Automation ini mengetest ketika tester menguji data yang diinput valid. <br />
Data yang diuji :
* Email : testing@yahoo.co.id
* Password : testing

# Sign In Invalid
Test Automation ini mengetest ketika tester menguji data yang diinput invalid. <br />
Beberapa Test Case nya, diantaranya :
* Pengujian ketika email dan password dikosongkan
* Pengujian ketika email kosong, dan password tidak
* Pengujian ketika email terisi, dan password kosong
* Pengujian ketika email yang diinput tidak sesuai dengan format email
* Pengujian ketika email valid, dan password invalid
* Pengujian ketika email invalid, dan password valid.

