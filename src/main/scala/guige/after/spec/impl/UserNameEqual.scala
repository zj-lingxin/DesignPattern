package guige.after.spec.impl

import guige.after.User
import guige.after.spec.TUserSpecification

/**
 * 姓名相同的规格书
 */
class UserNameEqual(name: String) extends TUserSpecification {
  //候选者是否满足要求
  override def isSatisfiedBy(user: User): Boolean = user.name == name
}
