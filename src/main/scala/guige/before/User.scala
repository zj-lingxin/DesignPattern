package guige.before

case class User(var name: String, var age: Int) {
  override def toString: String = {
    s"用户名: $name \t 年龄：$age"
  }
}
