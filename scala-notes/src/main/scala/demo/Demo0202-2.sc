//高阶函数
import scala.math._

//对数字10进行某种运算
def someAction(f:(Double)=>Double) = f(10)

//测试
//情况1：开平方
someAction(sqrt)
someAction(sin)

//另一个例子
def mytest(x:Int,y:Int):Int = { x*y + 10}

////定义一个高阶函数
//def myFunction(f:(Int,Int)=>Int,x:Int,y:Int) = f(x,y)
def myFunction(f:(Int,Int)=>Int,x:Int,y:Int) = f(x,y)
//调用
//myFunction(mytest,2,3)
myFunction(mytest,2,5)