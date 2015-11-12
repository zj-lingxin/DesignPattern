package guige.after.spec.impl

import guige.after.User
import guige.after.spec.TUserSpecification

case class UserByNameLike(likeStr: String) extends TUserSpecification {
  //候选者是否满足要求
  override def isSatisfiedBy(user: User): Boolean = {
    val str = likeStr.replace("%", "")
    var result: Boolean = false
    if (likeStr.startsWith("%") && !likeStr.endsWith("%")) {
      result = user.name.endsWith(str)
    } else if (!likeStr.startsWith("%") && likeStr.endsWith("%")) {
      result = user.name.startsWith(str)
    } else {
      result = user.name.contains(str)
    }
    result
  }
}
