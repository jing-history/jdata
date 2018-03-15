import scala.collection.mutable.ArrayBuffer

val myArray = Array(1,10,2,3,5,4)

//最大值
myArray.max

//最小值
myArray.min

//求和
myArray.sum

//定义一个边长数组
var myArray1 = ArrayBuffer(1,10,2,3,5,4)

//降序
myArray1.sortWith(_ > _)

//升序
myArray1.sortWith(_ < _)

//不可变map
val math = scala.collection.immutable.Map("AAA" -> 80, "BB" -> 22, "CC" -> 55)

//可变的Map
val english = scala.collection.mutable.Map("AAA" -> 80, "BB" -> 22)
val english2 = scala.collection.mutable.Map(("AA",80),("BB",99))

//获取Map 的值
english2("AA")
//english2("DD")

english2.getOrElse("AA", -1)

english2 += "FF" -> 100

english2 -= "BB"

english2.foreach(println)

//元组
val t1 = (1,2,"Tom")
val a2 = new Tuple4(1,2,3,"Hello")

a2._1
a2._2
a2._4

//遍历元组
a2.productIterator.foreach(println)
