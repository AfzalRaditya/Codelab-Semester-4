Penjelasan Visualisasi

Graf yang digunakan terdiri dari lima simpul yang diberi label 0 hingga 4, dengan representasi huruf A hingga E sebagai padanan simpul:

* 0 → A
* 1 → B
* 2 → C
* 3 → D
* 4 → E

(0 → 1), (0 → 2), (1 → 3), (2 → 3), (2 → 4), (3 → 4), (4 → 0)
(A → B), (A → C), (B → D), (C → D), (C → E), (D → E), (E → A)

Jalur BFS

0 → 1 → 2 → 3 → 4  
(A → B → C → D → E)
Algoritma Breadth-First Search (BFS) melakukan penelusuran secara melebar dari simpul awal. BFS memanfaatkan struktur data antrian (queue) untuk menjelajahi semua simpul tetangga terlebih dahulu sebelum berpindah ke tingkat simpul berikutnya. Dalam kasus ini:

* Penelusuran dimulai dari simpul 0 (A), lalu mengunjungi simpul-simpul tetangganya yaitu 1 (B) dan 2 (C).
* Selanjutnya BFS bergerak ke simpul 1 (B) dan mengunjungi simpul 3 (D).
* Kemudian dari simpul 2 (C), simpul 3 (D) telah dikunjungi sehingga hanya simpul 4 (E) yang dikunjungi.
* Proses berakhir setelah semua simpul telah dikunjungi.

Jalur DFS

0 → 1 → 3 → 4 → 2  
(A → B → D → E → C)
Algoritma Depth-First Search (DFS) melakukan penelusuran secara mendalam dengan menggunakan rekursi atau struktur data stack. DFS akan menjelajahi satu cabang sedalam mungkin sebelum berpindah ke cabang lain. Pada kasus ini:

* Penelusuran dimulai dari simpul 0 (A), lanjut ke simpul 1 (B).
* Dari simpul 1 (B), DFS bergerak ke simpul 3 (D).
* Dari simpul 3 (D), penelusuran dilanjutkan ke simpul 4 (E).
* Dari simpul 4 (E), simpul 0 (A) sudah dikunjungi, sehingga kembali dan mengeksplorasi simpul 2 (C) dari simpul awal (0) yang belum dikunjungi.
* Semua simpul telah dikunjungi, penelusuran selesai.

