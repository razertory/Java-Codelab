# Java Codelab
![](https://img.shields.io/badge/maven-3.5.x-green.svg) ![](https://img.shields.io/badge/junit-4.11-green.svg)

Java 实现的数据结构/算法以及计算机科学相关的代码和完整的 Junit 测试用例。

## 介绍
此项目适用处于打基础的黄金时间的在校大学生，正在准备找工作的求职者，自我提高的在职者。考虑到 Java 人数多，年龄分布广，不管是工龄 10+ 的程序员还是在校大学生，都可以驾驭的特点，此项目由 Java 8 + Maven 3.5 + Junit 4.11 构建。
大量的 test case是驱动 coding 的好方法，测试代码可以证明算法是对的，不管是作者自己实现的，还是摘录他人的。测试代码也方便做性能测试，只需要控制入口大小就可以测出性能。此外，测试代码中有一些 Helper 类用来构建一些常见的完整的数据结构，比如树，图等。
在实际操作中，比如遍历二叉树，求二叉树高度的过程中可以很方便而又仔细观察到完整的流程。运行对应的测试用例只需用对应的 mvn test 命令。当然如果用 IDE 自带的一些功能支持，可以更高效地工作，这里强烈安利 Intellij IDEA。

```shell
项目根目录下

# 测试所有
> mvn test 

# 测试指定代码
> mvn test -Dtest=完整类名

例如
# 测试排序算法类
> mvn test -Dtest=org.razertory.javacodelab.sort.SortTest
```


> Have fun coding and testing

## 目录

### 排序
* [冒泡排序](./src/main/java/org/razertory/javacodelab/sort/BubbleSort.java)
* [插入排序](./src/main/java/org/razertory/javacodelab/sort/InsertSort.java)
* [插入排序优化版](./src/main/java/org/razertory/javacodelab/sort/InsertOptimizeSort.java)
* [归并排序](./src/main/java/org/razertory/javacodelab/sort/MergeSort.java)
* [快速排序](./src/main/java/org/razertory/javacodelab/sort/QuickSort.java)
* [选择排序](./src/main/java/org/razertory/javacodelab/sort/SelectionSort.java)
* [第 K 大的数](./src/main/java/org/razertory/javacodelab/sort/KthBigest.java) 快速排序法／堆排序法

### 字符串
* [Java 的字符串](./src/main/java/org/razertory/javacodelab/string/StringEqual.java)
* [KMP 算法](./src/main/java/org/razertory/javacodelab/string/KMP.java)
* [回文串算法]

### 栈
* [最小栈](./src/main/java/org/razertory/javacodelab/stack/StackWithMin.java)
* [栈实现队列](./src/main/java/org/razertory/javacodelab/stack/MyQueue.java)

### 队列

### 二叉树
* [二叉树基础](./src/main/java/org/razertory/javacodelab/tree/Tree.java)
* [重建二叉树](./src/main/java/org/razertory/javacodelab/tree/RebuildTree.java)

### 图
* [矩阵表示法](./src/main/java/org/razertory/javacodelab/graph/matrix)
* [临接表表示法](./src/main/java/org/razertory/javacodelab/graph/adjacency)
* [Prim 最小生成树]
* [Kruskal 最小生成树]
* [Floyd 最短路径]
* [Dijkstra 最短路径]

### 广度优先搜索
* [广度遍历二叉树](./src/main/java/org/razertory/javacodelab/bfs/Tree.java)
* [广度遍历图]

### 深度优先搜索
* [深度遍历二叉树](./src/main/java/org/razertory/javacodelab/dfs/Tree.java)
* [深度遍历图]

### 贪心

### 动态规划
* [硬币找零](./src/main/java/org/razertory/javacodelab/dp/Coin.java)
* [是否存在子集合](./src/main/java/org/razertory/javacodelab/dp/SubsetSum.java)
* [三种方式实现斐波那契](./src/main/java/org/razertory/javacodelab/dp/Fibonacci.java) 递归 / 迭代 / 结果缓存

### 高级数据结构
* [二叉搜索树]()
* [二叉堆]()
* [HashMap](./src/main/java/org/razertory/javacodelab/mycollections/MyHashMap.java)
* B树
* B+树
* 布隆过滤器
* LRU 缓存

# 参考
算法导论
Geeks for Geeks
AlgoCasts
July 编程之法
极客时间
Leetcode
Lintcode

# License
The MIT License (MIT)

