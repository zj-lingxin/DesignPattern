package guige.after

import guige.after.provider.TUserProvider
import guige.after.provider.impl.UserProvider
import guige.after.spec.TUserSpecification
import guige.after.spec.impl.{UserByNameLike, UserByAgeThan}

object Client {
   def main(args: Array[String]) {
     //首先初始化一批用户
     val userList = List(
       User("苏大", 3), User("牛二", 8), User("张三", 10), User("杨八", 34),
       User("李四", 15), User("王五", 18), User("赵六", 23), User("马七", 34)
     )

     //定义一个用户查询类
     val userProvider: TUserProvider = new UserProvider(userList)

     val userSpec: TUserSpecification = new UserByNameLike("%三")

     userProvider.findUser(userSpec).foreach(println)
   }
 }
