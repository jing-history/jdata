import scala.collection.mutable.ArrayBuffer

//call by value：对函数的实参求值，仅求一次
def test1(x:Int, y:Int):Int = x + x

test1(3+4,8)

//call by name：函数的实参每次在函数体内部被调用到的时候 都会求值
def test2(x: => Int, y: => Int):Int = x + x
test2(3+4,8)

//x是call by value，y是call by name
def bar(x:Int, y: => Int):Int = 1

//定义一个死循环
def loop():Int = loop

bar(1,loop())
//bar(loop(),1)  无限循环

//默认参数
def func1(name:String="Tom"):String = "Hello " + name
func1()

def func2(str:String="Good Morning ", name:String="Tom",age:Int=20):String
= str + name + " and the age of " + name + "  is " + age

func2()
func2(age = 25)

//求多个数字的和
def sum(args:Int*) = {
  var result = 0
  for(arg <- args) result += arg
  result
}
sum(1,2,3)
sum(1,2,3,4,5,6)

//懒值（lazy值）：如果一个变量是lazy，他的初始化会被推迟，直到第一次使用他的时候
val x:Int = 10
val y:Int = x + 10

lazy val z:Int = x + 10

//读一个文件（存在的、不存在的） lazy 在idea 好像不起作用
//lazy val words = scala.io.Source.fromFile("d:\\temp\\a.txt").mkString

//异常
def funcEx = throw new IllegalArgumentException("Some Error Happened")

//定长数组
val a = new Array[Int](10)
val b = new Array[String](5)
val c = Array("Tom","Mary","Mike")

// 变长数组
val d = ArrayBuffer[Int]()
d += 1
d += 2
d += 3

//往边长数组加入多个元素
d += (10,12,13)

////去掉最后2 个值
d.trimEnd(2)

d.toArray