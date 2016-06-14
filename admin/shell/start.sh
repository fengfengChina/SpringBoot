#!/usr/bin/env bash
$PATH=/Users/zengfeng/Desktop/root/root/wholesaleInterface/code/trunk/hd_interface/shell
cd $PATH
gradle clean && gradle build --stacktrace && gradle bootRun