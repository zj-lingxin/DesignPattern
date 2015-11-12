package guige.before

class UserProvider(userList: List[User]) extends TUserProvider {

  //根据用户名查找用户
  override def findUserByNameEqual(name: String) =
    for(user <- userList if user.name == name) yield user

  //年龄大于指定年龄的用户
  override def findUserByAgeThan(age: Int) =
    for(user <- userList if user.age > age) yield user

}
