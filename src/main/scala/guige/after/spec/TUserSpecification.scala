package guige.after.spec

import guige.after.User

trait TUserSpecification {
  //候选者是否满足要求
  def isSatisfiedBy(user: User): Boolean
}
