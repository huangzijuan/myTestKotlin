fun main(args: Array<String>) {
    //定义一个Person类，有name 和 age 两属性
    //data class Person(var name: String, var age: Int)

    data class Person(var name: String, var age: Int) : Comparable<Person> {
        override fun compareTo(other: Person): Int {
            return this.age - other.age
        }
    }

    var personList: MutableList<Person> = mutableListOf()
    personList.add(Person("Jim", 12))
    personList.add(Person("A-Lin", 12))
    personList.add(Person("Tom", 11))
    personList.add(Person("Mary", 14))


    println("----排序前----")
    personList.forEach(::println)
    println("----排序后----")
    //按年龄排序
    //personList.sortBy ({ it.age })
    //或者写成
    /*personList.sortBy(Person::age)
    personList.forEach(::println)*/

    //______________________________________________________________________________________

    /*personList.sortWith(Comparator { o1, o2 ->
        o1.age - o2.age
    })
    personList.forEach(::println)*/

    //______________________________________________________________________________________

    personList.sort()
    personList.forEach(::println)
}

