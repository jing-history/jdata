package clazz0202

import scala.collection.mutable.ArrayBuffer

class Student3 {
  //定义一个内部类（嵌套类）: 学生选修的课程
  //通过主构造器
  class Course(val courseName:String,val credit:Int){
    //其他的方法
  }

  //属性
  private var stuName:String = "Tom"
  private var stuAge:Int = 20

  //定义一个数组来保存该学生选修的课程
  private var courseList = new ArrayBuffer[Course]()

  //定义方法：往学生信息中添加新的课程
  def addNewCourse(cname:String,credit:Int): Unit = {
    //创建一门课程
    var c = new Course(cname,credit)

    //加入List
    courseList += c
  }
}

object Student3{
  def main(args: Array[String]): Unit = {
    //创建学生
    var s3 = new Student3

    //给学生添加课程
    s3.addNewCourse("Chinese",3)
    s3.addNewCourse("English",3)
    s3.addNewCourse("Math",3)

    //输出
    println(s3.stuName+"\t"+s3.stuAge)
    for(s <- s3.courseList) println(s.courseName + "\t" + s.credit)
  }
}
