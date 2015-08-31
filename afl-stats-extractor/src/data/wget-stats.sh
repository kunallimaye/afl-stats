#!/bin/bash
for i in {1897..2015}
do
   wget http://afltables.com/afl/stats/${i}a.html
done
