流程：

1. 老师说三个不同的素数。
3. 学生报数时，如果所报数字是第一个特殊数（3）的倍数，那么不能说该数字，而要说Fizz；如果所报数字是第二个特殊数（5）的倍数，那么要说Buzz；如果所报数字是第三个特殊数（7）的倍数，那么要说Whizz。
4. 学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如第一个特殊数和第二个特殊数的倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数，那么要说FizzBuzzWhizz。
5. 学生报数时，如果所报数字包含了第一个特殊数，那么也不能说该数字，而是要说相应的单词，比如本例中第一个特殊数是3，那么要报13的同学应该说Fizz。如果数字中包含了第一个特殊数，那么忽略规则3和规则4，比如要报35的同学只报Fizz，不报BuzzWhizz。
6. 学生依次报数， 其他返回所报的数

第一个Task：

1. 学生依次报数， 3返回Fizz， 4返回4，5返回Buzz，7返回Whizz.


第二个Task：

1. 重构之前的实现，发现bad smell. Replace Conditional with Polymorphism(以多态取代条件表达式)


第三个Task：

1. 基于多态，发现是Chain Of Responsibility模式


第四个Task：

1. 学生依次报数， 3和5的倍数FizzBuzz; 3和7的倍数返回FizzWhizz; 5和7的倍数返回Whizz; 3、5和7的倍数返回FizzBuzzWhizz


第五个Task：

1. 重构已有的测试，把相关的测试放在对应的类。


第六个Task：

1. 学生依次报数， 含3返回Fizz.

第七个Task：

1. 老师随意说三个特殊数字。重构已有的代码，去掉Magic Number.

第八个Task：

1. 学生根据自己的位置按照规则依次报数。



