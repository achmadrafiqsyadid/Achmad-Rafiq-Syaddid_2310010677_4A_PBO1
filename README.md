
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah aplikasi sederhana untuk menghitung konsumsi energi listrik harian dari berbagai perangkat elektronik. Aplikasi ini dibuat menggunakan bahasa pemrograman Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Pengguna dapat memasukkan data perangkat elektronik seperti nama perangkat, daya listrik (dalam watt), dan durasi pemakaian (jam/hari). Aplikasi akan menghitung berapa konsumsi energi per hari (dalam kWh) dan mendeteksi perangkat yang tergolong boros. Terdapat fitur pengecekan otomatis perangkat boros menggunakan konsep pewarisan dan polimorfisme.

Aplikasi ini mengimplementasikan 14 konsep penting dalam OOP, yaitu: Class, Object, Atribut, Constructor, Mutator, Accessor, Encapsulation, Inheritance, Polymorphism, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

### 1. Class
Class adalah blueprint dari object. Aplikasi ini memiliki beberapa class:

```java
public class PerangkatElektronik { ... }

public class PerangkatBoros extends PerangkatElektronik { ... }

public class EnergiCalculator { ... }

public class EnergiMain { ... }
```

### 2. Object
Object dibuat dari class dan menyimpan data serta menjalankan fungsinya.

```java
PerangkatElektronik perangkat = new PerangkatElektronik(nama, daya, durasi);
EnergiCalculator kalkulator = new EnergiCalculator(...);
```

### 3. Atribut
Atribut menyimpan data dari sebuah class.

```java
private String nama;
private double dayaWatt;
private double durasiJam;
```

### 4. Constructor
Constructor digunakan untuk inisialisasi object saat pertama kali dibuat.

```java
public PerangkatElektronik(String nama, double dayaWatt, double durasiJam) {
    this.nama = nama;
    this.dayaWatt = dayaWatt;
    this.durasiJam = durasiJam;
}
```

### 5. Mutator (Setter)
Method untuk mengubah nilai atribut.

```java
public void setNama(String nama) {
    this.nama = nama;
}
```

### 6. Accessor (Getter)
Method untuk mengambil nilai atribut.

```java
public String getNama() {
    return nama;
}
```

### 7. Encapsulation
Menyembunyikan atribut menggunakan `private`, dan mengaksesnya melalui method getter/setter.

```java
private double dayaWatt;
public double getDayaWatt() { return dayaWatt; }
```

### 8. Inheritance
`PerangkatBoros` mewarisi class `PerangkatElektronik`.

```java
public class PerangkatBoros extends PerangkatElektronik { ... }
```

### 9. Polymorphism
Polimorfisme digunakan dengan cara **overriding** method `hitungEnergi()`.

```java
@Override
public double hitungEnergi() {
    return super.hitungEnergi() * 1.2; // perangkat boros ditambah 20%
}
```

### 10. Seleksi
Menggunakan `if` atau `instanceof` untuk mengecek kondisi.

```java
if (perangkat instanceof PerangkatBoros) {
    System.out.println("Perangkat boros energi!");
}
```

### 11. Perulangan
Menggunakan perulangan `for` untuk menampilkan semua data perangkat.

```java
for (PerangkatElektronik perangkat : perangkatList) {
    ...
}
```

### 12. IO Sederhana
Menggunakan `Scanner` untuk input dan `System.out.println()` untuk output.

```java
Scanner input = new Scanner(System.in);
System.out.print("Masukkan nama perangkat: ");
String nama = input.nextLine();
```

### 13. Array
Menggunakan `ArrayList` untuk menyimpan banyak perangkat.

```java
ArrayList<PerangkatElektronik> perangkatList = new ArrayList<>();
```

### 14. Error Handling
Menggunakan `try-catch` untuk menangani kesalahan input.

```java
try {
    double daya = Double.parseDouble(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input tidak valid: " + e.getMessage());
}
```

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

**Nama**: Achmad Syaddid Syaddid
**NPM**:  2310010677
