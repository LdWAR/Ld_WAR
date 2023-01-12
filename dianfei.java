package com.meiyong;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class dianfei {
    public static void main(String[] args) {
        //1.输入功率，每天使用多长时间，电费价格
        double W,H,price;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入设备功率（W）");
        W = sc.nextDouble();
        System.out.println("请输入每天使用时长（h）");
        H = sc.nextDouble();
        System.out.println("请输入电费价格（元/度）");
        price = sc.nextDouble();

        double sum = W*H/1000*price;
        System.out.println("每天电费合计"+String.format("%.2f",sum));
        System.out.println("每周电费合计"+String.format("%.2f",sum*7));
        System.out.println("每月电费合计"+String.format("%.2f",sum*30));
        System.out.println("每年电费合计"+String.format("%.2f",sum*365));
    }
}
