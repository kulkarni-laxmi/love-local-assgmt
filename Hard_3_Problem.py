# -*- coding: utf-8 -*-
"""
Created on Wed Dec  6 23:32:27 2023

@author: Laxmi S Kulkarni
"""


def countDigitOne(n):
    countr = 0;
    for i in range(1, n + 1):
        str1 = str(i);
        countr += str1.count("1");
 
    return countr;
n = 13;
print(countDigitOne(n));
 
n = 0;
print(countDigitOne(n));
 