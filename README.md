# 🧵 Proyecto de Hilos en Java  

Este proyecto demuestra el uso de **hilos (Threads) en Java**, implementando tanto la interfaz `Runnable` como la herencia de la clase `Thread`.  

## 📌 Descripción  

El proyecto consta de tres clases principales:  

1. **HilosR.java**  
   - Utiliza una implementación anónima de `Runnable`.  
   - Crea y ejecuta tres hilos con nombres `Hilo1`, `Hilo2` y `Hilo3`.  

2. **ThreadSimple.java**  
   - Extiende la clase `Thread`.  
   - Define un hilo que imprime su nombre varias veces antes de finalizar.  

3. **Hilos.java**  
   - Instancia y ejecuta dos hilos (`Juan` y `Martinsillo`) utilizando la clase `ThreadSimple`.  

## 🚀 Ejecución  

### 📥 Requisitos  
- Java Development Kit (JDK) 8 o superior.  

### ▶️ Pasos para ejecutar  

1. **Compilar el código**  

   ```bash
   javac -d . HilosR.java Hilos.java Model/ThreadSimple.java
