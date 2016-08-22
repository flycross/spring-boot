package com.didispace;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class TestSemaphore {

                public static void main(String[] args) {

                // 线程池

                ExecutorService exec = Executors.newCachedThreadPool();
                
            

                // 只能5个线程同时访问

                final Semaphore semp = new Semaphore(15,true);

                 // 模拟20个客户端访问

                 for (int index = 0; index <300; index++) {

                              final int NO = index;

                              Runnable run = new Runnable() {

                                                 public void run() {

                                                            try {

                                                                    // 获取许可
                                                            	      semp.acquire();

                                                                   
                                                                    System.out.println("Accessing: " + NO);

                                                                    Thread.sleep(3000);
                                                                    semp.release();
                                                                    
                                                                    //semp.acquire();

                                                              
                                                                    
                                                                    semp.release();

                                                                    System.out.println("-----------------"+semp.availablePermits());

                                                            } catch (Exception e) {

                                                                    e.printStackTrace();

                                                            }

                                                  }

                                      };

                      exec.execute(run);
                      

             }

             // 退出线程池

             exec.shutdown();

       }

} 