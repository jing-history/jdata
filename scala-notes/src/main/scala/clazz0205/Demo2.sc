//高阶函数
import scala.math._

//对数字10进行某种运算
//f : 就是执行的运算
def someAction(f:(Double)=>Double) = f(10)

//测试
//情况1：开平方
someAction(sqrt)
someAction(sin)

def myTest(x:Int,y:Int):Int = {x*y + 10}

//定义一个高阶函数
def myFunction(f:(Int,Int)=>Int, x:Int,y:Int) = f(x,y)

myFunction(myTest,2,3)