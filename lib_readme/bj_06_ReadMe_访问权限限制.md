##### 访问权限控制

##### 6.1 包：库单元

##### 6.2 Java访问权限修饰词

6.2.1 包访问权限

* 默认访问权限是没有任何关键字的，也就是指包访问权限(有时也表示成为friendly)。默认的访问权限，可以被同一个包内的任何类访问，对于包之外的所有类，这个成员是private的。

6.2.2 public：接口访问权限。

6.2.3 private：你无法访问

6.2.4 protected：继承访问权限，protected也提供包访问权限，也就是说，相同包内的其他类可以访问protected元素。

##### 6.3 接口和实现

##### 6.4 类的访问权限

1. 每个编译单元(文件)都只能有一个public类。多了编译器就会给出出错信息。(内部类是可以为public的)
2. public类的名称必须完全与含有该编译单元的文件名称一致，包括大小写。否则编译时报错。
3. 如果编译单元内没有任何public类。那么，类名和文件名可以不一致。
4. 类既不可以是private的也不可以是protected。只能是包访问权限或public。如果不希望任何人对该类访问，可以把所有的构造器指定为private，但是有个例外，可以在该类的static成员内部创造。

```java
class Soup1 {
    private Soup1() {
    }

    // (1) Allow creation via static method:
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}
// 如果没有明确的构造器，会默认创建一个没有任何参数的构造器。如果自己编写了默认的构造器，那么就不会自动创建了。
```

##### 6.5 总结







