# -*- coding: UTF-8 -*-
import multiprocessing 
import time


def job(v, num):
    #一个递增函数
    for _ in range(100):
        time.sleep(0.01)
        with v.get_lock(): 
            v.value += num 
        print(v.value)
  

def multicore():
    v = multiprocessing.Value('i', 0) 
    #创建两个进程，分别以1,3递增
    p1 = multiprocessing.Process(target=job, args=(v,1)) 
    p2 = multiprocessing.Process(target=job, args=(v,3)) 
    p1.start()
    p2.start()
    p1.join()
    p2.join()

if __name__ == '__main__':
    multicore()
    print("结果会是400,对吧？")