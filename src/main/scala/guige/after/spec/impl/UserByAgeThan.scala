package guige.after.spec.impl

import guige.after.User
import guige.after.spec.TUserSpecification

/**
 * 大于基准年龄的规格书
 */
class UserByAgeThan(age: Int) extends TUserSpecification {
  //候选者是否满足要求
  override def isSatisfiedBy(user: User): Boolean = {
    user.age > age
  }
}
