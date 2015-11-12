package guige.before

trait TUserProvider {
  //根据用户名查找用户
  def findUserByNameEqual(name: String): List[User]
  //年龄大于指定年龄的用户
  def findUserByAgeThan(age: Int): List[User]
}
