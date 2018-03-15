package clazz0202

class Student5(val stuName:String){

}

object Student5 {
  //定义类的apply方法
  def apply(stuName:String) = {
    println("调用到了apply方法")

    //调用主构造器
    new Student5(stuName)
  }

  def main(args: Array[String]): Unit = {
    //创建学生对象
    var s1 = new Student5("Tom")
    println(s1.stuName)

    //创建学生对象，省略new关键字
    var s2 = Student5("Mary")
    println(s2.stuName)
  }
}
