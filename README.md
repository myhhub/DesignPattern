[设计模式（Design pattern）完整教程](https://www.ljjyy.com/archives/2022/07/100684.html)，通过使用场景、关键代码、优缺点、实际案例等方面来讲解设计模式及设计原则，把容易混淆的设计模式进行区别对比，保证完全弄懂掌握23种设计模式和设计模式的七大原则，不仅有助于通过软考，更有助于提高开发水平。

GOF设计模式根据目的划分为三种类型：

创建型模式：用于描述如何创建对象，在创建对象的同时隐藏了创建逻辑。避免使用 new 运算符直接实例化对象。

结构型模式：用于描述如何将类或对象按某种方式进行组合形成大的结构。

行为型模式：用于描述类或对象之间怎样相互协作完成单个对象无法单独完成的任务。

GOF设计模式根据作用范围划分为二种类型：

根据模式用于类还是对象上来分，可分为类模式和对象模式两种。

类模式：用于处理类与子类之间的关系，这些关系通过继承来建立，是静态的，在编译时刻便确定下来了。

对象模式：用于处理对象之间的关系，这些关系可以通过组合或聚合来实现，在运行时刻是可以变化的，更具动态性。

# 一. [设计模式目的](https://www.ljjyy.com/archives/2022/07/100684.html#%E4%B8%80-%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E7%9B%AE%E7%9A%84)

# 二. 设计模式

1.[工厂模式](https://www.ljjyy.com/archives/2022/07/100684.html#1-%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F)

2.[抽象工厂模式](https://www.ljjyy.com/archives/2022/07/100684.html#2-%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F)

3.[单例模式](https://www.ljjyy.com/archives/2022/07/100684.html#3-%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F)

4.[建造者模式](https://www.ljjyy.com/archives/2022/07/100684.html#4-%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F)

5.[原型模式](https://www.ljjyy.com/archives/2022/07/100684.html#5-%E5%8E%9F%E5%9E%8B%E6%A8%A1%E5%BC%8F)

6.[适配器模式](https://www.ljjyy.com/archives/2022/07/100684.html#6-%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F)

7.[桥接模式](https://www.ljjyy.com/archives/2022/07/100684.html#7-%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F)

8.[组合模式](https://www.ljjyy.com/archives/2022/07/100684.html#8-%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F)

9.[装饰模式](https://www.ljjyy.com/archives/2022/07/100684.html#9-%E8%A3%85%E9%A5%B0%E6%A8%A1%E5%BC%8F)

10.[外观模式](https://www.ljjyy.com/archives/2022/07/100684.html#10-%E5%A4%96%E8%A7%82%E6%A8%A1%E5%BC%8F)

11.[享元模式](https://www.ljjyy.com/archives/2022/07/100684.html#11-%E4%BA%AB%E5%85%83%E6%A8%A1%E5%BC%8F)

12.[代理模式](https://www.ljjyy.com/archives/2022/07/100684.html#12-%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F)

13.[责任链模式](https://www.ljjyy.com/archives/2022/07/100684.html#13-%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F)

14.[命令模式](https://www.ljjyy.com/archives/2022/07/100684.html#14-%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F)

15.[解释器模式](https://www.ljjyy.com/archives/2022/07/100684.html#15-%E8%A7%A3%E9%87%8A%E5%99%A8%E6%A8%A1%E5%BC%8F)

16.[迭代器模式](https://www.ljjyy.com/archives/2022/07/100684.html#16-%E8%BF%AD%E4%BB%A3%E5%99%A8%E6%A8%A1%E5%BC%8F)

17.[中介者模式](https://www.ljjyy.com/archives/2022/07/100684.html#17-%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F)

18.[备忘录模式](https://www.ljjyy.com/archives/2022/07/100684.html#18-%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F)

19.[观察者模式](https://www.ljjyy.com/archives/2022/07/100684.html#19-%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F)

20.[状态模式](https://www.ljjyy.com/archives/2022/07/100684.html#20-%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F)

21.[策略模式](https://www.ljjyy.com/archives/2022/07/100684.html#21-%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F)

22.[模版方法模式](https://www.ljjyy.com/archives/2022/07/100684.html#22-%E6%A8%A1%E7%89%88%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F)

23.[访问者模式](https://www.ljjyy.com/archives/2022/07/100684.html#23-%E8%AE%BF%E9%97%AE%E8%80%85%E6%A8%A1%E5%BC%8F)

# 三.设计模式类间关系
1.[关联关系(Association)](https://www.ljjyy.com/archives/2022/07/100684.html#1-%E5%85%B3%E8%81%94%E5%85%B3%E7%B3%BB-Association)

2. [聚合关系(Aggregation)](https://www.ljjyy.com/archives/2022/07/100684.html#2-%E8%81%9A%E5%90%88%E5%85%B3%E7%B3%BB-Aggregation)

3. [组合关系(Composition)](https://www.ljjyy.com/archives/2022/07/100684.html#3-%E7%BB%84%E5%90%88%E5%85%B3%E7%B3%BB-Composition)

4. [依赖关系(Dependency)](https://www.ljjyy.com/archives/2022/07/100684.html#4-%E4%BE%9D%E8%B5%96%E5%85%B3%E7%B3%BB-Dependency)

5. [泛化关系(Generalization)](https://www.ljjyy.com/archives/2022/07/100684.html#5-%E6%B3%9B%E5%8C%96%E5%85%B3%E7%B3%BB-Generalization)

6. [实现关系(Realization)](https://www.ljjyy.com/archives/2022/07/100684.html#6-%E5%AE%9E%E7%8E%B0%E5%85%B3%E7%B3%BB-Realization)


# 四.设计模式七大原则
1、[单一职责原则](https://www.ljjyy.com/archives/2022/07/100684.html#1%E3%80%81%E5%8D%95%E4%B8%80%E8%81%8C%E8%B4%A3%E5%8E%9F%E5%88%99)

2、[接口隔离原则](https://www.ljjyy.com/archives/2022/07/100684.html#2%E3%80%81-%E6%8E%A5%E5%8F%A3%E9%9A%94%E7%A6%BB%E5%8E%9F%E5%88%99)

3、[依赖倒转原则](https://www.ljjyy.com/archives/2022/07/100684.html#3%E3%80%81-%E4%BE%9D%E8%B5%96%E5%80%92%E8%BD%AC%E5%8E%9F%E5%88%99)

4、[里氏替换原则](https://www.ljjyy.com/archives/2022/07/100684.html#4%E3%80%81-%E9%87%8C%E6%B0%8F%E6%9B%BF%E6%8D%A2%E5%8E%9F%E5%88%99)

5、[开闭原则](https://www.ljjyy.com/archives/2022/07/100684.html#5%E3%80%81%E5%BC%80%E9%97%AD%E5%8E%9F%E5%88%99)

6、[迪米特法则](https://www.ljjyy.com/archives/2022/07/100684.html#6%E3%80%81-%E8%BF%AA%E7%B1%B3%E7%89%B9%E6%B3%95%E5%88%99)

7、[合成复用原则](https://www.ljjyy.com/archives/2022/07/100684.html#7%E3%80%81%E5%90%88%E6%88%90%E5%A4%8D%E7%94%A8%E5%8E%9F%E5%88%99)


# 五.涉及的知识

1.[volatile和synchronize](https://www.ljjyy.com/archives/2022/07/100684.html#1-volatile%E5%92%8Csynchronize)

2.[接口和抽象类](https://www.ljjyy.com/archives/2022/07/100684.html#2-%E6%8E%A5%E5%8F%A3%E5%92%8C%E6%8A%BD%E8%B1%A1%E7%B1%BB)

3.[内部类](https://www.ljjyy.com/archives/2022/07/100684.html#3-%E5%86%85%E9%83%A8%E7%B1%BB)

4.[桥接模式和适配器模式的区别](https://www.ljjyy.com/archives/2022/07/100684.html#4-%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F%E5%92%8C%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F%E7%9A%84%E5%8C%BA%E5%88%AB)

5.[代理模式和装饰模式的区别](https://www.ljjyy.com/archives/2022/07/100684.html#5-%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F%E5%92%8C%E8%A3%85%E9%A5%B0%E6%A8%A1%E5%BC%8F%E7%9A%84%E5%8C%BA%E5%88%AB)

6.[策略模式和命令模式的区别](https://www.ljjyy.com/archives/2022/07/100684.html#6-%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F%E5%92%8C%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F)

7.[策略模式和状态模式的区别](https://www.ljjyy.com/archives/2022/07/100684.html#7-%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F%E5%92%8C%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F)

8.[模板方法和策略模式的区别](https://www.ljjyy.com/archives/2022/07/100684.html#8-%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95%E5%92%8C%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F%E7%9A%84%E5%8C%BA%E5%88%AB)

9.[模板方法模式和工厂方法模式的区别](https://www.ljjyy.com/archives/2022/07/100684.html#9-%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F%E5%92%8C%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F%E7%9A%84%E5%8C%BA%E5%88%AB)
