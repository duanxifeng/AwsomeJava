# AwsomeJava
## 记录下我的Java提高之旅

### 13.2.3 散列集(HashSet)
* 散列表为每一个整数计算一个整数，称为散列码（hash code）
* 具有不同数据域的对象将产生不同的散列码
* 最重要的问题就是计算散列码了，这个计算只与要散列的对象状态有关，与其他对象无关
* 散列表用链表数组实现，每个列表被称为桶（bucket）
* 索引号 = 散列码 % 桶的总数
* 标准库桶数是2的幂，默认为16
* 装填因子默认为0.75，表中超过75%已经填充就会用双倍的桶数进行再散列

### 13.2.4 树集(TreeSet)
* 数集是一个有序集合
* 排序后输出，用红黑树(red-black tree)完成的
* 比散列表慢，比数组/链表快，查找新元素平均需要比较log n 次

### 13.2.5 对象的比较
* TreeSet 通过实现Comparable接口来对元素进行排列
* 通过将Comparator对象传递给TreeSet构造器来告诉树集使用不同的方法来比较对象
* 数的排序必须是全序，即任意两个元素必须是可比的

### 13.2.6 队列与双端队列
* 队列可以让人们有效地在尾部添加一个元素，头部删除一个元素
* SE 6 中引入了Deque接口，由ArrayDeque和LinkList实现

### 13.2.7 优先级队列(priority queue)
* jixu






