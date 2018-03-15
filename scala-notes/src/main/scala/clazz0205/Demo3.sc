//可变集合、不可变集合  Map
val math = scala.collection.immutable.Map("Alice"->80,"Bob"->90)

val chinese = scala.collection.mutable.Map("Alice"->80,"Bob"->90)

//1. 获取集合中的值
chinese("Bob")

if(chinese.contains("Bob")){
  chinese("Bob")
}else{
  -1
}

//简写
chinese.getOrElse("Bob1",-1)

//2、修改更新可变集合中的值
chinese("Bob")=100
//添加新的元素
chinese += "Jerry"-> 79
//删除元素
chinese -= "Bob"

//迭代
for(s <- chinese) println(s)
chinese.foreach(println)