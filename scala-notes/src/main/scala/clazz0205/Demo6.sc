import scala.collection.mutable
//集（Set）: 是不重复元素的集合，默认的实现：HashSet

//创建一个Set
var s1 = Set(10,2,0,1)
//往里面添加一个重复的元素
s1 += 0
s1

//往里面添加一个不重复的元素
s1 += 100
s1

//LinkedHashSet
var weeksDay = mutable.LinkedHashSet("星期一","星期二")
weeksDay + "星期五"
weeksDay.contains("星期二")

//可排序的Set
var s2 = mutable.SortedSet(1,2,3,100,10,4)

//判断一个Set是否是另一个Set的子集
Set("星期一","星期二") subsetOf(weeksDay)

//集Set: 并集union、交集intersect、差集 diff
var set1 = Set(1,2,3,4,5,6)
var set2 = Set(5,6,7,8,9,10)

//并集: 去掉重复元素
set1 union set2

//交集
set1 intersect set2

//差集: 从set1中，除去set2
set1 diff set2