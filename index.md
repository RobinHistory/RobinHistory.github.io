# Welcome To Robin History's Page~!
This page is used to record some important records by time, maybe.
## 2021.03.11 Python.Mutilprocessing.Value
  在官方文档（3.9.2）中，Value对象自带有一个锁。文档同时提及了一个关于+=，非原子性的操作，意味着+=将两次获取锁，中间如果中断的话，就会影响最终值。 <br>
  2021.03.11.00.py 将展示一个不用额外锁的方法，维持安全，用到get_lock()的方法。 <br>
  2021.03.11.01.py 将展示不采用get_lock，会产生的结果。 <br>
  2021.03.11.02.py 将展示一个采用额外锁维持正确性的方法。 <br>
  Value自带的锁虽然保护了单次的互斥要求，但是在需要进行连续操作的时候，需要注意这个锁的设置。 <br>
