//定义函数求数的阶乘
def myFactor(x:Int):Int = {
  if(x <= 1)
    1
  else
    x * myFactor(x-1)
}

//调用
myFactor(5)