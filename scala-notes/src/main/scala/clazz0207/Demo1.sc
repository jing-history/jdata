//复习：Scala中函数
//定义函数
def myFunc1(name:String):String = "Hello " + name
println(myFunc1("Tom"))

def myFunc2():String = "Hello World"

//值函数：把函数作为变量的值
val v1 = myFunc1("Tom")
val v2 = myFunc2()

//再将v1付给myFunc1
println(myFunc1(v1))

//匿名函数：没有名字的函数
// 完整: def myFunc3(x:Int) = x * 3
(x:Int) => x*3

//举例：Array(1,2,3) ====> (3,6,9)
Array(1,2,3).map((x:Int) => x*3)