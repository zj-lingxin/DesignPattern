package guige.after.provider

import guige.after.User
import guige.after.spec.TUserSpecification

trait TUserProvider {
   //根据规格书查找用户
   def findUser(userSpec: TUserSpecification): List[User]
 }
