# -*- coding: UTF-8 -*-
import multiprocessing 
import time

def job(v, num, l):
    #新增一个锁
    #l.acquire() 
    for _ in range(100):
        time.sleep(0.01)
        #with v.get_lock():
        l.acquire()  
        v.value +=num
        print(v.value)
        l.release() 

def multicore():
    l = multiprocessing.Lock() # 定义一个进程锁
    v = multiprocessing.Value('i', 0)
    p1 = multiprocessing.Process(target=job, args=(v,1,l)) 
    p2 = multiprocessing.Process(target=job, args=(v,3,l)) 
    
    
    p1.start()
    p2.start()
    p1.join()
    p2.join()

if __name__ == '__main__':
    multicore()
    print("又回到400了，0.0。")