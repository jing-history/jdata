//循环  for
//定义一个集合
var list = List("Mary","Tom","Mike")

println("*****第一种写法*****")
for(s <- list) println(s)

println("*****第二种写法*****")
//打印长度大于3的
for{
  s <- list
  if(s.length > 3)
}println(s)

println("*****第三种写法*****")
for(s<-list if s.length <= 3) println(s)

//在for循环中，还可以使用关键字: yield 来产生一个新的集合
//把人名改成大写，并生产一个新的List
println("*****第四种写法*****")
var newList = for {
  s <- list
  s1 = s.toUpperCase
}yield (s1)