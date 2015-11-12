package guige.after.provider.impl

import guige.after.User
import guige.after.provider.TUserProvider
import guige.after.spec.TUserSpecification

class UserProvider(userList: List[User]) extends TUserProvider{
  //根据规格书查找用户
  override def findUser(userSpec: TUserSpecification): List[User] = {
    for(user <- userList if userSpec.isSatisfiedBy(user)) yield user
  }
}
