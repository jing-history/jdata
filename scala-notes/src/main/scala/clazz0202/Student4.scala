package clazz0202

/*
构造器：（1）主构造器  : 和类的申明在一起，只能有一个主构造器
       （2）辅助构造器:  多个辅助构造器，通过关键字：this
 */

class Student4(val stuName:String,val stuAge:Int) {
  //定义一个辅助构造器
  def this(age:Int){
    //调用主构造器
    this("No Name",age)
  }
}

object Student4{
  def main(args: Array[String]): Unit = {
    //使用主构造器创建学生对象
    var s4 = new Student4("Tom",24)
    println(s4.stuName + "\t" + s4.stuAge)

    //使用辅助构造器创建学生对象
    var s5 = new Student4(25)
    println(s5.stuName + "\t" + s5.stuAge)
  }
}
