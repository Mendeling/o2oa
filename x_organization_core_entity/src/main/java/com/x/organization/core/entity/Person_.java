/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.organization.core.entity.Person.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sat May 06 19:35:40 CST 2017")
public class Person_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Person,Integer> age;
    public static volatile SingularAttribute<Person,Date> birthday;
    public static volatile SingularAttribute<Person,Date> boardDate;
    public static volatile SingularAttribute<Person,Date> changePasswordTime;
    public static volatile ListAttribute<Person,String> controllerList;
    public static volatile SingularAttribute<Person,Date> createTime;
    public static volatile SingularAttribute<Person,String> display;
    public static volatile SingularAttribute<Person,String> employee;
    public static volatile SingularAttribute<Person,GenderType> genderType;
    public static volatile SingularAttribute<Person,String> icon;
    public static volatile SingularAttribute<Person,String> id;
    public static volatile SingularAttribute<Person,String> lastLoginAddress;
    public static volatile SingularAttribute<Person,String> lastLoginClient;
    public static volatile SingularAttribute<Person,Date> lastLoginTime;
    public static volatile SingularAttribute<Person,String> mail;
    public static volatile SingularAttribute<Person,String> mobile;
    public static volatile SingularAttribute<Person,String> name;
    public static volatile SingularAttribute<Person,String> officePhone;
    public static volatile SingularAttribute<Person,Integer> orderNumber;
    public static volatile SingularAttribute<Person,String> password;
    public static volatile SingularAttribute<Person,Date> passwordExpiredTime;
    public static volatile SingularAttribute<Person,String> pinyin;
    public static volatile SingularAttribute<Person,String> pinyinInitial;
    public static volatile SingularAttribute<Person,String> qq;
    public static volatile SingularAttribute<Person,String> sequence;
    public static volatile SingularAttribute<Person,String> signature;
    public static volatile SingularAttribute<Person,String> unique;
    public static volatile SingularAttribute<Person,Date> updateTime;
    public static volatile SingularAttribute<Person,String> weixin;
}
