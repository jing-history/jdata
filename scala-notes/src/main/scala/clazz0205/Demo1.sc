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

//采用闭包
def mulBy(factor:Double)=(x:Double)=> x * factor
//
val triple = mulBy(3)
triple(10)
triple(6)

//除以2的操作
val half = mulBy(0.5)
half(10)
