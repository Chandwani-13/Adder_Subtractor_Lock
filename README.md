# 🔐 Adder-Subtractor Problem Using Locks

## 📘 Problem Statement

Implement a thread-safe solution where multiple threads perform **addition** and **subtraction** on a shared variable. The solution must ensure that concurrent access does not lead to race conditions, and the final result is consistent.

## 🛠️ Solution Overview

This solution uses:

- `ReentrantLock` from `java.util.concurrent.locks` to ensure **mutual exclusion**
- Two types of threads:
  - `AdderThread`: Adds a value to a shared counter
  - `SubtractorThread`: Subtracts a value from the same shared counter

## 💡 Concepts Covered

- Java concurrency
- Locks and synchronization
- Thread-safe operations on shared data



